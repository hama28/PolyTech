package com.example.rensyup203;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Camera camera;  //Cameraクラスは非推奨のため、取り消し線が入るが使用可能
    // 非推奨ではなく削除になったものは使えない
    private Bitmap bitmap;  //カメラから画像として取得したときに格納


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* buttonが押されたら */
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* 現在のカメラの画像を取り込む */
                camera.takePicture(null, null, new Camera.PictureCallback() {
                    /* カメラからの画像が取得できたときに呼び出されるメソッド */
                    @Override
                    public void onPictureTaken(byte[] data, Camera camera) {
                        /* カメラからの取得画像（バイト配列）をビットマップ画像に変換 */
                        bitmap = BitmapFactory.decodeByteArray(data,0,data.length);

                        /* ImageViewのインスタンスを取得 */
                        ImageView img = (ImageView)findViewById(R.id.imageView);

                        /* ビットマップ画像をImageViewにセット */
                        img.setImageBitmap(bitmap);
                        /* 再度カメラからのプレビュー開始 */
                        camera.startPreview();
                    }
                });
            }
        });

        /* カメラから画像を取込み。TextureViewに表示させるためのリスナーを設定 */
        TextureView textureview = (TextureView)findViewById(R.id.textureView);
        textureview.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* TextureViewのTexture(見た目)に貼り付ける準備ができたら呼ばれるメソッド */
            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
                /* カメラの使用準備と取込み */
                try {
                    camera = Camera.open(); // カメラを開く（起動する）
                    if (camera==null) camera = Camera.open(0);
                    // camera.open()で取得できなければ、引数（CameraId）を指定
                    // 基本は0番でアウトカメラ、1番でインカメラ(ハードウェア依存)

                    camera.setPreviewTexture(surface);  // 取込み画像の表示先を指定
                    camera.startPreview();  // カメラからの取込み開始
                } catch (IOException e){
                    return;
                }
            }

            /* TextureViewの表示のサイズ変更があった場合に呼ばれるメソッド */
            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
            }

            /* TextureViewが破棄されるときに呼ばれるメソッド */
            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                camera.setPreviewCallback(null);
                // cameraのプレビュー完了時のコールバックメソッドを破棄
                // 今回は未使用だが念のため
                camera.stopPreview();   // プレビューの停止
                camera.release();   // カメラのとの接続を解除
                camera=null;        // カメラインスタンスを開放
                return false;
            }

            /* TextureViewの更新時に呼ばれるメソッド */
            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surface) {
            }
        });
    }
}