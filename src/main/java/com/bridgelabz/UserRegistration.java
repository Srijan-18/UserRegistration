package com.bridgelabz;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    //PATTERNS
    private static final String FIRST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    private static final String LAST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";

    //METHOD TO VALIDATE FIRST NAME
    public boolean firstnameValidator(String firstName)
    {
        Pattern pattern=Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    //METHOD TO VALIDATE LAST NAME
    public boolean lastNameValidator(String lastName) {
        Pattern pattern=Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    //MAIN METHOD
    public static void main(String[] args){
        UserRegistration userRegistration=new UserRegistration();
        Scanner scanner=new Scanner(System.in);
        System.out.print("\n\t\t***WELCOME TO USER REGISTRATION VALIDATOR***\n\n");
        System.out.print("\n\t\tEnter First Name :");
        if(userRegistration.firstnameValidator(scanner.nextLine()))
            System.out.print("\n\t\tVALID FIRST NAME\n");
        else
            System.out.print("\n\t\tINVALID FIRST NAME\n");
        System.out.print("\n\t\tEnter Last Name :");
        if(userRegistration.lastNameValidator(scanner.nextLine()))
            System.out.print("\n\t\tVALID LAST NAME\n");
        else
            System.out.print("\n\t\tINVALID LAST NAME\n");
    }
}
