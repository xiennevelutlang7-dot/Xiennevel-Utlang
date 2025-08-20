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
public class Problem8 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input Number of Terms: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++){
            int cube = i * 1;
            System.out.println("Number is :" + i + " And Cube of" + i +" is:" + cube);
        }
    }
    
}
