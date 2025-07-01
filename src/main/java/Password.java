public class Password {
    public boolean hasMinimumLenght(String password) {
        if ( password == null ) {
            return false; }
        return password.length() >= 8;
    }

}
