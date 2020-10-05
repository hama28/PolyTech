package com.example.rensyup207;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/*******************************************************
  *  MainActivityはAppCompatActivityではなく、Activityを継承
 ********************************************************/
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* window(画面)の管理インスタンスを取得し、フラグをクリア */
        getWindow().clearFlags(
                WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        // 全画面を強制しないようにするフラグをクリア

        /* window(画面)の管理インスタンスを取得し、フラグを追加  */
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // フルスクリーンに変更

        /* タイトルバーを隠す */
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        /* 画面表示は、CameraViewクラスを使用（レイアウトファイルは使わない */
        setContentView(new CameraView(this));
    }
}
