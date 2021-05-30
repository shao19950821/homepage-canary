package com.canary.util;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Qixiang Shao
 * @Date: 2021/05/26/3:14 下午
 * @Description:
 */
public class StringUtils {
    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
