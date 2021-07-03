package java_exp3_3;
import java.io.*;

import java.util.*;
public class WriteRead {
	public static void main(String args[]) throws IOException {
		System.out.print("请输入录入学生人数：");
		int num=new Scanner(System.in).nextInt();
		student[] stu=new student[num];
		for(int i=0;i<num;i++) {
			System.out.print("请输入学号：");
			String id=new Scanner(System.in).next();
			System.out.print("请输入年级：");
			String grade=new Scanner(System.in).next();
			System.out.print("请输入姓名：");
			String name=new Scanner(System.in).next();
			stu[i]=new student(id,grade,name);
			
		}
		File file=new File("Student.txt");
		WriteFile(file,stu);
		readfile(file);
	}
	public static void WriteFile(File file, student []stu) throws IOException //写入文件
    {
        FileWriter fw = new FileWriter(file,false); //要覆盖之前的内容，选择false
        BufferedWriter bw = new BufferedWriter(fw);

        for (student s : stu)
        {
            bw.write(s.return_information());
            bw.newLine(); //写入一个学生的信息后换行
        }
        bw.close(); 
        fw.close();
    }
	public static void readfile(File file) throws IOException {
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
		br.close();
		fr.close();
	

	}
}
