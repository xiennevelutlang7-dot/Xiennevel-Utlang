/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiccontrolstructurepart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a Year: ");
        int year = sc.nextInt();
        
        if (( year % 400 == 0) || (year % 4 == 0 && year % 100 !=0)){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
            
        }
        
            
    }
    
}
