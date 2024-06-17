package com.project.cinema.util;

import org.mindrot.jbcrypt.BCrypt;

public class Passwordutil {
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean checkPassword(String password, String hashed) {
        return BCrypt.checkpw(password, hashed);
    }
}
