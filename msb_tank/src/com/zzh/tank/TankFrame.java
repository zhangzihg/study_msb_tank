package com.zzh.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	int x = 175, y = 300;
	public static final int SPEED = 10;
	private Dir dir = Dir.DOWN;

	public TankFrame() {
		setSize(400, 600);
		setVisible(true);
		setResizable(false);
		setTitle("tank war");
		this.addWindowListener(new WindowAdapter() {
			// 关闭窗口
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.addKeyListener(new MyKeyListener());
	}

	@Override
	public void paint(Graphics g) {

		g.fillRect(x, y, 50, 50);

		changPosition();
	}

	public void changPosition() {
		switch (dir) {
		case DOWN:
			y += SPEED;
			break;
		case UP:
			y -= SPEED;
			break;
		case LEFT:
			x -= SPEED;
			break;
		case RIGHT:
			x += SPEED;
			break;
		}
	}

	// 创建一个实现KeyListener接口的内部类来接收键盘的按键，因为这个类只有这个类使用所以不用在外部创建
	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch (keyCode) {
				case KeyEvent.VK_LEFT:
					dir = Dir.LEFT;
					break;
				case KeyEvent.VK_RIGHT:
					dir = Dir.RIGHT;
					break;
				case KeyEvent.VK_UP:
					dir = Dir.UP;
					break;
				case KeyEvent.VK_DOWN:
					dir = Dir.DOWN;
					break;
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("执行 " + e.getKeyCode());

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
