import java.awt.Color;
import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * 		��ġ�����ڰ� ���� �����̳�
 * 			������ ũ�⳪ ��ġ�� ������ų �� �ִ�.
 * 			��ġ�� ũ�Ⱑ ���÷� ���ؾ��� ��
 * 			��ġ�� ȿ���� ���� ���� ��
 * 			setLayout(null)
 * 			ũ��� ��ġ�� �ݵ�� �������־�� �Ѵ�.	
 * 
 */
public class GUI8 {

	GUI8(){
		
		Container c = getContentPane();
		c.setBackground(Color.BLACK);
		c.setLayout(null);
		
		JLabel la = new JLabel("�ȳ��ϼ���. ��ư�� �����ּ���.");
		la.setLocation(130,50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i = 1; i <=10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setLocation(i*15, i*15);
			btn.setSize(50, 20);
			c.add(btn);
		}
		
		
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new GUI8();
	}
	
}
