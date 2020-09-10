package chapter13;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyGameFrame3 extends JFrame {

	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	int planeX = 250;
	int planeY = 250;

	@Override
	public void paint(Graphics g) {  //自动被调用 g相当于一支画笔
		// TODO Auto-generated method stub
		//super.paint(g);
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		planeX++;
	}

	class PaintThread extends Thread {
		@Override
		public void run() {
			while(true) {
				System.out.println("breakpoint AAAA");
				repaint();

				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void launchFrame() {
		setTitle("airplane project");
		setVisible(true);
		setSize(500, 500);
		setLocation(300, 300);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		new PaintThread().start();
	}

	public static void main(String[] args) {
		MyGameFrame3 f = new MyGameFrame3();
		f.launchFrame();
	}
}