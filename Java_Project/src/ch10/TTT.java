package ch10;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TTT extends JPanel implements ActionListener {
	double A,B,C;
	JButton[][] buttons = new JButton[3][3];
	char[][] board = new char[3][3];
	private char turn ='x';

	public TTT(){
		setLayout(new GridLayout(3,3,5,5));
		Font f = new Font("Dialog",Font.ITALIC, 50);
		
		for (int i = 0 ; i<3 ; i++){
			for(int j=0 ; j<3 ; j++){
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(f);
				buttons[i][j].addActionListener(this);
				add(buttons[i][j]);
			}
		}
	}
	public void actionPerformed(ActionEvent e){
		for(int i = 0 ; i<3  ; i++ ){
			for( int j = 0 ; j < 3 ; j++){
				if(e.getSource()== buttons[i][j] && buttons[i][j].getText().equals(" ") == true){
					if(turn == 'X'){
						buttons[i][j].setText("X");
						turn = 'O';
					} else {
						buttons[i][j].setText("O");
						turn = 'X';
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new TTT());
		f.setSize(300,300);
		f.setVisible(true);
	}

}
