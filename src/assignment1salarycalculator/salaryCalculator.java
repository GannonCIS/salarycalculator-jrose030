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
        System.out.println(salary);
        return salary; 
    }
    
    public double calcHourly(double salary){
        double hourly = (salary/52)/40;
        System.out.println(hourly);
        return hourly; 
    }
    
    public double takeHomePerMonth(double salary, double taxRate){
        double takeHomePerMonth = (salary/12)-((salary/12)*taxRate);
        System.out.println(takeHomePerMonth);
        return takeHomePerMonth;
    }
    
    public double calcTaxes(double salary, double taxRate){
      return 0; //dont't forget to change later!!!!!!!!!!!!!!!!!!!!!!!!!!!!  
    }
}
