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
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.firstNameValidator("Am"));
    }

    @Test
    public void givenFirstName_WhenStartNotInCAP_ShouldReturnFalse() {
    Assert.assertFalse(userRegistration.firstNameValidator("mAdhdf"));
    }
    @Test
    public void givenFirstName_WhenContainsSpecialCharacters_ShouldReturnFalse() {
    Assert.assertFalse(userRegistration.firstNameValidator(".Adhdf"));
    }
    @Test
    public void givenFirstName_WhenContainsNumeric_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.firstNameValidator("Ad1hdf"));
    }
    @Test
    public void givenFirstName_WhenContainsCapsOtherThanStart_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.firstNameValidator("AdHdf"));
    }
    @Test
    public void givenFirstName_MatchesThePattern_ShouldReturnTrue() {
        Assert.assertTrue(userRegistration.firstNameValidator("Srijan"));
    }
    //TEST METHODS FOR LAST NAME
    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.lastNameValidator("Mi"));
    }

    @Test
    public void givenLastName_WhenStartsWithLoweCase_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.lastNameValidator("mishra"));
    }

    @Test
    public void givenLastName_WhenContainsNumerics_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.lastNameValidator("Mis1hra"));
    }

    @Test
    public void givenLastName_WhenContainsSpecialCharacters_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.lastNameValidator("M!shra"));
    }
    @Test
    public void givenLastName_WhenContainsCapsOtherThanStart_ShouldReturnFalse(){
        Assert.assertFalse(userRegistration.lastNameValidator("MiSHra"));
    }

    @Test
    public void givenLastName_WhenMatchesPattern_ShouldReturnTrue() {
        Assert.assertTrue(userRegistration.lastNameValidator("Mishra"));
    }
    public UserRegistrationTest(String testEmail,boolean expectedResult)
    {
        this.testEmail=testEmail;
        this.expectedResult=expectedResult;
    }
    //TEST METHOD FOR EMAIL ADDRESS
    @Test
    public void givenEmail_ShouldReturnResultAsExpected() {
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
    public void givenMobileNumber_WhenCountryCodeIsAbsent_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("9876543210"));
    }

    @Test
    public void givenMobileNumber_WhenAlphabetisPresent_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 98756d545S"));
    }

    @Test
    public void givenMobileNumber_WhenStartsWithZero_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 0879456123"));
    }

    @Test
    public void givenMobileNumber_WhenLengthIsLessThanTen_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 987564321"));
    }

    @Test
    public void givenMobileNumber_WhenLengthIsGreaterThanTen_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 98756432101"));
    }

    @Test
    public void givenMobileNumber_WhenContainsSpecialCharacter_ShouldReturnFlase() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("91 987564321@"));
    }

    @Test
    public void givenMobilenumber_WhenCountryCodeIsGreaterThan3Digits_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.mobileNumberValidator("9125 9876543210"));
    }

    @Test
    public void givenMobileNumber_WhenMatchesPattern_ShouldReturnTrue() {
        Assert.assertTrue(userRegistration.mobileNumberValidator("91 7078887887"));
    }
    // TEST METHODS FOR PASSWORD

    @Test
    public void givenPassword_WhenLengthLessthanEightCharacters_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.passwordValidator("As1#"));
    }
    @Test
    public void givenPassword_WhenNoUppercase_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.passwordValidator("asdjg#cl1561iadewffwe"));
    }

    @Test
    public void givenPassword_WhenNoNumericIsPresent_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.passwordValidator("wEk%jfgerr"));
    }

    @Test
    public void givenPassword_WhenNoSpecialCharacterIsPresent_ShouldReturnFalse() {
        Assert.assertFalse(userRegistration.passwordValidator("wEkjfgerr123"));
    }

    @Test
    public void givenPassword_FollowsThePattern_ShouldReturnTrue() {
        Assert.assertTrue(userRegistration.passwordValidator("wEkjf#gerr152"));
    }
}
