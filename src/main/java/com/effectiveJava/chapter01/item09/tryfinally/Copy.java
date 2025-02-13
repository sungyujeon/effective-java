package com.effectiveJava.chapter01.item09.tryfinally;

import java.io.*;

public class Copy {

    private static final int BUFFER_SIZE = 8 * 1024;

    // 자원이 둘 이상이면 try-finally는 지저분함
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}
