import java.awt.Color;
import java.awt.Container;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * 		배치관리자가 없는 컨테이너
 * 			임의의 크기나 위치에 지정시킬 수 있다.
 * 			위치와 크기가 수시로 변해야할 때
 * 			겹치는 효과를 내고 싶을 때
 * 			setLayout(null)
 * 			크기와 위치를 반드시 지정해주어야 한다.	
 * 
 */
public class GUI8 {

	GUI8(){
		
		Container c = getContentPane();
		c.setBackground(Color.BLACK);
		c.setLayout(null);
		
		JLabel la = new JLabel("안녕하세요. 버튼을 눌러주세요.");
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
