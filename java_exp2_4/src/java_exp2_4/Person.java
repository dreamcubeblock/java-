package java_exp2_4;

public class Person {
	String name=new String();
	int age;
	String gender;
	Person partner=null;
	Person(String name,int age,String gender){
		this.age=age;
		this.gender=gender;
		this.name=name;
	}
	void marry(Person P) {
		if(this.partner!=null) {
			System.out.println("已有配偶");
			return;
		}
		if(this.gender!=P.gender) {
			if((this.age>23&&this.gender.equals("male"))||(this.age>21&&this.gender.equals("female"))) {
				if((P.age>23&&P.gender.equals("male"))||(P.age>21&&P.gender.equals("female"))) {
					this.partner=P;
					P.partner=this;
					System.out.println("可以结婚");
					return;
				}
			}
		}
		System.out.println("不符合条件无法结婚");
		return;
	}
}
