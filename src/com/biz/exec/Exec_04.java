package com.biz.exec;

import java.util.Random;

import com.biz.model.Student;

public class Exec_04 {

	public static void main(String[] args) {

		// Student클래스 객체 배열 10개를 예약
		// 예약만 되있고 사용할 준비가 되어있지 않음
		Student[] stdScore = new Student[10];

		// 객체 배열은 사용(읽기,쓰기)전에
		// 각 배열 요소를 개별적으로 초기화하는 코드를 수행해야한다.
		stdScore[0] = new Student();

		// 가상의 성적을 만들기위해 난수 발생기를 사용한다.
		Random rnd = new Random();

		// for 반복문을 사용해서 같은 코드를 10번 수행한다.
		for (int i = 0; i < stdScore.length; i++) {
			stdScore[i] = new Student();
			stdScore[i].intNum = i + 1;

			stdScore[i].intKor = rnd.nextInt(50) + 51;
			stdScore[i].intEng = rnd.nextInt(50) + 51;
			stdScore[i].intMath = rnd.nextInt(50) + 51;
		}
		System.out.println("=====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < stdScore.length; i++) {
//			int sum = intKor[i];
//			sum = intEng[i];
//			sum = intMath[i];

			int sum = stdScore[i].intKor + stdScore[i].intEng 
					+ stdScore[i].intMath;
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
