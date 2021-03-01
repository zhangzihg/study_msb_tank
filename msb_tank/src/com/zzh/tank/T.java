package com.zzh.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Frame f = new Frame();
			f.setVisible(true);
			f.setSize(600, 800);
			f.setResizable(false);
			f.setTitle("tank war");
			f.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
	}

}
