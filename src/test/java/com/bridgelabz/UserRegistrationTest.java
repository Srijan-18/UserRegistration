package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result=userRegistration.firstnameValidator("Am");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenFirstName_whenStartNotInCAP_shouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean result=userRegistration.firstnameValidator("mAdhdf");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenFirstName_whenContainsSpecialCharacters_shouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean result=userRegistration.firstnameValidator(".Adhdf");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenFirstName_whenContainsNumeric_shouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean result=userRegistration.firstnameValidator("Ad1hdf");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenFirstName_whenContainsCapsOtherThanStart_shouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean result=userRegistration.firstnameValidator("AdHdf");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenFirstName_matchesThePattern_shouldReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        boolean result=userRegistration.firstnameValidator("Srijan");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_whenShort_shouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(false,userRegistration.lastNameValidator("Mi"));
    }

    @Test
    public void givenLastName_whenStartsWithLoweCase_shouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(false,userRegistration.lastNameValidator("mishra"));
    }

    @Test
    public void givenLastName_whenContainsNumerics_shouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(false,userRegistration.lastNameValidator("Mis1hra"));
    }

    @Test
    public void givenLastName_whenContainsSpecialCharacters_shouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(false,userRegistration.lastNameValidator("M!shra"));
    }
    @Test
    public void givenLastName_whenContainsCapsOtherThanStart_shouldReturnFalse(){
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(false,userRegistration.lastNameValidator("MiSHra"));
    }

    @Test
    public void givenLastName_whenMatchesPattern_shouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(true,userRegistration.lastNameValidator("Mishra"));
    }
}
