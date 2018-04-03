package com.dehong.sso.boot;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * Created by dehong on 2018-03-31.
 */
public class PwdTest {
    public static void main(String[] args) {
        String algorithmName = "md5";
        String username = "test";
        String password = "test";
        String salt1 = username;
        String salt2 = "123";//new SecureRandomNumberGenerator().nextBytes().toHex();
        int hashIterations = 1;
        //SimpleHash hash = new SimpleHash(algorithmName, password, salt1, hashIterations);

        SimpleHash hash = new SimpleHash(algorithmName, password, null, hashIterations);
        String encodedPassword = hash.toHex();
        System.out.println(encodedPassword);
        System.out.println(salt2);
    }

}
