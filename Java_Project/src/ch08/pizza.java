package ch08;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pizza extends JFrame{
	
	public pizza(){
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("pizza");
		
		JPanel A= new JPanel();
		JPanel B= new JPanel();
		JPanel C= new JPanel();
		
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�.");
		B.add(label1);
		
		JButton button1 = new JButton("�޺� ����");
		JButton button2 = new JButton("�������� ����");
		JButton button3 = new JButton("�Ұ�� ����");
		C.add(button1);
		C.add(button2);
		C.add(button3);
		
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		C.add(label2);
		C.add(field1);
		
		A.add(B);
		A.add(C);
		add(A);
		setVisible(true);
		
	}

}
