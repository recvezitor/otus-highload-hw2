package com.dimas.util;

import lombok.experimental.UtilityClass;
import org.mindrot.jbcrypt.BCrypt;

import static java.util.Objects.isNull;

@UtilityClass
public class SecurityUtil {


    public static String encrypt(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    public static boolean validPassword(String encrypted, String plainPassword) {
        return isNull(encrypted) || encrypted.equals(plainPassword) || BCrypt.checkpw(plainPassword, encrypted);//plain text is supported
    }

}
