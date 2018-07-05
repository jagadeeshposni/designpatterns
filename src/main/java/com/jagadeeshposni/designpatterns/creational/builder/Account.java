package com.jagadeeshposni.designpatterns.creational.builder;

public class Account {

    private final String firstName;
    private final String lastName;
    private final String middleName;

    private final String accountNumber;
    private final String balance;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }


    private Account(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;

        this.accountNumber = builder.accountNumber;
        this.balance = builder.balance;
    }

//    private String houseNo;
//    private String street;
//    private String city;
//    private String state;
//    private String country;
//    private String pincode;


    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;



        private String accountNumber;
        private String balance;

//        private String houseNo;
//        private String street;
//        private String city;
//        private String state;
//        private String country;
//        private String pincode;

        public Account build(){

            return new Account(this);
        }

        public Builder firstName(final String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(final String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder middleName(final String middleName){
            this.middleName = middleName;
            return this;
        }

        public Builder accountNumber(final String accountNumber){
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder balance(final String balance){
            this.balance = balance;
            return this;
        }
    }
}
