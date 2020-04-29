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
            if (a!=b) {//создаём рандомные предсказания,чтобы не повторялись одни и те же делаем проверку
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
    protected String payBilling(int horoscopeBilling,int weatherBilling) {
        double horoscopeCost=3.0;
        double weatherCost=2.0;
        return ("horoscope 3.0$"+"\n"+"weather 2.0$"+"\n"
                +"You used the horoscope "+horoscopeBilling+" times "+"3.0$ x "+horoscopeBilling+" = "+horoscopeBilling*horoscopeCost+"\n"
                +"You used the forecast weather "+weatherBilling+" times "+"2.0$ x "+weatherBilling+" = "+weatherBilling*weatherCost+"\n"+
                "You have to pay "+((horoscopeBilling*horoscopeCost)+(weatherBilling*horoscopeCost))+"$");
    }
}
