package com.example.brendon.hw2;
import java.util.Date;


import java.util.ArrayList;

public class Model {
   public ArrayList<ClockView> Array = new ArrayList<ClockView>();
   public Date date = new Date();
    int year, month, day;
   public Date getDate(){
       return date;
   }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
       this.year = year;
        date.setYear(year);
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
       this.month = month;
        date.setMonth(month);
    }
    public int getDay(){
        return day;

    }
    public void setDay(int day){
       this.day = day;
        date.setDate(day);
    }



}
