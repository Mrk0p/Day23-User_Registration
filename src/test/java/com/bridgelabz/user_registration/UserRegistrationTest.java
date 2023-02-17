package com.bridgelabz.user_registration;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Rajkumar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("rajkumar");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Verma");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("verma");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_ShouldReturnTrue() {
        boolean result = userRegistration.email("rajkumar@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_ShouldReturnFalse() {
        boolean result = userRegistration.email("rajkumar&.com");
        Assert.assertEquals(false, result);

    }
}
