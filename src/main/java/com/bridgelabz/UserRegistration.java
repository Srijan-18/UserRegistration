package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    //PATTERNS
    private static final String NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_ADDRESS_PATTERN="^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*"+
                                                    "@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";
    private static final String MOBILE_NUMBER_PATTERN="^[1-9][0-9]{0,2}[ ][1-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN="^(?=.*[A-Z])([A-z0-9]){8,}$";
    //METHOD TO VALIDATE FIRST NAME
    public boolean firstNameValidator(String firstName)
    {
        Pattern pattern=Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    //METHOD TO VALIDATE LAST NAME
    public boolean lastNameValidator(String lastName) {
        Pattern pattern=Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    //METHOD TO VALIDATE EMAIL ADDRESS
    public boolean emailAddressValidator(String email) {
        Pattern pattern=Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }
    //METHOD TO VALIDATE MOBILE NUMBER
    public boolean mobileNumberValidator(String mobileNumber) {
        Pattern pattern=Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }
    //METHOD TO VALIDATE PASSWORD
    public boolean passwordValidator(String password) {
        Pattern pattern=Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
    //MAIN METHOD
    public static void main(String[] args){
        UserRegistration userRegistration=new UserRegistration();
        Scanner scanner=new Scanner(System.in);
        System.out.print("\n\t\t***WELCOME TO USER REGISTRATION VALIDATOR***\n\n");
        System.out.print("\n\t\tEnter First Name :");
        if(userRegistration.firstNameValidator(scanner.nextLine()))
            System.out.print("\n\t\tVALID FIRST NAME\n");
        else
            System.out.print("\n\t\tINVALID FIRST NAME\n");
        System.out.print("\n\t\tEnter Last Name :");
        if(userRegistration.lastNameValidator(scanner.nextLine()))
            System.out.print("\n\t\tVALID LAST NAME\n");
        else
            System.out.print("\n\t\tINVALID LAST NAME\n");
        System.out.print("\n\t\tEnter Email Address :");
        if(userRegistration.emailAddressValidator(scanner.nextLine()))
            System.out.print("\n\t\tVALID EMAIL ADDERESS\n");
        else
            System.out.print("\n\t\tINVALID EMAIL ADDRESS\n");
    }

}
