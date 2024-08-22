package hackerrank.strings;

public class UsernameValidator {

    private static final String REGEX = "^[a-zA-Z][a-zA-Z_0-9]{7,29}$";

    public static String matches(String userName) {
       return userName.matches(REGEX) ? "Valid" : "Invalid";
    }
}
