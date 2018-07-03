package com.jagadeeshposni.designpatterns.creational.builder;

public class Account {

    private String firstName;
    private String lastName;
    private String middleName;

    private String accountNumber;
    private String balance;

//    private String houseNo;
//    private String street;
//    private String city;
//    private String state;
//    private String country;
//    private String pincode;

    public String getAccountNumber() {
        return accountNumber;
    }

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

        public Builder(){

        }

        public Account build(){
            return new Account();
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
