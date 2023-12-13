/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Nourhan
 */
public class Employee {
     private String Name;
     private String id ;
     private static double salary=1500;
     private  char gender;
     private int availableVcation;
     private int availablePremissionHours;
     private static double deductionPerDay=85.5;
     private static double deductionPerHour=15.5;
     private double actualSalary;
     public Employee(){
         Name="";
         gender = ' ';
         
         id= "";
         availableVcation=15;
         availablePremissionHours=20;
         actualSalary=salary;
        
         
     }

    public Employee(String Name, String id, char gender) {
        this.Name = Name;
        this.id = id;
        this.gender = gender;
          availableVcation=15;
          availablePremissionHours=20;
          actualSalary=salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public double getActualSalary() {
        return actualSalary;
    }

    public void setActualSalary(double actualSalary) {
        this.actualSalary = actualSalary;
    }

    public void view(){
        System.out.println("id "+id);
        System.out.println("name" +Name);
        System.out.println("actual slalry = "+actualSalary);
    }
    
     

     
     
     
    
    
    
}
