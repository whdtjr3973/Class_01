package com.biz.exec;

import java.util.Random;

public class Exec_06 {

	public static void main(String[] args) {

		int[] intNum = new int[10];

		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(10) + 1;
		}
		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] == 5) {
				System.out.println("5는 " + (i + 1) + "번째 줄에 있습니다");
			}
		}
		// intNum에 저장된 값들중 5가 있으면
		// 몇번째에 있는지 찾아 보세요.
		System.out.println("=============================================");
		// intNum에 저장된 값들중에서 7이 최초에
		// 몇번째에서 나타나는지 찾아보세요
		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] == 7) {
				System.out.println("7은" + (i + 1) + "번째");
				break;
			}
		}
		System.out.println("=============================================");
		// intNum에 저장된 값들중에서 7이 최초에
		// 몇번째에서 나타나는지 찾아보세요
		int index;
		for (index = 0; index < intNum.length; index++) {
			System.out.print(intNum[index] + "\t");
		}
		System.out.println();
		for (index = 0; index < intNum.length; index++) {
			if (intNum[index] == 7) {
				System.out.println("7은" + (index + 1) + "번째");
				break;
			}
		}
			if(index>=intNum.length) {
				System.out.println("7은 없습니다");
			}

	
	}
}
