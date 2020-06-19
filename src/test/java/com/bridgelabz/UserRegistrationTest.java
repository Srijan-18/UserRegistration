package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.firstNameValidator("Am"));
    }

    @Test
    public void givenFirstName_whenStartNotInCAP_shouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.firstNameValidator("mAdhdf"));
    }
    @Test
    public void givenFirstName_whenContainsSpecialCharacters_shouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.firstNameValidator(".Adhdf"));
    }
    @Test
    public void givenFirstName_whenContainsNumeric_shouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.firstNameValidator("Ad1hdf"));
    }
    @Test
    public void givenFirstName_whenContainsCapsOtherThanStart_shouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.firstNameValidator("AdHdf"));
    }
    @Test
    public void givenFirstName_matchesThePattern_shouldReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.firstNameValidator("Srijan"));
    }

    @Test
    public void givenLastName_whenShort_shouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertFalse(userRegistration.lastNameValidator("Mi"));
    }

    @Test
    public void givenLastName_whenStartsWithLoweCase_shouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertFalse(userRegistration.lastNameValidator("mishra"));
    }

    @Test
    public void givenLastName_whenContainsNumerics_shouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertFalse(userRegistration.lastNameValidator("Mis1hra"));
    }

    @Test
    public void givenLastName_whenContainsSpecialCharacters_shouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertFalse(userRegistration.lastNameValidator("M!shra"));
    }
    @Test
    public void givenLastName_whenContainsCapsOtherThanStart_shouldReturnFalse(){
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertFalse(userRegistration.lastNameValidator("MiSHra"));
    }

    @Test
    public void givenLastName_whenMatchesPattern_shouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertTrue(userRegistration.lastNameValidator("Mishra"));
    }
}
