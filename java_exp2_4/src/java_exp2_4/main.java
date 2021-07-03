package java_exp2_4;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		while(true) {
		System.out.println("输入本人信息：");
		System.out.println("输入姓名：");
		String name=new Scanner(System.in).next();
		System.out.println("输入年龄：");
		int age=new Scanner(System.in).nextInt();
		System.out.println("输入性别：");
		String gender=new Scanner(System.in).next();
		System.out.println("输入欲配偶人信息：");
		System.out.println("输入姓名：");
		String pname=new Scanner(System.in).next();
		System.out.println("输入年龄：");
		int page=new Scanner(System.in).nextInt();
		System.out.println("输入性别：");
		String pgender=new Scanner(System.in).next();
		//int age=new
		Person P1=new Person(name,age,gender);
		Person P2=new Person(pname,page,pgender);
		P1.marry(P2);
	}
	}
}
