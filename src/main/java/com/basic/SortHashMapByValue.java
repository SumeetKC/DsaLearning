package com.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {
    public static void main(String[] args) {
        //sort HashMap by value.
        HashMap<String, String> map = new HashMap<>();
        map.put("p1","Sumeet");
        map.put("p2","Abhi");
        map.put("p3","Manali");

        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        list.sort((x,y) -> x.getValue().compareTo(y.getValue()));
        list.forEach((x)->System.out.println(x.getValue() + " " ));

    }
}
