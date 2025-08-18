/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input first name: ");
        int num1 = sc.nextInt();
        System.out.println("Input Second: ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        int diff = num1 - num2;
        int qout = num1 / num2;
        int prod = num1 * num2;
        int mod = num1 % num2;
         System.out.println(num1 + " + " + num2 + " = " + sum);
         System.out.println(num1 + " - " + num2 + " = " + diff);
         System.out.println(num1 + " / " + num2 + " = " + qout);
         System.out.println(num1 + " * " + num2 + " = " + prod);
         System.out.println(num1 + " % " + num2 + " = " + mod);
                                   
    }
    
}
