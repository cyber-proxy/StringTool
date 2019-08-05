package com.tools.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author LC
 * @des
 */
public class StringUtil {
    public static String getLetters(String str) {

        // 除了字母数字下划线之外的字符为非法字符
        Pattern pattern = Pattern.compile("[^a-zA-Z]");
        Matcher matcher = pattern.matcher(str);
        StringBuffer buffer = new StringBuffer();
        // 如果找到非法字符
        while (matcher.find()) {
            // 如果里面包含非法字符如冒号双引号等，那么就把他们消去，并把非法字符前面的字符放到缓冲区
            matcher.appendReplacement(buffer, "");
        }
        // 将剩余的合法部分添加到缓冲区
        matcher.appendTail(buffer);
        return buffer.toString();
    }
}
