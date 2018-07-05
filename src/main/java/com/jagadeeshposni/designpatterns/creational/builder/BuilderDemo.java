package com.jagadeeshposni.designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String args[]){

//      n
        Account a = new Account.Builder().accountNumber("abd").build();
        System.out.println(a.getAccountNumber());
        System.out.println(a.getBalance());
    }


}
