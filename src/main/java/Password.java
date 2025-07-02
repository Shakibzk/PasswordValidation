import java.util.Random;

public class Password {
    public boolean hasMinimumLenght(String password) {
        if ( password == null ) {
            return false;
        }
        return password.length() >= 8;
    }
    public boolean containsDigit(String password) {
        if (password == null) {
            return false;
        }
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasUpperAndLowerCase(String password) {
        if (password == null) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (hasUpper && hasLower) {
                return true;
            }
        }
        return false;
    }

    public boolean isCommonPassword(String password) {
        if (password == null) {
            return false;
        }
        String[] commonPasswords = {"Password1", "Aa345678", "12345678", "Qwerty123"};
        for (String common : commonPasswords) {
            if (password.equals(common)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsSpecialCharacter(String password) {
        if (password == null) {
            return false;
        }
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        for (char c : password.toCharArray()) {
            if (specialCharacters.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    public String generateRandomPassword() {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        String allCharacters = lowerCase + upperCase + digits + specialCharacters;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        int lenght = 12;

        password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        password.append(upperCase.charAt(random.nextInt(upperCase.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        for (int i = 4; i < lenght; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        char[] passwordArray = password.toString().toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = temp;
        }
        return new String(passwordArray);
    }
}


