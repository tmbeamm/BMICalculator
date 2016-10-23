package com.example.bmicalculator.model;

/**
 * Created by ComPuTer on 23/10/2559.
 */

public class Human {
    public  String calBMI(String h,String w){
        double h1 = Double.parseDouble(h)/100;
        double w1 = Double.parseDouble(w);
        double cal = w1/(h1*h1);
        String bmi = String.format("%.2f",cal);
        return bmi;
    }
    public  String body(String h,String w){
        double h1 = Double.parseDouble(h)/100;
        double w1 = Double.parseDouble(w);
        double cal = w1/(h1*h1);
        String body = "";
        if(cal<18.5){
            body = "น้ำหนักน้อยกว่าปกติ(ผอม)";
        }
        else if(cal>=18.5 && cal<25){
            body = "น้ำหนักปกติ";
        }
        else if(cal>=25 && cal<30){
            body = "น้ำหนักมากกว่ากว่าปกติ(ท้วม)";
        }
        else {
            body = "น้ำหนักมากกว่ากว่าปกติมาก(อ้วน)";
        }
        return body;
    }
}
