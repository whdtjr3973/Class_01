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
				System.out.println("5�� " + (i + 1) + "��° �ٿ� �ֽ��ϴ�");
			}
		}
		// intNum�� ����� ������ 5�� ������
		// ���°�� �ִ��� ã�� ������.
		System.out.println("=============================================");
		// intNum�� ����� �����߿��� 7�� ���ʿ�
		// ���°���� ��Ÿ������ ã�ƺ�����
		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] == 7) {
				System.out.println("7��" + (i + 1) + "��°");
				break;
			}
		}
		System.out.println("=============================================");
		// intNum�� ����� �����߿��� 7�� ���ʿ�
		// ���°���� ��Ÿ������ ã�ƺ�����
		int index;
		for (index = 0; index < intNum.length; index++) {
			System.out.print(intNum[index] + "\t");
		}
		System.out.println();
		for (index = 0; index < intNum.length; index++) {
			if (intNum[index] == 7) {
				System.out.println("7��" + (index + 1) + "��°");
				break;
			}
		}
			if(index>=intNum.length) {
				System.out.println("7�� �����ϴ�");
			}

	
	}
}
