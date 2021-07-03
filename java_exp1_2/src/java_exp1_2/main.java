package java_exp1_2;

import java.util.Collections;
import java.util.Random;

public class main{
    public static void main(String args[]){
        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] b=new int[10];
        for(int i=0;i<10;i++){
            b[i]=a[i];
        }
        int ranIndex=0;
        Random random=new Random();
        for (int i=0;i<10;i++){
            ranIndex=random.nextInt(10);
            swap(b,ranIndex,i);
        }
        for(int i=0;i<10;i++){
        System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<10;i++){
        System.out.print(b[i]+" ");
        }
    }

    private static void swap(int[] b, int ranIndex, int i) {
        int temp;
        temp=b[ranIndex];
        b[ranIndex]=b[i];
        b[i]=temp;
    }


}
