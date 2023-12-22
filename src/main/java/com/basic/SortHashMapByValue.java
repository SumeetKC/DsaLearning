package com.basic;

import java.util.*;

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

        HashMap<String, String> sortedmap = new LinkedHashMap<>();
        for(Map.Entry<String,String> value : list){
            sortedmap.put(value.getKey(), value.getValue());
        }
        sortedmap.entrySet().forEach(x-> System.out.println("Value is : "+x.getValue()));

    }
}
