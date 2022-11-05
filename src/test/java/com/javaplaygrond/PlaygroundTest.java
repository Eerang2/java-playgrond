package com.javaplaygrond;


import org.junit.jupiter.api.Test;

public class PlaygroundTest {

    @Test
    public void 캐릭터형_다루기() {
        char ch = 'A';
        System.out.println("ch -> " + ch);
        int integerTypeOfCh = (int) ch;
        System.out.println("integerTypeOfCh -> " + integerTypeOfCh);

    }



    @Test
    public void 문자열_다루기() {
        char ch = 'A';
        System.out.println("ch1111 -> " + ch);
        int integerTypeOfCh = (int) ch;
        System.out.println("integerTypeOfCh11111 -> " + integerTypeOfCh);


    }


        @Test
        public void 연산자_다루기() {
            int result1 = 1 + 2;
            System.out.println("result1 = " + result1);

            int result2 = result1 - 1;
            System.out.println("result2 = " + result2);

            int result3 = result2 * 4;
            System.out.println("result3 = " + result3);

            int result4 = result3 / 2;
            System.out.println("result4 = " + result4);
            
            int result5 = result4 % 3;
            System.out.println("result5 = " + result5);

            String firstString = "This is";
            String secondString = " a concatenated string.";
            String thirdString = firstString + secondString;
            System.out.println(thirdString);

    }


    
    @Test
    public void 문자열_나머지() {

        int a = 3;

        System.out.println(0%a);//0
        System.out.println(1%a);//1
        System.out.println(2%a);//2
        System.out.println(3%a);
        System.out.println(4%a);
        System.out.println(5%a);
        System.out.println(6%a);
    }


    @Test
    public void 연산자_형변환 () {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b);
        System.out.println(c/d);
        System.out.println(a/d);
    }
    @Test
    public void 단항연산자 () {
        int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력
    }
    @Test
    public void 비교_연산자 () {
         System.out.println(1==2);  //false
         System.out.println(1==1); //true
         System.out.println("one"=="two");  //false
         System.out.println("one".equals("two"));  //true

        System.out.println("이어진");

        }
    @Test
    public void asdf () {

    }
}
