package com.example.rensyup207;

import android.content.Context;
import android.hardware.Camera;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.TextureView;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CameraView extends TextureView implements TextureView.SurfaceTextureListener, Camera.PictureCallback {
    private Camera camera;

    /* コンストラクタ */
    public CameraView(Context context) {
        super(context);
        setSurfaceTextureListener(this);    // TextureViewのリスナー（コールバックメソッド）はこのクラスに実装
    }

    /* Cameraから画像が取得できた時に呼ばれる */
    @Override
    public void onPictureTaken(byte[] data, Camera camera) {
        try {
            /* 画像のファイル名は日付を使用（jpeg形式) */
            SimpleDateFormat format = new SimpleDateFormat(
                    "'IMG'_yyyyMMdd_HHmmss'.jpg'", Locale.getDefault()
            );

            /* ファイル名の日付部分に現在の日付を設定する */
            String fileName = format.format(new Date(System.currentTimeMillis()));

            /* 外部ストレージのファイルパスを取得 */
            String path = Environment.getExternalStorageDirectory() + "/" + fileName;

            /* SDカードの上記のパスに、画像を保存（自作メソッド） */
            saveToSD(data,path);

            /* MediaScaner経由でファイルをギャラリーに反映 */
            MediaScannerConnection.scanFile(this.getContext(),
                    new String[] {path},
                    new String[]{"image/jpeg"},
                    null);

            /* Toastで撮影完了を表示 */
            Toast.makeText(getContext(),"撮影完了:" + path, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getContext(),e.toString(), Toast.LENGTH_LONG).show();
        }
        /* カメラプレビューを再開 */
        camera.startPreview();

    }

    /* TextureViewが使用できるようになったときに呼ばれる */
    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        /* カメラに接続してプレビュー開始 */
        try{
            camera = Camera.open();
            if (camera == null) camera = Camera.open(0);
            camera.setPreviewTexture(surface);
            camera.startPreview();
        } catch(Exception e) {
            return;
        }
    }

    /* TextureViewのサイズが変更されたときに呼ばれる */
    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

    }

    /* TextureViewの破棄時に呼ばれる */
    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        /* カメラプレビューの停止とインスタンスの破棄 */
        camera.setPreviewCallback(null);
        camera.stopPreview();
        camera.release();
        camera=null;
        return true;
    }

    /* TextureViewが更新されたときに呼ばれる */
    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {

    }

    /* このビューがタッチされたときに呼び出されるメソッド */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        /* タッチイベントのうち、押されたときだったら */
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            camera.takePicture(null,null,this); // カメラから画像を取得
        }
        return true;
    }

    private void saveToSD(byte[] w, String path) throws Exception {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path);
            out.write(w);
            out.close();
        } catch( Exception e) {
        }
    }
}
