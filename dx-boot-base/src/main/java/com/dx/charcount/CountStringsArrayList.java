package com.dx.charcount;

import java.util.ArrayList;

/**
 * Description: com.dx.charcount
 *
 * @author yaoj
 * @version 1.0
 * @copyright Copyright (c) 文理电信
 * @since 2019/9/5
 */
public class CountStringsArrayList {
    public static void main(String[] args) {
        String string = "wermnxmnio34oi9xnmsdkfje";//这里可以是任意字符串
        ArrayList<Character> list = new ArrayList<>();
        char[] chars = string.toCharArray();//将字符串转化成字符数组
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            list.add(aChar);//将字符数组元素添加到集合中
        }
        System.out.println(list);//打印测试
        for (int i = 0; i < list.size(); i++) {//遍历集合取出每个字符
            int count = 0;//定义计数器
            Character character = list.get(i);
            for (int j = 0; j < chars.length; j++) {//遍历数组取出每个字符和集合中的元素比较
                char aChar = chars[j];
                if (character.equals(aChar)){//如果集合中的元素有等于数组中的字符,计数器加1
                    count++;
                }
            }
            System.out.println(character + "出现了" + count + "次");//打印结果
        }
    }
}