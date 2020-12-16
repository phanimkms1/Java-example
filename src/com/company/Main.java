package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Quiz -> Single line comment
        String s1 = "20";
        String s2 = "20.0";
        boolean equality = s1.equals(s2);
        System.out.println(equality); //-> Multi line comment

//Boolean Data type
          System.out.println("Please enter your age :");
          Scanner sc=new Scanner(System.in);
          int age=sc.nextInt();
          Boolean isMajor=true;
          if(age>=18){
              isMajor=true;
              System.out.println("Major :"+isMajor);
          }else{
              isMajor=false;
              System.out.println("Major :"+isMajor);
          }
        //Relational operators -> <,<=,>,>=,==,!=
        //Assignment operator(=) vs Comparision operator(==)
        int answer=8;
        Boolean result=(answer==8);

        System.out.println(answer);
        System.out.println(result);
        //Logical Operators AND(&&) , OR(||) , NOT(!)
        //Assignment2
        String[] rainbow=new String[7];
        rainbow[0]="Violet";
        rainbow[1]="Indigo";
        rainbow[2]="Blue";
        rainbow[3]="Green";
        rainbow[4]="Yellow";
        rainbow[5]="Orange";
        rainbow[6]="Red";
        for(int i=0;i< rainbow.length;i++){
            System.out.println(rainbow[i]);
        }


    }
}
