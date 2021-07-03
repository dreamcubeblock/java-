package java_exp3_1;

import java.util.Random;

class bank{
	static int balance=0;
	static void take(String name,int money) {

		balance+=money;
		//try {Thread.sleep((int)(1000*Math.random()));}
      //  catch(InterruptedException e) {}

        System.out.println("用户："+name+" 银行总余额为：" + balance);

	}
}
class account extends Thread{
	int money;
	String name;

	Random random=new Random();
	account(int money,String name){
		this.money=money;
		this.name=name;

	}
	public void run() {
		Random random=new Random();
		
		for(int i=0;i<3;i++) {
			
			bank.take(this.name,money/3);
		}
	}

}
public class bankmoney {
	public static void main(String args[]) {
		account c1=new account(3000,"客户1");
		account c2=new account(300,"客户2");
		account c3=new account(6000,"客户3");
		c1.start();
		c2.start();
		c3.start();
	}
}
 