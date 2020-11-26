package multiplicationNumbers;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

 

       public static void main(String[] args) {

 

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 

        String arr[] = new String[10];

         for(int i=0;i<10;i++){

         arr[i]= sc.next(); 

         }

         for(int i=0;i<10;i++){

             System.out.println("Welcome "+arr[i] );

             }  

}

}

