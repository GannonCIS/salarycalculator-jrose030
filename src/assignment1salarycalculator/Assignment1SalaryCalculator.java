/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        salaryCalculator sally = new salaryCalculator();
        sally.calcHourly(80000);
        sally.calcSalary(7.25);
        sally.takeHomePerMonth(80000, .6);
        
        
        
        
    }
    
}
