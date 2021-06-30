package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String firstName, lastName, email, mobileNumber, subjects, selectPicture, currentAddress,
            state, city;

    public String getFirstName() { return firstName; }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getSubjects() { return subjects; }
    public String getSelectPicture() { return selectPicture; }
    public String getCurrentAddress() { return currentAddress; }
    public String getState() { return state; }
    public String getCity() { return city; }



    public DataInjection(){
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobileNumber = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.subjects = "English";
        this.selectPicture = "C:\\Users\\LENOVO\\IdeaProjects\\Danilo.jpg";
        this.currentAddress = faker.address().fullAddress();
        this.state = "Haryana";
        this.city = "Delhi";


    }


}

