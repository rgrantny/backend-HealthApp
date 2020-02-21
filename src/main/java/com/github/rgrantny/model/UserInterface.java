package com.github.rgrantny.model;

public interface UserInterface {
    String getUserId();
    String getFirstName();
    String getLastName();
    String getEmailAddress();
    String getDob();

//    void setUserId(String userId);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setEmailAddress(String emailAddress);
    void setDob(String dob);

}
