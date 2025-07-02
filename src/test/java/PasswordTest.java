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

    @Test
    public void testHasUpperAndLowerCase() {
        Password validator = new Password();
        assertTrue(validator.hasUpperAndLowerCase("Abc123"));
        assertFalse(validator.hasUpperAndLowerCase("abc123"));
        assertFalse(validator.hasUpperAndLowerCase("ABC123"));
    }

    @Test
    public void testHasUpperAndLowerCaseWithNull() {
        Password validator = new Password();
        assertFalse(validator.hasUpperAndLowerCase(null));
    }

    @Test
    public void testHasUpperAndLowerCaseWithEmptyString() {
        Password validator = new Password();
        assertFalse(validator.hasUpperAndLowerCase(""));
    }

    @Test
    public void testHasUpperAnndLowerWithMixedCase() {
        Password validator = new Password();
        assertTrue(validator.isCommonPassword("Password1"));
        assertTrue(validator.isCommonPassword("Aa12345"));
        assertFalse(validator.isCommonPassword("MySecurePass123"));
    }

    @Test
    public void testContainsSpecialCharacter() {
        Password validator = new Password();
        assertTrue(validator.containsSpecialCharacter("abc123!")); // داره کاراکتر خاص
        assertFalse(validator.containsSpecialCharacter("abc123")); // نداره کاراکتر خاص
    }

    @Test
    public void testContainsSpecialCharacterWithNull() {
        Password validator = new Password();
        assertFalse(validator.containsSpecialCharacter(null));
    }

    @Test
    public void testContainsSpecialCharacterWithEmptyString() {
        Password validator = new Password();
        assertFalse(validator.containsSpecialCharacter(""));
    }

    @Test
    public void testContainsSpecialCharacterWithMultipleSpecialChars() {
        Password validator = new Password();
        assertTrue(validator.containsSpecialCharacter("abc@123#"));
    }

    @Test
    public void testGenerateRandomPassword() {
        Password validator = new Password();
        String password = validator.generateRandomPassword();
        assertTrue(validator.containsDigit(password), "Password should contain a digit");
        assertTrue(validator.hasUpperAndLowerCase(password), "Password should have upper and lower case");
        assertTrue(validator.containsSpecialCharacter(password), "Password should contain a special character");
        assertFalse(validator.isCommonPassword(password), "Password should not be common");
    }



}