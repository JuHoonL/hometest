package com.biz.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 진수변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		
		
		while(true) {
			List<Integer> strTen = new ArrayList();
			System.out.println("10진수로 변환할 2진수를 작성해주세요");
			System.out.print("끝내기(-1)>> ");
			String scanF = scan.nextLine();
			if(scanF.equals("-1")) return;
			String[] splitscan = scanF.split("");
			for(int i = 0 ; i < splitscan.length ; i ++ ) {
				int a = Integer.valueOf(splitscan[i]);
				for(int j = splitscan.length-1 ; j > i ; j --) {
					 a *= 2;
				}
				strTen.add(a);
			}
			
			int b = 0;
			for(int t : strTen) {
				b += t;
			}
			System.out.println(scanF + "을(를) 10진수로 변환한 결과 : " + b);
		}
		
		
		
	}

}
