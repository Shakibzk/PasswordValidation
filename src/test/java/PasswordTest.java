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


}