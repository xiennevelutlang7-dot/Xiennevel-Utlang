/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        int minuteInDay = 60 * 24;
        int dayInYear = 365;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the number of minutes: ");
        int minutes = sc.nextInt();
        
        int year = minutes/ (minuteInDay * dayInYear);
        int remainingDay = (minutes % ( minuteInDay * dayInYear)) / minuteInDay;
        
        
        System.out.println(minutes +  " minutes is approximately " + year + " year " + remainingDay + " days ");
        
    }
}
