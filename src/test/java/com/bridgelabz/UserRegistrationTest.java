package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameValidation_WhenItsProper_ShouldReturnTrue(){
        boolean value = userRegistration.toCheckForFirstNameValidation("Himanshu");
        Assertions.assertTrue(value);

    }

    @Test
    public void givenLastNameValidation_WhenItsProper_ShouldReturnTrue(){
        boolean value = userRegistration.toCheckForLastNameValidation("Borse");
        Assertions.assertTrue(value);

    }

    @Test
    public void givenEmailIdValidation_WhenItsProper_ShouldReturnFalse(){
        boolean value = userRegistration.toCheckForEmailValidation("Jay");
        Assertions.assertTrue(value);

    }
    @Test
    public void givenPasswordValidation_WhenItsProper_ShouldReturnTrue(){
        boolean value = userRegistration.toCheckPasswordValidation("Jaaaaa4@");
        Assertions.assertTrue(value);

    }
    @Test
    public void givenPasswordValidation_WhenItsProper_ShouldReturnFalse(){
        boolean value = userRegistration.toCheckPasswordValidation("Jay_*");
        Assertions.assertTrue(value);

    }

}