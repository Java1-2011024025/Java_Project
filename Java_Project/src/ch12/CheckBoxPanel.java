package ch12;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxPanel extends JPanel implements ItemListener {
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = {"aaa","kkk","bbb"};
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];

	public CheckBoxPanel(){
		super(new GridLayout(0,4));
		for(int i = 0; i<3; i++){
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruits[i]+".png");
			icon[i] = new ImageIcon(fruits[i]+".png");
		}
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		for(int i =0 ; i<3 ; i++)
			checkPanel.add(buttons[i]);
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
	}
	public void itemStateChanged(ItemEvent e){
		ImageIcon image = null;
		Object source = e.getItemSelectable();
		for(int i = 0 ; i<3 ; i++){
			if(source == buttons[i]){
				if(e.getStateChange()==ItemEvent.DESELECTED)
					pictureLabel[i].setIcon(null);
				else 
					pictureLabel[i].setIcon(icon[i]);
			}
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckBoxPanel panel = new CheckBoxPanel();
		panel.setOpaque(true);
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}

}
