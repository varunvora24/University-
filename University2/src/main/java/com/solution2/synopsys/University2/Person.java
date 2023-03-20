package com.solution2.synopsys.University2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
	private String name;
    private String contact;
    private String email;

    public Person(String name, String contact, String email) {
        this.name = name;
        setContact(contact);
        setEmail(email);
    }

    // Get the name of the person
    public String getName() {
        return name;
    }

    // Set the name of the person
    public void setName(String name) {
        this.name = name;
    }

    // Get the contact number of the person
    public String getContact() {
        return contact;
    }

    // Set the contact number of the person
    public void setContact(String contact) {
        if (validateContactNumber(contact)) {
            this.contact = contact;
        } else {
            throw new IllegalArgumentException("Invalid contact number. Contact number should be 10 digits and contain only numbers.");
        }
    }

    // Get the email address of the person
    public String getEmail() {
        return email;
    }

    // Set the email address of the person
    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    // Validate the contact number
    private boolean validateContactNumber(String contact) {
        return contact != null && contact.matches("^\\d{10}$");
    }

    // Validate the email address
    private boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
