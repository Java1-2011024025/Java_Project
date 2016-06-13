package ch08;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Absolute extends JFrame {
	JButton b1;
	private JButton b2, b3;
	
	public Absolute(){
		setTitle("Absolute Position Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		JPanel p = new JPanel();
		p.setLayout(null); // 절대 관리자를 지정하지 않는다.
		
		b1 = new JButton("Button #1");
		p.add(b1);
		b2 = new JButton("Button #2");
		p.add(b2);
		b3 = new JButton("Button #3");
		p.add(b3);
		
		b1.setBounds(20,5,95,30);
		b2.setBounds(55,45,105,70);
		b3.setBounds(180,15,105,90);
		add(p);
		setVisible(true);
	}
	
	
}
