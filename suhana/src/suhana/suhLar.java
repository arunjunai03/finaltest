package suhana;

import java.util.Arrays;

public class suhLar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1=56834;int b=0;
		String number=String.valueOf(input1);
		char a[]=number.toCharArray();
		Arrays.sort(a);
		int len=a.length;
		String s1=Character.toString(a[len-1]);
		String s2=Character.toString(a[len-2]);
		String s=s1+s2;
		b=Integer.parseInt(s);
		System.out.print(b);
	}
}
