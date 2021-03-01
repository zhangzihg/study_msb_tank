package com.zzh.test;

import com.zzh.tank.TankFrame;

public class TestTank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TankFrame tankFrame = new TankFrame();
		
		while(true) {
			Thread.sleep(40);
			tankFrame.repaint();
		}
	}

}
