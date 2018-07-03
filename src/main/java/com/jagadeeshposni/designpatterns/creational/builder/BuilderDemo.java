package com.jagadeeshposni.designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String args[]){

//        Calender cal = new Cal
        Account a = new Account.Builder().accountNumber("123").build();
        System.out.println(a.getAccountNumber());
    }


}
