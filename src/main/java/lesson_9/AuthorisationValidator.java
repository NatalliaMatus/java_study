package lesson_9;

public class AuthorisationValidator {

    private static final int MAX_LEN = 20;

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            validateOrThrow(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public static void validateOrThrow(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        validateLoginOrThrow(login);
        validatePasswordOrThrow(password, confirmPassword);
    }

    private static void validateLoginOrThrow(String login) throws WrongLoginException {
        if (login == null) {
            throw new WrongLoginException("Login cannot be null");
        }
        if (login.length() >= MAX_LEN) {
            throw new WrongLoginException("The login length must be less than " + MAX_LEN + " characters");
        }
        if (containsWhitespace(login)) {
            throw new WrongLoginException("Login must not contain spaces");
        }
    }

    private static void validatePasswordOrThrow(String password, String confirmPassword)
            throws WrongPasswordException {
        if (password == null || confirmPassword == null) {
            throw new WrongPasswordException("Password/confirmPassword cannot be null");
        }
        if (password.length() >= MAX_LEN) {
            throw new WrongPasswordException("The password length must be less than " + MAX_LEN + " characters");
        }
        if (containsWhitespace(password)) {
            throw new WrongPasswordException("Password must not contain spaces");
        }
        if (!hasDigit(password)) {
            throw new WrongPasswordException("Password must contain at least one digit");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmPassword must match");
        }
    }

    private static boolean containsWhitespace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) return true;
        }
        return false;
    }

    private static boolean hasDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) return true;
        }
        return false;
    }
}
