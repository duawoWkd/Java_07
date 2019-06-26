package com.biz.exec;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PayMentEx_03_ex {

	public static void main(String[] args) {

		FileWriter fileWriter;
		PrintWriter printWriter;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("급여입력>");
		String stpay = scan.nextLine();
		String memo = "src/com/biz/exec/PayMent.txt";

		int ppay = Integer.valueOf(stpay);
		int intMoney = 50000;
		int sw = 1;
		
		while(ppay > 5)	{
			
			int paper = (int)(ppay / intMoney);
			System.out.println(intMoney + "원권 : " + paper);
			ppay -= (paper * intMoney);
			if(sw > 0) intMoney = intMoney / 5;
			else intMoney = intMoney / 2;
			sw = sw * (-1);	  
			
			
		}
	}
}
