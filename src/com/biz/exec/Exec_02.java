package com.biz.exec;

import com.biz.model.Student;

public class Exec_02 {

	public static void main(String[] args) {

		// ����� Student class�� ����ؼ� 
		// student��� ��ü�� �����ϰ�
		// ����Ҽ� �ֵ��� �ʱ�ȭ�� ����
		Student student1 = new Student();
		
		student1.intNum = 1;
		student1.strName = "ȫ�浿";
		student1.intGrade = 3;
		student1.strDept = "�İ���";
	
		
		
		Student student2 = new Student();
		student2.intNum = 2;
		student2.strName = "�̸���";
		student2.intGrade = 2;
		student2.strDept = "�����а�";
		
		Student student3 = new Student();
		student3.intNum = 3;
		student3.strName = "������";
		student3.intGrade = 4;
		student3.strDept = "ȸ���а�";
		
		view(student1);
		view(student2);
		view(student3);
		
	}
	// �� �л��� ������  �Ű������� �޾Ƽ�
	// �ֿܼ� ǥ���ϴ� method
	public static void view(Student std) {
		System.out.println("�й� : " + std.intNum);
		System.out.println("�̸� : " + std.strName);
		System.out.println("�г� : " + std.intGrade);
		System.out.println("�а� : " + std.strDept);
		System.out.println("---------------");
	}
}
