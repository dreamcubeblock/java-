package java_exp2_1;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
abstract class Employee{
 public int number;
    public String name;
    public int birthYear;
    public int birthMonth;
    public static int salary;
    public abstract int salary();
}
 interface GetSalaryPerMonth{
  int SalaryPerMonth=5000;
 }
 class SalariedEmployee extends Employee implements GetSalaryPerMonth{
     static int RedEnvelope = 100; //生日红包
    public int salary() {
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; //获取当前月份
        if (month == birthMonth)
            salary = SalaryPerMonth + RedEnvelope;
        else
            salary = SalaryPerMonth;
        return salary;
    }
 }
 interface Getsale{
  int salarypersale=10;
 }
 
 
 class CommissionEmployee extends Employee implements Getsale{
 // public static int RedEnvelope=100;
	 static int RedEnvelope = 100;
  public int salary(){
   int month=Calendar.getInstance().get(Calendar.MONTH)+1;
   int sale;
   System.out.print("输入销售额：");
   sale=new Scanner(System.in).nextInt();
   
   if(month==birthMonth)
    salary=RedEnvelope+salarypersale*sale;
   else
    salary=salarypersale*sale;
   return salary;
  }
  
 }

 interface GetBaseSalary{
  int basesalary=1000;
 }
 
 
 class BasePlusCommissionEmployee extends CommissionEmployee implements GetBaseSalary{

   public int salary(){
	   int sale=super.salary();
	   sale=sale+basesalary;
    return sale;
   }
 }
 interface Gethoursale{
  int intimehoursale=30;
  int outtimehoursale=40;
 }
 class HourlyEmployee extends Employee implements Gethoursale{
	 static int RedEnvelope = 100;
	 public int salary(){
   int month=Calendar.getInstance().get(Calendar.MONTH)+1;
   int hour;
   System.out.print("请输入工时：");
   hour=new Scanner(System.in).nextInt();
   if(month==birthMonth){
    if(hour>160){
    salary=RedEnvelope+160*intimehoursale+(hour-160)*outtimehoursale;
    }
    else{
     salary=RedEnvelope+hour*intimehoursale;
    }
   }else{
    if(hour>160){
     salary=160*intimehoursale+(hour-160)*outtimehoursale;
    }
    else{
    salary=hour*intimehoursale;
    }}
   return salary;
  }
  }
 
public class system {
	public  static String get_name() {
		System.out.print("请输入名字：");
		String name=new Scanner(System.in).next();
		System.out.println();
		return name;
	}
	public static int get_birthMonth() {
		System.out.print("请输入生日月份：");
		int month=new Scanner(System.in).nextInt();
		System.out.println();
		return month;
	}
	public static int get_birthyear() {
		System.out.print("请输入生日年份：");
		int year=new Scanner(System.in).nextInt();
		System.out.println();
		return year;
	}
	public  static int get_number() {
		System.out.print("请输入工号:");
		int number=new Scanner(System.in).nextInt();
		System.out.println();
		return number;
	}
	public static void main(String args[]) {
		Employee[]data=new Employee[4];
		data[0]=new SalariedEmployee();
		data[1]=new CommissionEmployee();
		data[2]=new BasePlusCommissionEmployee();
		data[3]=new HourlyEmployee();
		//print=new System.out.print();
		while(true) {
		System.out.println("输入员工类型：1.领固定月薪 2.按销售额提成 3.带底薪并按销售额提成 4.计时取酬");
		int i=new Scanner(System.in).nextInt();
		switch(i) {
			case 1:
				data[0].name=get_name();
				data[0].birthMonth=get_birthMonth();
				data[0].birthYear=get_birthyear();
				data[0].number=get_number();
				System.out.println("姓名："+data[0].name);
				System.out.println("工号:"+data[0].number);			
				System.out.println("生日年份："+data[0].birthYear);
				System.out.println(	"生日月份："+data[0].birthMonth);
				System.out.println("工资："+data[0].salary());
				break;
			case 2:
				data[1].name=get_name();
				data[1].birthMonth=get_birthMonth();
				data[1].birthYear=get_birthyear();
				data[1].number=get_number();
				System.out.println("姓名："+data[1].name);
				System.out.println("工号:"+data[1].number);			
				System.out.println("生日年份："+data[1].birthYear);
				System.out.println(	"生日月份："+data[1].birthMonth);
				System.out.println("工资："+data[1].salary());
				break;
			case 3:
				data[2].name=get_name();
				data[2].birthMonth=get_birthMonth();
				data[2].birthYear=get_birthyear();
				data[2].number=get_number();
				System.out.println("姓名："+data[2].name);
				System.out.println("工号:"+data[2].number);			
				System.out.println("生日年份："+data[2].birthYear);
				System.out.println(	"生日月份："+data[2].birthMonth);
				System.out.println("工资："+data[2].salary());
				break;
			case 4:
				data[3].name=get_name();
				data[3].birthMonth=get_birthMonth();
				data[3].birthYear=get_birthyear();
				data[3].number=get_number();
				System.out.println("姓名："+data[3].name);
				System.out.println("工号:"+data[3].number);			
				System.out.println("生日年份："+data[3].birthYear);
				System.out.println(	"生日月份："+data[3].birthMonth);
				System.out.println("工资："+data[3].salary());
				break;
		}
		
		}
	}
}