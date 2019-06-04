package com.biz.model;

import java.util.Random;

public class StudentArray {

	/*
	 * Student Ŭ������ ��ü�迭�� �����ϰ�
	 * ������ �л� ���������͸� ����
	 * return �ϴ� method�� ����
	 */
	public Student[] makeScore(int stdLen) {

		// ������ �迭��
		// �迭�� �ʱ�ȭ�ϸ� �� �������� 0���� ����
		int[] intA = new int[10];

		// ���ڿ��� �迭��
		// �迭�� �ʱ�ȭ�ϸ� �� �������� ""���� ����
		String[] strA = new String[10];

		// StudentŬ���� ��ü �迭 10���� ����
		// ���ุ ���ְ� ����� �غ� �Ǿ����� ����
		Student[] stdScore = new Student[stdLen];

		// ������ ��Ÿ �ٸ� Ŭ�������� �̿���
		// ��ü �迭�� ���(�б�,����)����
		// �� �迭 ��Ҹ� ���������� �ʱ�ȭ�ϴ� �ڵ带 �����ؾ��Ѵ�.

		// ������ ������ ��������� ���� �߻��⸦ ����Ѵ�.
		Random rnd = new Random();

		// for �ݺ����� ����ؼ� ���� �ڵ带 10�� �����Ѵ�.
		for (int i = 0; i < stdScore.length; i++) {
			stdScore[i] = new Student();
			stdScore[i].intNum = i + 1;

			stdScore[i].intKor = rnd.nextInt(50) + 51;
			stdScore[i].intEng = rnd.nextInt(50) + 51;
			stdScore[i].intMath = rnd.nextInt(50) + 51;
		}
		return stdScore;
	} // makeScore�� ������ �κ�
	
	public void viewScore(Student[] stdScore) {
		
		System.out.println("=====================================================");
		System.out.println("�й�\t����\t����\t����\t����\t���");

		for (int i = 0; i < stdScore.length; i++) {
//			int sum = intKor[i];
//			sum = intEng[i];
//			sum = intMath[i];

			int sum = stdScore[i].intKor + stdScore[i].intEng + stdScore[i].intMath;
			float fAvg = sum / 3.0f;

			System.out.print(stdScore[i].intNum + "\t");

			System.out.print(stdScore[i].intKor + "\t");
			System.out.print(stdScore[i].intEng + "\t");
			System.out.print(stdScore[i].intMath + "\t");
			System.out.print(sum + "\t");
			System.out.print(fAvg);

			System.out.println();

		}
		System.out.println("=====================================================");

	}
}
