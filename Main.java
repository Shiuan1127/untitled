package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	    int a,b,c,x,y;
	    Scanner in=new Scanner(System.in);
	    System.out.print("請輸入a:")
	    a=in.nextInt();
        System.out.print("請輸入b:")
        b=in.nextInt();
        System.out.print("請輸c:")
        c=in.nextInt();
        System.out.print("請輸入x:")
        x=in.nextInt();
        y=a*x*x+b*x+c;
        System.out.printf("計算結果y=%d",y)
        in.close();
    }
}