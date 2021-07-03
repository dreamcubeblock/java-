package java_exp3_3;

public class student {
	String id;
	String grade;
	String name;
	student(String id,String grade,String name){
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	String return_information() {
		return "学号："+this.id+"\t年级："+this.grade+"\t姓名："+this.name;
	}
}
