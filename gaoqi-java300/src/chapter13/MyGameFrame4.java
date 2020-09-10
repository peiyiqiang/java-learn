package chapter13;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class MyGameFrame4 extends Frame {

	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");

	Plane plane = new Plane(planeImg, 250, 250);
	Shell[] shells = new Shell[50];
	Explode explode;

	Date startTime = new Date();
	Date endTime;
	int period;

	@Override
	public void paint(Graphics g) {  //自动被调用 g相当于一支画笔
		// TODO Auto-generated method stub
		//super.paint(g);
		Color c = g.getColor();
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);
		for(int i = 0; i < shells.length; i++) {
			shells[i].draw(g);

			boolean hit = shells[i].getRect().intersects(plane.getRect());
			if(hit) {
				plane.live = false;
				if(explode == null) {
					explode =new Explode(plane.x, plane.y);
					endTime = new Date();
					period = (int)((endTime.getTime() - startTime.getTime()) / 1000);
				}
				explode.draw(g);
			}

			if(!plane.live) {
				g.setColor(Color.RED);
				Font f = new Font("宋体", Font.BOLD, 50);
				g.drawString("时间：" + period + "秒", (int)plane.x, (int)plane.y);
			}
		}
		g.setColor(c);
	}

	class PaintThread extends Thread {
		@Override
		public void run() {
			while(true) {
				//System.out.println("breakpoint AAAA");
				repaint();

				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	class KeyMonitor extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			//System.out.println(e.getKeyCode());
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//System.out.println(e.getKeyCode());
			plane.minusDirection(e);
		}

	}

	public void launchFrame() {
		setTitle("airplane project");
		setVisible(true);
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		setLocation(300, 300);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		new PaintThread().start();
		addKeyListener(new KeyMonitor());

		for(int i = 0; i < shells.length; i++) {
			shells[i] = new Shell();
		}
	}

	public static void main(String[] args) {
		MyGameFrame4 f = new MyGameFrame4();
		f.launchFrame();
	}

	private Image offScreenImage = null;

	public void update(Graphics g) {
		if(offScreenImage == null)
			offScreenImage = this.createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度

		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}
}