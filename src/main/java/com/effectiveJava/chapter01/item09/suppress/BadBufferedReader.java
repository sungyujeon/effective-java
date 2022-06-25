package com.effectiveJava.chapter01.item09.suppress;

import java.io.*;

public class BadBufferedReader extends BufferedReader {

    /**
     * 실행 시 가장 나중에 발생한 예외가 보이는데, 가장 처음에 발생한 예외를 찾을 수 없음
     * 따라서 close() 할 때의 StreamCorruptedException만 잡아서 예외를 잡아먹음
     * */

    public BadBufferedReader(Reader in) {
        super(in);
    }

    public BadBufferedReader(Reader in, int sz) {
        super(in, sz);
    }

    @Override
    public String readLine() throws IOException {
//        return super.readLine();
        throw new CharConversionException();
    }

    @Override
    public void close() throws IOException {
//        super.close();
        throw new StreamCorruptedException();
    }
}
