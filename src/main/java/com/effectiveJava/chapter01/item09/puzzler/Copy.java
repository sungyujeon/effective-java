package com.effectiveJava.chapter01.item09.puzzler;

import java.io.*;

public class Copy {

    private static final int BUFFER_SIZE = 8 * 1024;

    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);
        try {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                // 안전한가?
                // IOException이 발생하지 않는다면 안전하지 않다
            }

            try {
                in.close();
            } catch (IOException e) {
                // 안전한가?
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String src = "";
        String dst = "";
        copy(src, dst);
    }
}
