package java_exp2_2;

import java.util.Scanner;


public class ComputeTime {
	public static void main(String args[]) {

			String name=args[0];
			double A=Double.parseDouble(args[1]);
			double B=Double.parseDouble(args[2]);
			double C=Double.parseDouble(args[3]);
			System.out.println("Plane "+"50 "+"50 "+"50 ");
			try {

				Common x=(Common)Class.forName("java_exp2_2."+name).getDeclaredConstructor().newInstance();

				System.out.print("距离"+x.timecompute(A, B, C));
			} catch (Exception e) {
					System.out.println("class not found");
			}
			

	}
}
