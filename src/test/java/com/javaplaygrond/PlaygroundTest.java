package com.javaplaygrond;


import jdk.incubator.vector.VectorOperators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println(0 % a);//0
        System.out.println(1 % a);//1
        System.out.println(2 % a);//2
        System.out.println(3 % a);
        System.out.println(4 % a);
        System.out.println(5 % a);
        System.out.println(6 % a);
    }


    @Test
    public void 연산자_형변환() {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a / b);
        System.out.println(c / d);
        System.out.println(a / d);
    }

    @Test
    public void 단항연산자() {
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
    public void 비교_연산자() {
        System.out.println("이어진");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
        System.out.println("이진우");
    }

    @Test
    void 이어진의_테스트() {
        List<String> names = new ArrayList<>();
//        피카추", "라이츄", "파이리", "꼬북이", "피죤
        List<Integer> nameLength = names.stream().map(String::length).collect(Collectors.toList());

        Assertions.assertNotNull(names);
    }

    @Test
    void if문에대해서araboza() {
        // given
        String name = "이희진";

        // when
        if (name == "이희진") {
            System.out.println("이름이 이희진이 맞아요");
        } else {
            System.out.println("이름이 이희진이 아닌데용?");
        }

        // then
    }

    @Test
    void if문에대해서_한번_더_알아보자() {
        // given
        String name = "이진우";

        // when
        if (name.equals("이어진")) {
            System.out.println("이어진이 맞아요");
        } else if (name.equals("이희진")) {
            System.out.println("희진이 맞아요");
        } else {
            System.out.println("나머지는 진우밖에 없는데..");
        }

        // then
    }

    @Test
    void if_statment() {
        // given
        String name = "hjlee";

        // when
        if (isEjlee(name)) {
            System.out.println("ding dong dang");
        } else {
            System.out.println("nope");
        }

        // then
    }

    boolean isEjlee(String name) {
        System.out.println(name.equals("ejlee"));
        return name.equals("ejlee");
    }

    @Test
    void 삼항연산자() {
        // given
        String name = "jwlee";
        System.out.println(isEjlee(name) ? "이어진이 맞아요" : "이어진이 아니에요");
        // when

        // then
    }


    @Test
    void 중첩if문() {
        // given
        String name = "이진우";

        // when
        if (name == "이진우") {
            System.out.println("이진우가 맞아요");
            if (name.length() > 1) {
                System.out.println("이진우 이름의 글자가 3글자네요");

                if (isEjlee(name)) {
                    System.out.println("이어진도 맞네요");
                } else {
                    System.out.println("이어진은 아니였네요;");
                }
            }
        }

        // then
    }

    @Test
    void 진우if문_테스트() {
        // given

        String name = "소";
        if (name == "돼지") {
            System.out.println("꿀꿀");

        } else if (name == "병아리") {
            System.out.println("삐약삐약");

        } else {
            System.out.println("돼지가 아니에요");
        }

        // when

        // then
    }

    @Test
    void 불린타입으로if문짓기() {
        // given
        boolean isTrue = true;

        if (isTrue) {
            System.out.println("true!!!!");
        } else {
            System.out.println("false!!!");
        }

        // when

        // then

        System.out.println(name3("이희진"));

    }

    public int count() {
        return 1;
    }

    public String name() {
        return "이어진";
    }

    public String name2() {
        String name = "이진우";
        return name;
    }

    public String name3(String name) {
        return name;
    }

    public int integer(int count) {
        List<String> names = Arrays.asList("이어진", "이희진", "이진우", "정복문", "이길주");

        for (int i = 0; i <= names.size(); i++) {
            int i1 = count + i;
            count++;
            System.out.println(i);
            System.out.println(i1);

            if (i == 2) {
                System.out.println("그만 돌아!");
                break;
            } else {
                System.out.println("아직이네");
            }
        }

        return count;
    }

    @Test
    void integer에대한테스트() {
        // given
        integer(10);
        // when

        // then
    }

    @Test
    void 변수다시공부() {
        int number;  //number가 변수
        int number2 = 10; //number2에 10을 초기화함
        System.out.println(number2);

    }
    @Test
    void 타입다시공부() {
        Date today = null;

        String name = "Ja"+"Va";
        System.out.println(name);

        String a = 7 + " ";
        String b = " " + 7;
        String c = 7 + "7";
        String d = "7" + 7;
        String e = 7 + 7 + "7"; //  7+7 이후에 7이 붙음
        String f = "7" + 7 + 7;  //  7과7이 붙고 7이붙음

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }


    @Test
    void 연산자연습_크다_작다() {

        //연산자연습
        // ><

        System.out.println(1 == 2);           //false
        System.out.println(1 == 1);           //true
        System.out.println("one" == "two");   //false
        System.out.println("one" == "one");   //true


        System.out.println(10 > 20);       //false
        System.out.println(10 > 2);            //true
        System.out.println(10 > 10);           //false
    }
    @Test
    void 연산자연습_크거나같다_작거나같다(){

        System.out.println(10 >= 20); // false
        System.out.println(10 >= 2); // true
        System.out.println(10 >= 10); // true

    }
    @Test
    void 연산자연습_점equals(){
        String a = "Hello world";
        String c = a;
        String b = new String("Hello world");
        System.out.println("a => : " + System.identityHashCode(a));
        System.out.println("b  =>  : " + System.identityHashCode(b));
        System.out.println("c =>  : " + System.identityHashCode(c));
        System.out.println("a == b =" + (a == b)); //false
        System.out.println("a == c =" + (a == c)); //false
        System.out.println("a.equals(b) =" + a.equals(b));  //true
    }
    @Test
    void if문연습() {
        if (true) {
            System.out.println("result : true");

            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);       //조건이true라서 1234를 포함하여 5출력

    }
    @Test
    void if문연습2() {
        if (false) {
            System.out.println("result : true");

            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);          //조건이false라서 1234를 건너뛰고 5 만 출력


    }
    @Test
    void else연습() {
        if (true) {
            System.out.println(1);   //조건이true라서 1출력
        } else {
            System.out.println(2);
        }
    }
    @Test
    void else연습2(){
        if (false) {
            System.out.println(1);    //조건이false라서 else값 2 출력
        } else {
            System.out.println(2);
        }
    }
    @Test
    void else_if연습() {
        if(false){
            System.out.println(1);    //조건이 false라서 else if로 넘어감
        } else if(false) {
            System.out.println(2);    //조건이 false라서 다음으로 넘어감
        } else if(true) {
            System.out.println(3);    //조건이 true라서 3 출력
        } else {
            System.out.println(4);
        }

    }
    @Test
    void 논리연산자() {
        if (true && true) {
            System.out.println(1);
        }

        if (true && false) {
            System.out.println(2);
        }

        if (false && true) {
            System.out.println(3);
        }

        if (false && false) {
            System.out.println(4);
        }

    }
    @Test
    void 논리연산자개선(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }

}