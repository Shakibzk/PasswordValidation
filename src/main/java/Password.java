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


}


