package com.tools.logs;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author LC
 * @des
 */
public class Log {
    public final static void log(String log) {
        System.out.println(log);
    }

    // 打印日志到文件
    public static void logFile(String file) {
        try {
            PrintStream p = null;
            FileOutputStream outputStream = new FileOutputStream(file);
            p = new PrintStream(outputStream, true);
            System.setOut(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 关闭文件
    public static void logFileEnd() {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }
}
