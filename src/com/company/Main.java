package com.company;

public class Main {

    public static void main(String[] args) {
	//  1,2,3,5,8,13,21,34 ....... 4000000
    //    2  +  8   +   34 + ... + 4000000 = result
        int summan=2;
        int a=1;
        int b=2;
        int x=3;
        for (int i = 3; i <= 4000000 ; i++) {

            if(x%2==0)

               summan+=x;
                a=b;
                b=x;
                i=x;
                x=a+b;
        }

        System.out.println("summan = " + summan);
    }
}
