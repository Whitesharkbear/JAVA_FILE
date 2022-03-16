import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * 
 *  JPanel
 *  	컴포넌트 이면서 컨미테이너 여기도 하다.
 *  	다용도 FlowLayout
 */
public class JPanel1 extends JFrame{
	
	JPanel1(){
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		// FlowLayout 판넬 - 위
		JPanel p1 = new JPanel();
		c.add(p1,BorderLayout.NORTH);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.setBackground(Color.green);
		
		
		p1.add(new JButton("OPEN"));
		p1.add(new JButton("READ"));
		p1.add(new JButton("CLOSE"));
		
		// Null 판넬
		JPanel p2 = new JPanel();
		p2.setBackground(Color.gray);
		p2.setLayout(null);
		
		JLabel la1 = new JLabel("Hello");
		la1.setSize(50,60);
		la1.setLocation(100,30);
		p2.add(la1);
		
		JLabel la2 = new JLabel("Java");
		la2.setSize(60,50);
		la2.setLocation(50,100);
		p2.add(la2);
		
		JLabel la3 = new JLabel("Love");
		la3.setSize(60,50);
		la3.setLocation(200,250);
		p2.add(la3);
		c.add(p2, BorderLayout.CENTER);
		
		setSize(300,500);
		setVisible(true);
	}
	public static void main(String args[]) {
		new JPanel1();
	}

}
