package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int i=0;
        System.out.println("Введите число");
         Scanner a=new  Scanner(System.in);
         int x=a.nextInt();
         while (Math.abs(x/10)>=1)  {
             x=x/10;
             i++;
         }
        if (x>0) {
            System.out.println("Это положительное число, в нем "+(i+1)+" разряда(-ов)");
        } else
            if (x<0) {

                System.out.println("Это отрицательное число, в нем "+(i+1)+" разряда(-ов)" );
            } else {
                System.out.println("Данное число 0");
            }

    }
}
