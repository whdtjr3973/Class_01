package com.biz.exec;

import com.biz.model.Student;

public class Exec_01 {

	public static void main(String[] args) {

		/*
		 *  Java������ ���α׷� ���� ���������
		 *  �����͵��� �޼��忡 �����Ͽ� ó���� �Ҷ�
		 *  �ʿ��� �����Ͱ�����ŭ �Ű������� �����ϰ�
		 *  ������ �µ��� ��ġ������ �� �ؼ� 
		 *  �޼��忡�� ���� �� �־�� �Ѵ�.
		 *  
		 *  �׷���, �����Ͱ� ������ ȥ���� �ͼ� 
		 *  ������ �����Ͱ� ���� �Ǵ� ��찡 ���� �߻��Ѵ�.
		 *  ����, �Ű������� ������ ��Ȯ�� Ȯ���ϱⰡ �����
		 *  
		 */
		view(1, "ȫ�浿", 3, "�İ���");
		view(2, "�̸���", 2, "�����а�");
		view(3, "������", 4, "���а�");
		
	}
	// �� �л��� ������  �Ű������� �޾Ƽ�
	// �ֿܼ� ǥ���ϴ� method
	public static void view(int intNum, String strName,
					int intGrade, String strDept) {
		System.out.println("�й� : " + intNum);
		System.out.println("�̸� : " + strName);
		System.out.println("�г� : " + intGrade);
		System.out.println("�а� : " + strDept);
		System.out.println("---------------");
	}
}
