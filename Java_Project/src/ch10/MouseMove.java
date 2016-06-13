package ch10;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Mypanel0 extends JPanel{
	BufferedImage img = null;
	int img_x = 0 , img_y = 0;
	
	public Mypanel0(){
		try {
			img = ImageIO.read(new File("lii.jpg"));
		} catch (IOException e){
			System.out.println("no image");
			System.exit(1);
		}
		
		addMouseListener(new MouseListener(){
			public void mousePressed(MouseEvent e){
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
			public void mouseReleased(MouseEvent e){}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
			public void mouseClicked(MouseEvent e){}
		});
}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y,null);
	}
}


public class MouseMove extends JFrame{
	public MouseMove(){
		add(new Mypanel0());
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseMove();
	}

}
