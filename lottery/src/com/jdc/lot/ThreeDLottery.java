package com.jdc.lot;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class ThreeDLottery {
	
	private static NumberFormat FT = new DecimalFormat("#,###");

	public void start() {
		// 3D open
		
		CommonUtil.printHeaderFooter("Welcome 3D Lottery App");
		
		do {
			
			System.out.println();
			
			String originalDigit = null;
			
			Random ran = new Random();
			
			originalDigit = String.valueOf(ran.nextInt(1000));
			
			if(Integer.valueOf(originalDigit) < 10)
				originalDigit = "00".concat(originalDigit);
			
			if(Integer.valueOf(originalDigit) < 100)
				originalDigit = "0".concat(originalDigit);
			
			// get user 3D
			String userDigit = CommonUtil.getString("Enter your 3D number: ");
			
			// get user play amount
			int amount = CommonUtil.getInt("Enter amount: ");
			
			System.out.println();
			
			// tell original digit
			CommonUtil.printHeaderFooter("Open 3D Lottery");
			System.out.println();
			System.out.println("3D number is: " + originalDigit);
			System.out.println();
		
			String tenAmount = FT.format(getTimeTimes(amount));
			String fiveHundredAmount = FT.format(getfiveHundredTimes(amount));
			
			// around 3D or tut (user amount 10 times)
			if(isTut(Integer.parseInt(userDigit), Integer.parseInt(originalDigit)) ||
					isRound(Integer.parseInt(userDigit), Integer.parseInt(originalDigit))
					)
				
				System.out.println("Great! you win " + tenAmount + ".");
			
			else if(Integer.parseInt(userDigit) == Integer.parseInt(originalDigit))
				
				System.out.println("Congratulation! you win " + fiveHundredAmount + ".");
			// user 3D matches 3D (500 times)
			else
				System.out.println("Sorry! you lose. Try again later.");
		
			System.out.println();
		} while(CommonUtil.getString("Do you want to continue?(y/others): ").equalsIgnoreCase("y"));
			// want to continues
		
		System.out.println();
		CommonUtil.printHeaderFooter("Thanks for playing 3D Lottery App");
	
	}
		
	public boolean isRound(int userDigit, int oriDigit) {
		boolean result = false;	
		
		int userFirst = getfirstDigit(userDigit);
		int userSecond = getSecondDigit(userDigit);
		int userThird = getThirdDigit(userDigit);
		int oriFirst = getfirstDigit(oriDigit);
		int oriSecond = getSecondDigit(oriDigit);
		int oriThird = getThirdDigit(oriDigit);
		
		if(
		   (userFirst == oriFirst || userFirst == oriSecond || userFirst == oriThird) &&
		   (userSecond == oriFirst || userSecond == oriSecond || userSecond == oriThird) &&
		   (userThird == oriFirst || userThird == oriSecond || userThird == oriThird)
				)
			result = true;
			
		return result;
	}
	
	public boolean isTut(int userDigit, int oriDigit) {
		return userDigit + 1 == oriDigit || userDigit - 1 == oriDigit;
	}
	
	public int getfirstDigit(int digit) {
		return digit / 100;
	}
	
	public int getSecondDigit(int digit) {
		return (digit % 100) / 10;
	}

	public int getThirdDigit(int digit) {
		return (digit % 100) % 10;
	}
	
	public int getTimeTimes(int amount) {
		return amount * 10;
	}
	
	public int getfiveHundredTimes(int amount) {
		return amount * 500;
	}
	
}
