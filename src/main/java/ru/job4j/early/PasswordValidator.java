package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {

    @SuppressWarnings("checkstyle:InnerAssignment")
    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        boolean one = false;
        boolean two = false;
        for (int i = 0; i < password.length(); i++) {
            if (isLetterOrDigit(password.codePointAt(i)) && isDigit(password.codePointAt(i))) {
                one = true;
            } else {
                if (isDigit(password.codePointAt(i))) {
                    two = true;
                }
                if (!(one && two)) {
                    break;
                }
            }
        }
        if (!one) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (!two) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        String[] passwords = new String[]{"qwerty", "12345", "password", "admin", "user"};
        for (String number : passwords) {
            if (passwords[Integer.parseInt(number)].equals(password)) {
                return password;
            }
        }

        if (password != null) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }

        return password;
    }
}













