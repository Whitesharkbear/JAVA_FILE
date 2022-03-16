import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
/*
 * 	BorderLayout
 * 		NORTH , EAST , WEST, SOUTH, CENTER
 * 		add() �ݵ�� �ϳ� �־���Ѵ�.
 * 		������
 * 			BoarderLayout (int hGap, int vGap)
 * 			BoarderLayout ()
 * 		�Ӽ�
 * 			BorderLayout.EAST
 */

public class GUI6 extends JFrame{

	
	GUI6(){
		setTitle("Border ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(10,10));
		contentPane.setBackground(Color.green);
		
		contentPane.add(new Button("DIV"), BorderLayout.WEST);
		contentPane.add(new Button("MUL"), BorderLayout.EAST);
		contentPane.add(new Button("ADD"), BorderLayout.NORTH);
		contentPane.add(new Button("SUB"), BorderLayout.SOUTH);
		contentPane.add(new Button("Caculator"), BorderLayout.CENTER);
		
		
	}
	public static void main(String args[]) {
		new GUI6();
}
}