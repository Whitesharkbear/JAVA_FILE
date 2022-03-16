



import java.awt.Color;
import java. awt. Container;
import javax. swing. JFrame;

public class GUI3 extends JFrame{

	GUI3()	{
		setTitle("세번째 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE)	;
	
	setSize(300,150);
	setVisible(true);
	}
	
public static void main(String args[]){

		new GUI3();
}
}