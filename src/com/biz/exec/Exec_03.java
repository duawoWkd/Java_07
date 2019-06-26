package com.biz.exec;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력>>");

		String strYear = scan.nextLine();
		int intYear = Integer.valueOf(strYear);

		if (intYear % 4 == 0) {
			System.out.println(intYear + " 1차후보");
			if (intYear % 100 != 0 || intYear % 400 ==0) {
				System.out.println(intYear + "2차후보");
			}
		}
		
		if(intYear % 4 == 0) {
			if(intYear % 44 == 0 && intYear % 100 !=0) {
				
			}else if(intYear % 4 ==0 && intYear % 400 == 0){
				System.out.println("윤년");
			}
		}
		
		if(intYear % 4 == 0 && intYear % 100 != 0 
						|| intYear % 400 == 0) {
			System.out.println("윤년");
		}
	}
}