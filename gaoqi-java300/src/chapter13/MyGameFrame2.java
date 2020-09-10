package chapter13;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyGameFrame2 extends JFrame {

	@Override
	public void paint(Graphics g) {  //自动被调用 g相当于一支画笔
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawLine(100, 100, 300, 300);
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
	}

	public static void main(String[] args) {
		MyGameFrame2 f = new MyGameFrame2();
		f.launchFrame();
	}
}