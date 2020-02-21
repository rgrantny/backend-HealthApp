package com.github.rgrantny.model;

public class User implements UserInterface {
    private final String userId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String dob;

    public User(String userId, String firstName, String lastName, String emailAddress, String dob) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
    }

    public String getUserId() {
        return userId;
    }


    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public void setDob(String dob) {
        this.dob = dob;
    }
}
