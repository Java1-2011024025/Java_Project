package final2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FinalTest extends JFrame implements ActionListener {
	
	private JRadioButton calculator1, painting1, tictactoe1;
	private JLabel text;
	private JPanel topPanel, sizePanel;
	
	class calculator extends JFrame{
		private JButton button;
		private JTextField text, result;
		
		public calculator(){
			setSize(300,130);
			setTitle("제곱 계산하기");
			ButtonListener listener = new ButtonListener();
			
			JPanel panel = new JPanel();
			panel.add(new JLabel("숫자 입력:"));
			text = new JTextField(15);
			text.addActionListener(listener);
			panel.add(text);
			
			panel.add(new JLabel("제곱한 값:"));
			result = new JTextField(15);
			result.setEditable(true);
			panel.add(result);
			
			button = new JButton("OK");
			button.addActionListener(listener);
			panel.add(button);
			add(panel);
			
			setVisible(true);
		}
		
		private class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==button || e.getSource()== text){
					String name = text.getText();
					int value = Integer.parseInt(name);
					result.setText(" "+value*value);
					text.requestFocus();
				}
			}
		}
		
	}

	class MyPanel extends JPanel{
		BufferedImage img = null;
		int img_x = 75, img_y = 75;
	
		public MyPanel(){
			try{
				img = ImageIO.read(new File("lii.jpg"));
			} catch(IOException e){
				System.out.println("no image");
				System.exit(1);
			}
			addKeyListener(new KeyListener(){
				public void keyPressed(KeyEvent e){
					int keyCode = e.getKeyCode();
					switch(keyCode){
						case KeyEvent.VK_UP: img_y -= 10; break;
						case KeyEvent.VK_DOWN: img_y += 10; break;
						case KeyEvent.VK_LEFT: img_x -= 10; break;
						case KeyEvent.VK_RIGHT: img_x += 10; break;
					}
					repaint();
				}
				public void keyReleased(KeyEvent arg0){}
				public void keyTyped(KeyEvent arg0){}
			});
			this.requestFocus();
			setFocusable(true);
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(img, img_x, img_y, null);
		}
	}	

	class painting1 extends JFrame{
	
		public painting1(){
			setSize(300,300);
			setTitle("리락쿠마");
			add(new MyPanel());
			setVisible(true);
		}
	}
	
	class TPanel extends JPanel {
		double A, B, C;
		JButton[][] buttons = new JButton[3][3];
		char[][] board = new char[3][3];
		private char turn = 'X';

		public TPanel() {
			int i, j;
			setLayout(new GridLayout(3, 3, 5, 5));
			Font f = new Font("Diglog", Font.ITALIC, 50);

			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					buttons[i][j] = new JButton(" ");
					buttons[i][j].setFont(f);
					buttons[i][j].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) { 
							int k,l;
							for (k = 0; k < 3; k++) {
								for (l = 0; l < 3; l++) {
									if (e.getSource() == buttons[k][l] && buttons[k][l].getText().equals(" ") == true) {
										if (turn == 'X') {
											buttons[k][l].setText("X");
											turn = 'O';
										} else {
											buttons[k][l].setText("0");
											turn = 'X';
										}
									}
								}
							}
						}
					});
					add(buttons[i][j]);
				}
			}
		}

	}

	public class tictactoe1 extends JFrame {
		public tictactoe1() {
			setSize(300, 300);
			add(new TPanel());
			setTitle("Tic-Tac-Toe");
			setVisible(true);
		}
		
	}
	
	public FinalTest(){
		setSize(300,100);
		setTitle("기말고사");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		text = new JLabel("메뉴를 선택하세요.");
		topPanel.add(text);
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		calculator1 = new JRadioButton("계산기");
		painting1 = new JRadioButton("그림 옮기기");
		tictactoe1 = new JRadioButton("틱택토");
		
		ButtonGroup size = new ButtonGroup();
		size.add(calculator1);
		size.add(painting1);
		size.add(tictactoe1);
		
		calculator1.addActionListener(this);
		painting1.addActionListener(this);
		tictactoe1.addActionListener(this);
		
		sizePanel.add(calculator1);
		sizePanel.add(painting1);
		sizePanel.add(tictactoe1);
		add(sizePanel, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == calculator1){
			new calculator();		
		}
		else if(e.getSource()==painting1){
			new painting1();
		}
		else {
			new tictactoe1();
		}
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalTest();
	}

}
