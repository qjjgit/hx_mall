package com.hx.mall.common.utils;

import java.util.UUID;

public class StringUtil {
    public static String randomString(int len){
        if (len<8)len=8;
        String uuid = UUID.randomUUID().toString().replace("-", "");
        if (len>32)return uuid;
        String[] chars = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z" };
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < len; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            buffer.append(chars[x % 0x3E]);
        }
        return buffer.toString();
    }
}
