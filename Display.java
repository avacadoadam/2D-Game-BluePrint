package Graphics;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display extends Canvas{

	private static final long serialVersionUID = 1L;

	public Display(int width,int height, String title,Render render){
		Window(width,height,title,render);
	
	}
	
	private void Window(int width,int height, String title,Render render){
		JFrame frame = new JFrame(title);
		

	
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	    frame.add(render);
		frame.setVisible(true);
	}

}
