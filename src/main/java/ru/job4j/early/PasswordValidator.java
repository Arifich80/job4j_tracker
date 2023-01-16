package ru.job4j.early;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetterOrDigit;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.toLowerCase().contains("qwerty")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        if (password.toLowerCase().contains("12345")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        if (password.toLowerCase().contains("password")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        if (password.toLowerCase().contains("admin")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        if (password.toLowerCase().contains("user")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        if (!(password.length() >= 8 && password.length() <= 32)) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        for (int i = 0; i < password.length(); i++) {
            if (isLetterOrDigit(password.codePointAt(i)) && isDigit(password.codePointAt(i))) {
                throw new IllegalArgumentException("Password should contain at least one special symbol");
            } else {
                if (isDigit(password.codePointAt(i))) {
                    throw new IllegalArgumentException("Password should contain at least one figure");
                }
            }
        }
            return password;
        }
    }
