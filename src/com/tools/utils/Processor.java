package com.tools.utils;

import com.tools.constant.Constant;
import com.tools.logs.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author LC
 * @des 实现从代码中提取出常量字符串（形如“”），并将其统一定义到一个class文件下，同时将原始常量字符串替换为常量的引用。
 */
public class Processor {
    public static void process(){
        String[] lines = Constant.txt.split("\n");
        List<String> constantStrList = new ArrayList<>();
        Set<String> nameSet = new HashSet<>();
        List<String> sourceList = new ArrayList<>();
        for (String line : lines){
            if (line.contains("\"")) {
                int first = line.indexOf("\""); //单引号第一次出现的位置
                int last = line.lastIndexOf("\""); //单引号最后一次出现的位置
                String strValue = line.substring(first + 1, last);//截取后变成新的字符串
                // 生成变量的引用
                String name = "rule_" + StringUtil.getLetters(strValue);
                Log.log(strValue);
                // 插入变量的引用
                String lineReplace = line.replace( strValue , "Constant." + name);
                // 去掉引号
                String sourceLine = lineReplace.replaceAll("\"", "");
                // 加入生成的原始语句
                sourceList.add(sourceLine);
                if (!nameSet.contains(name)) {
                    constantStrList.add("public static final String " + name + " = " + "\"" + strValue + "\";");
                    nameSet.add(name);
                }
            }else {
                // 加入原始语句
                sourceList.add(line);

            }
        }
        Log.logFile("Constant.java");
        Log.log("public class Constant{");
        for (String str : constantStrList){
            Log.log("\t" + str);
        }
        Log.log("}");
        Log.logFileEnd();
        Log.logFile("A.java");
        Log.log("public class A{");
        for (String str : sourceList){
            Log.log("\t" + str);
        }
        Log.log("}");
        Log.logFileEnd();
    }
}
