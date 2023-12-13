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
public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    
    
    public boolean inSameMonth(Holiday otherHoliday) {
    if (this.month == otherHoliday.month) {
        return true;
    } else {
        return false;
    }
}
    public static double avgDate(Holiday[] h) {
        int sum = 0;
        for(int i = 0; i < h.length; i++) {
        sum = sum + h[i].day;
        }
        return ((double) sum)/h.length;
       }
    
}
