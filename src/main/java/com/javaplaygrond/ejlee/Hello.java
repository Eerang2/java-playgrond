package com.javaplaygrond.ejlee;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class Hello {

    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();

        foods.add("바나나");
        foods.add("바나나1");
        foods.add("바나나2");
        foods.add("바나나3");
        foods.add("바나나4");
        foods.add("바나나5");
        foods.add("바나나6");
        foods.add("바나나7");
        eat(foods);
        log.info("eat(foods) >>>>>>>>>>>>>>>>>>>>>>>>> {}", eat(foods));


    }


    public static String eat(List<String> foods) {
        if (foods.get(0) == ("바나나")) {
            stomachForBanana(foods);
            log.info("stomach >>>>>>>>>>>>>>>>> {}", stomachForBanana(foods));
            return "12313";
        } else {
            return "아 배불러";
        }
    }

    public static String stomachForBanana (List<String> foods) {
        for (int i = 0; i <= foods.size(); i++) {
            log.info("바나나들 : {}", foods);
            log.info("각각의 요소들 i : {}", i);
            log.info("food size : {}", foods.size());
        }

        return "바나나를 소화했어요";
    }

    // dsfsfsddsdf
    public List<String> practice1(String i){
        int number;
        number = 10;

        // uyiuuiy
        // tyu
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        return list;
    }

}
