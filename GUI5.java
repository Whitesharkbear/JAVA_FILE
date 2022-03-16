import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 		Layout(레이아웃)
 * 				종류 
 * 					FlowLayout 
 *  						왼쪽으로 입력순으로 배치
 * 					BorderLayout 
 * 							 		북
 * 							서	   중앙		동
 * 									남 
 * 					GridLayout
 * 							행렬로 2차원 평면구조로 배치
 * 							왼쪽으로 입력순으로 배치
 * 					CardLayout
 * 							카드를 쌓듯이 겹쳐놓음.
 * 					nullLayout
 * 							직접 위치와 크기를 지정.
 * 
 * 		JFrame :  BorderLayout
 * 		JPanel :  FlowLayout
 * 
 * 		FlowLayout
 * 				생성자
 * 				    FlowwLayout()
 * 					FlowLayout(int align)
 * 					FlowLayout(int align, int hGap, int vGap)
 * 				속성
 * 					FlowLayout.LEFT/RIGHT/CENTER(디폴트)
 * 
 */
public class GUI5 extends JFrame {
	
	//생성자
	
	/*타이틀
	 *창닫기
	 *
	 *
	 *컨테이너
	 *레이아웃
	 *
	 *컴포넌트 생성
	 *담는다
	 *
	 *기본설정
	 *
	 */

	public GUI5() {
		setTitle("계산기 화면");
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