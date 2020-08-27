import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *　　　ウインドウクラス MyWindow 
 *
 *		イベントリスナーを実装
 */
public class MyFrame extends JFrame {


	/**
	 *　　　イベントリスナークラスを作成
	 */
	public class MyActionListener implements ActionListener {

		/**
		 * イベントハンドラー
		 * 		ボタンが押されたら実行する処理を記述
		 */
		public void actionPerformed(ActionEvent e){
			if (checkbox.isSelected() == true) {
				text.setText("Hello");
			} else {
				text.setText("こんにちわ");
			}
		}
	}

	// コントールのクラス型変数をインスタンスフィールドに変更
	JButton button;
	JTextField text;
	JCheckBox checkbox;

	/**
	 *　　　　コンスタラクタ
	 */
	public MyFrame(String title){


		//------------------------------------------------------
		//      最低限の設定
		//------------------------------------------------------
		// ウインドウを見えるように設定
		//setVisible(true);    // 一番下へ移動
		// ウインドウサイズ（x,y)
		setSize(250,160);
		// 「閉じる」ボタン押下時の動作を設定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// タイトル設定
		setTitle(title);
		//------------------------------------------------------

		//------------------------------------------------------
		//      コントロールを配置設定
		//------------------------------------------------------
		// テキストフィールドのインスタンスを作成し、位置大きさを指定する。
		text = new JTextField("");
		text.setBounds(80, 20, 100, 20);  // テキストフィールドの位置大きさ
					                      // (x,   y,  幅, 高さ)

		// チェックボックスのインスタンスを作成し、位置大きさを指定する。
		checkbox = new JCheckBox("English");
		checkbox.setBounds(80, 50, 80, 20);	

		// ボタンのインスタンスを作成し、位置大きさを指定する。
		button = new JButton("挨拶");
		button.setBounds(80, 80, 60, 25);

		// デフォルトのLayoutをやめる
		setLayout(null);    

		// コントロールのオブジェクトををウインドウに追加
		add(text);
		add(checkbox);		     
 		add(button);

		// ウインドウを見えるように設定
		setVisible(true);

		//------------------------------------------------------
		//      ボタンにイベントリスナーを設定
		//------------------------------------------------------
		MyActionListener listener = new MyActionListener();
		button.addActionListener(listener);

	}



}

