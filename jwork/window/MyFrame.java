import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *�@�@�@�E�C���h�E�N���X MyWindow 
 *
 *		�C�x���g���X�i�[������
 */
public class MyFrame extends JFrame {


	/**
	 *�@�@�@�C�x���g���X�i�[�N���X���쐬
	 */
	public class MyActionListener implements ActionListener {

		/**
		 * �C�x���g�n���h���[
		 * 		�{�^���������ꂽ����s���鏈�����L�q
		 */
		public void actionPerformed(ActionEvent e){
			if (checkbox.isSelected() == true) {
				text.setText("Hello");
			} else {
				text.setText("����ɂ���");
			}
		}
	}

	// �R���g�[���̃N���X�^�ϐ����C���X�^���X�t�B�[���h�ɕύX
	JButton button;
	JTextField text;
	JCheckBox checkbox;

	/**
	 *�@�@�@�@�R���X�^���N�^
	 */
	public MyFrame(String title){


		//------------------------------------------------------
		//      �Œ���̐ݒ�
		//------------------------------------------------------
		// �E�C���h�E��������悤�ɐݒ�
		//setVisible(true);    // ��ԉ��ֈړ�
		// �E�C���h�E�T�C�Y�ix,y)
		setSize(250,160);
		// �u����v�{�^���������̓����ݒ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �^�C�g���ݒ�
		setTitle(title);
		//------------------------------------------------------

		//------------------------------------------------------
		//      �R���g���[����z�u�ݒ�
		//------------------------------------------------------
		// �e�L�X�g�t�B�[���h�̃C���X�^���X���쐬���A�ʒu�傫�����w�肷��B
		text = new JTextField("");
		text.setBounds(80, 20, 100, 20);  // �e�L�X�g�t�B�[���h�̈ʒu�傫��
					                      // (x,   y,  ��, ����)

		// �`�F�b�N�{�b�N�X�̃C���X�^���X���쐬���A�ʒu�傫�����w�肷��B
		checkbox = new JCheckBox("English");
		checkbox.setBounds(80, 50, 80, 20);	

		// �{�^���̃C���X�^���X���쐬���A�ʒu�傫�����w�肷��B
		button = new JButton("���A");
		button.setBounds(80, 80, 60, 25);

		// �f�t�H���g��Layout����߂�
		setLayout(null);    

		// �R���g���[���̃I�u�W�F�N�g�����E�C���h�E�ɒǉ�
		add(text);
		add(checkbox);		     
 		add(button);

		// �E�C���h�E��������悤�ɐݒ�
		setVisible(true);

		//------------------------------------------------------
		//      �{�^���ɃC�x���g���X�i�[��ݒ�
		//------------------------------------------------------
		MyActionListener listener = new MyActionListener();
		button.addActionListener(listener);

	}



}

