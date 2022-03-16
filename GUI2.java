


import java.awt.Color;
import javax.swing.JFrame;


public class GUI2 extends JFrame{

	GUI2(){
	
	setTitle("두번째프레임")	;
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(600,600);
			setBackground(Color.BLUE);
			setLocation(100, 100) ;
			setVisible(true);
}


public static void main(String[] args){
			new GUI2();


}
}