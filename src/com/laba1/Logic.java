package com.laba1;

import java.util.*;
import java.util.Random;

class Logic {
    Random random=new Random();
    HashMap<Date, String> dateAndForecast = new HashMap<>();
    protected String randomForecast(ArrayList<String> list) {
        String s="";
        int a;
        int b;
        var random=new Random();
        a=Integer.valueOf((random.nextInt(list.size())));
        b=Integer.valueOf((random.nextInt(list.size())));
        while (true) {
            if (a!=b) {
                s = list.get(a) + "\n" + list.get(b);
                return s;
            }else{
                b=Integer.valueOf((random.nextInt(list.size())));
            }
        }
    }
    protected String randomWeather(Date date,ArrayList<String> list){
        if(dateAndForecast.containsKey(date)) {
            return dateAndForecast.get(date);
        } else{
            dateAndForecast.put(date,list.get(Integer.valueOf((random.nextInt(list.size())))));
            return dateAndForecast.get(date);
        }
    }
    protected String randomWeather(ArrayList<String> list){
        return list.get(Integer.valueOf((random.nextInt(list.size()))));
    }
}
