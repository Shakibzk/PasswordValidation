import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
    @Test
    public void testMinimumLength() {
        Password validator = new Password();
        assertTrue(validator.hasMinimumLenght("12345678"));
        assertFalse(validator.hasMinimumLenght("1234567"));
    }


}