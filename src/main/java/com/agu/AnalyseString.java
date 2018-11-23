package com.agu;

/**
 * Created by breeze on 2018/4/17.
 */
public class AnalyseString {

    public static void main(String[] args) {
        String s = "中国";
        System.out.println(s.hashCode());
        char[] chars = s.toCharArray();
        String[] strings = {"a"};
        strings.hashCode();
        Integer integer = new Integer(3);
        System.out.println("chars:" + chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

//    public int hashCode() {
//        int h = hash;
//        if (h == 0 && value.length > 0) {
//            char val[] = value;
//
//            for (int i = 0; i < value.length; i++) {
//                h = 31 * h + val[i];
//                  h1 = 31 * 0 + val[0] = 97
//                  h2 = 31 * h1 + val[1]; = 31 * 97 + 98
//            }
//            hash = h;
//        }
//        return h;
//    }
}
