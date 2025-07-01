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
}
