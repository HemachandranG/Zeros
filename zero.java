package Zeros;

import java.util.Arrays;
import java.util.Scanner;

public class zeros {

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		int a=A.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<a;i++) {
			ar[i]=A.nextInt();
		}
		int count=0;
		for(int i=0;i<a;i++) {
			if(ar[i]!=0) {
				ar[count++]=ar[i];
			}
		}
		while(count<a) {
			ar[count++]=0;
		}
  System.out.println(Arrays.toString(ar));
	}

}
