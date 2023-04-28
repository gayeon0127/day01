package day01;

public class Ex02 {
	public static void main(String[] args) {
		/*
		escape 문자 
		- 문자열 안에서 특수한 기능을 하는 것 
		- 문자열 - " " 로 묶여있는 값
		- \n ; enter
		- \t ; tab, space 8칸정도만큼 오른쪽으로 이동
		- \\ ; \ 하나 표현, 경로표현에 주로 사용
		- \" ; " 하나 표현, 
			   파일명 등에 공백이 있을 때 자바의 미인식 방지에 사용함
		*/
		
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t234567\t12345678\t1");
		
		System.out.println("이름\t나이");
		System.out.println("홍길동\t20");
		
		System.out.println("\\");
		System.out.println("C:\\");
		
		System.out.println(" \" ");
		System.out.println("\"C:\\오전 취업반\\새 폴더\"");
		
	}
}
