

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI4 extends JFrame {
	GUI4(){
	setTitle("네번째 프레임");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	//컨텐트팬 설정
			Container contentPane	= getContentPane();
			contentPane.setBackground(Color.orange);
			
	//레이아웃 설정		
			contentPane.setLayout(new FlowLayout());
			
			//컴포넌트 생성
			JButton btn1 = new JButton("버튼1");
			JButton btn2 = new JButton("버튼2");
			
			
			Label label = new Label("22 89");
			label.setBackground (Color .YELLOW) ;		
			
	}	
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			new GUI4();
		
		
		
		
	}
	
	}
