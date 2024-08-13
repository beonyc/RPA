package org.example;

import com.google.gson.Gson;
import groovy.json.JsonOutput;
import lombok.Data;
import lombok.Getter;
import org.checkerframework.checker.regex.qual.Regex;
import pojo.RestData;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static String stroka="1) Опыт работы с Vue.js 3(ComFrontend developer API) 2) Опыт работы с Quasar 3) Опыт работы с микро-фронтэндом (single-spa) 4) CSS-modules 5) Паттерны проектирования 6) Функциональные и headless компоненты (Vue / Nuxt) 7) Опыт проектирования и написания JS библиотек 8) Опыт работы с моно-репозиториями (lerna, yarn workspaces) 9) Опыт работы с OAuth 2 (Keycloak) 10) Опыт разработки backend сервисов 11) Опыт работы с Docker и Kubernetes 12) Опыт работы с unit тестами (jest, vue-test-utils) 13) Опыт работы с системами сборки (webpack/rollup/vite)";
    static Integer a;
    static int[] arr = {1, 1, 2, 3, 4, 5, 6, 6, 10, 11, 11};
    static List<String> list = new ArrayList<>(Arrays.asList("zz", "bbbb", "bb", "ooooo000", "a", "xfff", "q1c", "zz"));

    static List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    static HashMap<String, String> emails = new HashMap<>();

    public static void main(String[] args) {
        int[] arr1={1,2};
        Integer[] arr2={1,2};
        List<Integer>list1=Arrays.stream(arr1).boxed().collect(Collectors.toList());
        list1=Arrays.asList(arr2);
    }

    private static int[] twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if (arr[i]+arr[j]==target) return new int[]{arr[i],arr[j]};
            }
        }

        return new int[]{0,0};
    }


    static List<Integer> shuffle(List<Integer> list) {
        Integer[] arr = list.toArray(new Integer[]{});
        for (int i = 0; i < arr.length; i++) {
            int random = new Random().nextInt(arr.length);
            Integer buff = arr[i];
            arr[i] = arr[random];
            arr[random] = buff;

        }
//        for (int i = 0; i < list.size(); i++) {
//            int random = new Random().nextInt(list.size());
//            Integer buff = list.get(i);
//            list.set(i, list.get(random));
//            list.set(random, buff);
//
//        }
        return list;
    }


}
