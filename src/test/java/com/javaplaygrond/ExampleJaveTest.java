package com.javaplaygrond;

import org.junit.jupiter.api.Test;

public class ExampleJaveTest {
    @Test
    //주석연습
    public static void main(String[] args) {
        String a, b; // 두개의 변수가 같은데이터 타입일때 이와같이 코드를 작성.
        /*
        a = "coding";
        b = "everybody";
        System.out.println(a+b);
         */
    }
    @Test
    /**
     * Prints an integer and then terminate the line. This method behaves as
     * though it invokes <code>{@link #print(int)}</code> and then
     * <code>{@link #println()}</code>.
     *
     * @param x  The <code>int</code> to be printed.
     */
    public static void main(int x) {
        synchronized (this) {
            print(x);
            newLine();

        }
}
