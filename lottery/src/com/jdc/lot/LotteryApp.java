package com.jdc.lot;

public class LotteryApp {

	public static void main(String[] args) {
		
		ThreeDLottery threeD = new ThreeDLottery();
		
		threeD.start();
		
		CommonUtil.getSc().close();
		
//		System.out.println(threeD.isRound(579, 957));
		
	}

}
