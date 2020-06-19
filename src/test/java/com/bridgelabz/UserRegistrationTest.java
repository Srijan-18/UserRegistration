package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private String testEmail;
    private boolean expectedResult;
    private UserRegistration userRegistration=new UserRegistration();
    //TEST METHODS FOR FIRST NAME
    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.firstNameValidator("Am"));
    }

    @Test
    public void givenFirstName_whenStartNotInCAP_shouldReturnFalse() {
    Assert.assertFalse(userRegistration.firstNameValidator("mAdhdf"));
    }
    @Test
    public void givenFirstName_whenContainsSpecialCharacters_shouldReturnFalse() {
    Assert.assertFalse(userRegistration.firstNameValidator(".Adhdf"));
    }
    @Test
    public void givenFirstName_whenContainsNumeric_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.firstNameValidator("Ad1hdf"));
    }
    @Test
    public void givenFirstName_whenContainsCapsOtherThanStart_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.firstNameValidator("AdHdf"));
    }
    @Test
    public void givenFirstName_matchesThePattern_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.firstNameValidator("Srijan"));
    }
    //TEST METHODS FOR LAST NAME
    @Test
    public void givenLastName_whenShort_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.lastNameValidator("Mi"));
    }

    @Test
    public void givenLastName_whenStartsWithLoweCase_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.lastNameValidator("mishra"));
    }

    @Test
    public void givenLastName_whenContainsNumerics_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.lastNameValidator("Mis1hra"));
    }

    @Test
    public void givenLastName_whenContainsSpecialCharacters_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.lastNameValidator("M!shra"));
    }
    @Test
    public void givenLastName_whenContainsCapsOtherThanStart_shouldReturnFalse(){
        Assert.assertFalse(userRegistration.lastNameValidator("MiSHra"));
    }

    @Test
    public void givenLastName_whenMatchesPattern_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.lastNameValidator("Mishra"));
    }
    public UserRegistrationTest(String testEmail,boolean expectedResult)
    {
        this.testEmail=testEmail;
        this.expectedResult=expectedResult;
    }
    //TEST METHOD FOR EMAIL ADDRESS
    @Test
    public void givenEmail_shouldReturnResultAsExpected() {
        Assert.assertEquals(this.expectedResult,userRegistration.emailAddressValidator(this.testEmail));
    }

    //TEST CASES FOR EMAIL ADDRESS
    @Parameterized.Parameters
    public static Collection emailTestCases_and_expectedResults() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc123@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false},
        });
    }
    //TEST METHODS FOR MOBILE NUMBER
    @Test
    public void givenMobileNumber_whenCountryCodeIsAbsent_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("9876543210"));
    }

    @Test
    public void givenMobileNumber_whenAlphabetisPresent_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 98756d545S"));
    }

    @Test
    public void givenMobileNumber_whenStartsWithZero_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 0879456123"));
    }

    @Test
    public void givenMobileNumber_whenLengthIsLessThanTen_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 987564321"));
    }

    @Test
    public void givenMobileNumber_whenLengthIsGreaterThanTen_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 98756432101"));
    }

    @Test
    public void givenMobileNumber_whenContainsSpecialCharacter_shouldReturnFlase() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 987564321@"));
    }

    @Test
    public void givenMobilenumber_whenCountryCodeIsGreaterThan3Digits_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("9125 9876543210"));
    }

    @Test
    public void givenMobileNumber_whenMatchesPattern_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.mobileNumberValidator("91 7078887887"));
    }
    // TEST METHODS FOR PASSWORD

    @Test
    public void givenPassword_whenLengthLessthanEightCharacters_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.passwordValidator("asd"));
    }

    @Test
    public void givenPassword_whenLengthGreaterThanEightCharacters_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.passwordValidator("wekjfgerr152"));
    }
}
