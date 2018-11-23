package com.agu;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by breeze on 2018/4/12.
 */
public class SearchDemo {

    private static AtomicInteger number = new AtomicInteger(0);

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();// old
        map.put("one", 1);
        map.put("two", 2);
        System.out.println(map);

        Map<String, Integer> map2 = new HashMap<>();// new
        map2.put("three", 3);
        map2.putAll(map);
        System.out.println(map2);

        Map<String, Integer> map3 = new HashMap<>();// 空Map
        map3.putAll(map2);
        System.out.println(map3);
    }

    public static String getSerialNumber() {
        int numbers = number.incrementAndGet();
        StringBuffer sb = new StringBuffer();
        Calendar calendar = Calendar.getInstance();
        sb.append(calendar.get(Calendar.YEAR));
        sb.append(calendar.get(Calendar.MONTH) + 1);
        sb.append(calendar.get(Calendar.DAY_OF_MONTH));
        sb.append(calendar.get(Calendar.HOUR));
        sb.append(calendar.get(Calendar.MINUTE));
        sb.append(numbers);
        return sb.toString();

    }

    private static int binarySearch(List<Integer> list, int value) {
        int firstIndex = 0;
        int lastIndex = list.size() - 1;
        int middleIndex;
        System.out.println("开始：" + System.currentTimeMillis());
        while (firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;
            System.out.println(middleIndex);
            if (value == list.get(middleIndex)) {
                System.out.println("结束：" + System.currentTimeMillis());
                return list.get(middleIndex);
            }
            if (value > list.get(middleIndex)) {
                firstIndex = middleIndex + 1;
            }
            if (value < list.get(middleIndex)) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
