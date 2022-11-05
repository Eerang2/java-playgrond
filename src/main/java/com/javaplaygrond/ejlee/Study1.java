package com.javaplaygrond.ejlee;

import java.net.SocketOption;
import java.util.Date;
    /*dnsdnsd'flnasd'lfnkas'lkfnasflbasdlfbasklfna'slmnf
          fsdkf;asbjfa;jsbdf
         jsdbflaksbf'KLF'*/

//HAHAHAHAHAHAAHAHAHAHAAHAH

public class Study1 {

    public static void main(String[] args) {
        //정수형변수 넘버 선언 후, 변수값 10으로 초기화(저장)한다.
        int number;
        number = 10;

        System.out.println(number);

        //Date today = new Date();
        Date today = null;


        System.out.println(today);
        boolean power = true;
        System.out.println(power);

        String name = "Jinu";
        System.out.println(name);

        String a = " " + 7;
        System.out.println(a);

        String b = "JA" + "BA";
        System.out.println(b);

        String c = 7 + 4 + "";
        System.out.println(c);
        float f = 1.2345678890123345690f;//끝자리에서 반올림
        float f2 = 0.1000000001f;
        double d = 1.2345678901204567890;
        double d2 = 0.1000000000000001;//<-0이 14개
        double d3 = 0.100000001;
        float pi = 3.14f;
        double velocity = 3.0E5D;

        System.out.println(f);
        System.out.println(f2);
        System.out.println(pi);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(velocity);

        char defa;

        defa = 'A';

        Character character = defa;


        double e = 100.0;
        int i = 100;
        int result = i + (int) e;

        System.out.println("e=" + e);
        System.out.println("i=" + i);
        System.out.println("result=" + result);

        byte h = 10;//바이트 얘도 10
        int u = (int) h;//바이트를 형변환해서 가져온 인트도 10
        System.out.println("u=" + u);
        System.out.println("h=" + h);

        int num1 = 0B00000000000000000000000000000101;//양수5
        int num2 = 0B11111111111111111111111111111011;//음수-5

        int sum = num1 + num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);

        long num3 = 1234567890L;//long형은 L또는l 이라는걸 써서 형 표현
        System.out.println(num3);

        float fNum = 3.14f;//float형임을 f를 붙여 사용


    }


}

