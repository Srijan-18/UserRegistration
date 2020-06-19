package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    //PATTERNS
    private static final String FIRST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    private static final String LAST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_ADDRESS_PATTERN="^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*"+
                                                    "@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";

    //METHOD TO VALIDATE FIRST NAME
    public boolean firstNameValidator(String firstName)
    {
        Pattern pattern=Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    //METHOD TO VALIDATE LAST NAME
    public boolean lastNameValidator(String lastName) {
        Pattern pattern=Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    //METHOD TO VALIDATE EMAIL ADDRESS
    public boolean emailAddressValidator(String email) {
        Pattern pattern=Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
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
