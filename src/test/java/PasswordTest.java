import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
    @Test
    public void testMinimumLength() {
        Password validator = new Password();
        assertTrue(validator.hasMinimumLenght("12345678"));
        assertFalse(validator.hasMinimumLenght("1234567"));
    }

    @Test
    public void testHasMinimumLenghtWithNull() {
        Password validator = new Password();
        assertFalse(validator.hasMinimumLenght(null));
    }

    @Test
    public void testHasMinimumLenghtWithEmptyString() {
        Password validator = new Password();
        assertFalse(validator.hasMinimumLenght(""));
    }

    @Test
    public void testHasMinimumLenghtWithLongPassword() {
        Password validator = new Password();
        assertTrue(validator.hasMinimumLenght("abcdefghijk"));
    }

    @Test
    public void testContainsDigit() {
        Password validator = new Password(); // اصلاح به Password
        assertTrue(validator.containsDigit("abc123")); // داره عدد
        assertFalse(validator.containsDigit("abcdef")); // نداره عدد
    }

    @Test
    public void testContainsDigitWithNull() {
        Password validator = new Password();
        assertFalse(validator.containsDigit(null));
    }

    @Test
    public void testContainsWithEmptyString() {
        Password validator = new Password();
        assertFalse(validator.containsDigit(""));
    }

    @Test
    public void testContainsDigitWithMultipleDigits() {
        Password validator = new Password();
        assertTrue(validator.containsDigit("abc123xyz456"));
    }




}