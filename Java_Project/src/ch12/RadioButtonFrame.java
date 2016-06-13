package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener {
	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;
	
	public RadioButtonFrame(){
		setTitle("���� ��ư �׽�Ʈ");
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� Ŀ��?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		sizePanel = new JPanel();
		small = new JRadioButton("small Size");
		medium = new JRadioButton("medium Size");
		large = new JRadioButton("large Size");
		
		
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.CENTER);
		resultPanel = new JPanel();
		text = new JLabel("ũ�Ⱑ ���� �Ǿ����ϴ�.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == small){
			text.setText("small ����");
		}
		if(e.getSource() == medium ){
			text.setText("medium ����");
		}
		if(e.getSource() == large){
			text.setText("large ����");
		}
	}
	public static void main(String[] args) {
		new RadioButtonFrame();
	}

}
