import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 		Layout(���̾ƿ�)
 * 				���� 
 * 					FlowLayout 
 *  						�������� �Է¼����� ��ġ
 * 					BorderLayout 
 * 							 		��
 * 							��	   �߾�		��
 * 									�� 
 * 					GridLayout
 * 							��ķ� 2���� ��鱸���� ��ġ
 * 							�������� �Է¼����� ��ġ
 * 					CardLayout
 * 							ī�带 �׵��� ���ĳ���.
 * 					nullLayout
 * 							���� ��ġ�� ũ�⸦ ����.
 * 
 * 		JFrame :  BorderLayout
 * 		JPanel :  FlowLayout
 * 
 * 		FlowLayout
 * 				������
 * 				    FlowwLayout()
 * 					FlowLayout(int align)
 * 					FlowLayout(int align, int hGap, int vGap)
 * 				�Ӽ�
 * 					FlowLayout.LEFT/RIGHT/CENTER(����Ʈ)
 * 
 */
public class GUI5 extends JFrame {
	
	//������
	
	/*Ÿ��Ʋ
	 *â�ݱ�
	 *
	 *
	 *�����̳�
	 *���̾ƿ�
	 *
	 *������Ʈ ����
	 *��´�
	 *
	 *�⺻����
	 *
	 */

	public GUI5() {
		setTitle("���� ȭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		//contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		//contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));
		contentPane.setBackground(Color.orange);
		
		JButton btn1 = new JButton("ADD");
		JButton btn2 = new JButton("SUB");
		JButton btn3 = new JButton("MUL");
		JButton btn4 = new JButton("DIV");
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		contentPane.add(btn4);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new GUI5();
	
	}
}