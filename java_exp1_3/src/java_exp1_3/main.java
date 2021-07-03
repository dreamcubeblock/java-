package java_exp1_3;

import java.lang.reflect.Array;
import java.util.Random;

public class main {
 public static void main(String args[]){
  int[][] arr=new int[5][5];
  Random random=new Random();
  for(int i=0;i<5;i++){
   for (int j=0;j<5;j++){
    arr[i][j]=random.nextInt(10);
   }
   
  }
  for(int i=0;i<5;i++){
   System.out.println();
   for (int j=0;j<5;j++){
    System.out.print(arr[i][j]);
   }
   
  }
  int sum=0;
  System.out.println();
  for(int i=0;i<5;i++){
  // System.out.println();
   for (int j=0;j<5;j++){
    //System.out.print(arr[i][j]);
    if(i==0||i==4){
     sum+=arr[i][j];
    }else if(j==0||j==4){
     sum+=arr[i][j];
    }
   }
   
  }
  System.out.println("最外圈元素之和："+sum);
  int max=0;
  for(int i=0;i<5;i++){
   if(arr[i][i]>=max){
    max=arr[i][i];
   }
  }
  System.out.println("主对角线最大元素"+max);
  
 }
}