package com.jaletechs.recruiterapp.recruiter_app.type;

/**
 * Created by jaletechs on 2019-06-15.
 */
public enum Listing {

    BUSINESS_ADMIN("Business Administrator"),
    SECURITY_PERSONNEL("Security Personnel"),
    LECTURER("Lecturer");

    private String name;
    Listing(String name) {
        this.name = name;
    }
} 
