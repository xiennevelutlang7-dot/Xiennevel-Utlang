/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicdatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a Degree in Fahrenheit");
        if (!sc.hasNextDouble()){           
          return;
        }
          double fahrenheit = sc.nextDouble();          
          double celsius = (fahrenheit - 32) * 5 / 9;
          
         System.out.println(fahrenheit + " degrees fahrenheit is equal to " + celsius + " In celsius ");
          
        
            
       

        }
    }
    
    
    
        
    
    

