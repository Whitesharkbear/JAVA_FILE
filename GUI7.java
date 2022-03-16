import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;

/*
 * 		GrideLayout
 * 			»ý¼ºÀÚ
 * 				GridLayout(int row, int cols, int hGap, int vGap)
 * 				GridLayout(int row, int cols)
 * 				GridLayout()				
 * 
 */
public class GUI7 {
	
	public GUI7(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,3));
		
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("+"));
		c.add(new JButton("-"));
		
		c.setSize(300,200);
		c.setVisible(true);
	}
	public static void main(String args[]) {
		new GUI7();
	}

}
