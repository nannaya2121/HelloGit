package main;

import calc.Calculator;

public class Main {

	public static void main(String[] args) {
		System.out.println("로컬저장소 사용");
		System.out.println("원격저장소 사용 가능");
		System.out.println("원격저장소 사용 가능2");
		System.out.println("팀장 코드시작입니다.");
		System.out.println("팀장 코드마지막입니다.");
		

		System.out.println("팀장 새코드시작");
		System.out.println("팀장 새코드끝");

		System.out.println("팀원 코드1");
		System.out.println("팀원 코드2");
		System.out.println("팀원 코드3");
		
		Calculator cal = new Calculator();
		int addResult = cal.add(1, 2);
		System.out.println(addResult);
		
		int subResult = cal.subtract(3, 1);
		System.out.println(subResult);


	}

}
