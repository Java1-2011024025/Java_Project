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
		setTitle("라디오 버튼 테스트");
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피?");
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
		text = new JLabel("크기가 선택 되엇습니다.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == small){
			text.setText("small 선택");
		}
		if(e.getSource() == medium ){
			text.setText("medium 선택");
		}
		if(e.getSource() == large){
			text.setText("large 선택");
		}
	}
	public static void main(String[] args) {
		new RadioButtonFrame();
	}

}
