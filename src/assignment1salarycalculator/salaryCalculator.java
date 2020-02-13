/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author jaker
 */
public class salaryCalculator {
    
    public double calcSalary(double hourlyRate){
        double salary = (hourlyRate * 40) * 52;
        System.out.println(salary); //for testing purposes
        return salary; 
    }
    
    public double calcHourly(double salary){
        double hourly = (salary/52)/40;
        System.out.println(hourly); //for testing purposes
        return hourly; 
    }
    
    public double takeHomePerMonth(double salary, double taxRate){
        double takeHomePerMonth = (salary/12)-((salary/12)*taxRate);
        System.out.println(takeHomePerMonth); //for testing purposes
        return takeHomePerMonth;
    }
    
    public double calcTaxes(double salary, double taxRate){
        double taxes = (salary * taxRate);
        System.out.println(taxes); //for testing purposes
        return taxes; 
    }
}
