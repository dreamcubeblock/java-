package java_exp2_3;

import java.util.Random;
import java.util.Scanner;

public class guessnumber {
	public static void main(String args[]) {
		System.out.println("1.开始；2.结束");
		int main=new Scanner(System.in).nextInt();
		if(main==1) {
			int score=0;
			while(true) {
			Random random=new Random();
			System.out.print("请输入你猜的数：");
			int guessnumber=random.nextInt(100);
			int number=new Scanner(System.in).nextInt();
			int i=0;
			for(i=0;i<2;i++) {
			if(number==guessnumber) {
				System.out.println("猜对了");
				switch(i) {
				case 0:
					score+=3;
				case 1:
					score+=2;
				case 2:
					score+=1;
				}
				System.out.print("得分:"+score);
			//	System.out.println("1.再来一次；2.退出");
				main=new Scanner(System.in).nextInt();
			}
			else if(number!=guessnumber) {
				if(number<guessnumber) {
					System.out.println("太小了");
					
				}
				else {
					System.out.println("太大了");
				}
				System.out.print("再次输入:");
				number=new Scanner(System.in).nextInt();
			}
			
		}
			if(i==2) {
				score-=2;
				System.out.print("得分:"+score);
				System.out.println("正确数字:"+guessnumber);
			}
			System.out.println("1.再来一次；2.退出");
			main=new Scanner(System.in).nextInt();
			if(main==2) {
				break;
			}
			
	}
}
}
}