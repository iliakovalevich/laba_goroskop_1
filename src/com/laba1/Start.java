package com.laba1;

import java.io.FileNotFoundException;

public class Start {
    private final static String horoscopeFile="src/com/laba1/horoscope.txt";
    private final static String weatherFile="src/com/laba1/weather.txt";

    IOC ioc =new IOC();
    IOF iof=new IOF();
    Logic logic=new Logic();
    public static void main(String[] args) {
        try{
            Start start=new Start();
            start.menu();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void menu() throws FileNotFoundException {
        while(true){
            ioc.printMenu();
            switch (ioc.inputNumberOfMenu()){
                case 1:
                    caseHoroscope();
                    break;
                case 2:
                    caseWeather();
                case 3:
                    caseBilling();
                    break;
                case 0:
                    return;
            }
        }
    }
    private void caseHoroscope() throws FileNotFoundException {
        ioc.inputDate("date of birthday ");
        ioc.printPeriod();
        switch (ioc.inputNumberOfMenu()) {
            case 1:
                ioc.printString(logic.randomForecast(iof.readTxtFile(horoscopeFile)));
                break;
            case 2:
                ioc.printString(logic.randomForecast(iof.readTxtFile(horoscopeFile)));
                break;
            case 3:
                ioc.printString(logic.randomForecast(iof.readTxtFile(horoscopeFile)));
                break;
        }
    }
    private void caseWeather() throws FileNotFoundException {
        ioc.printPeriod();
        switch (ioc.inputNumberOfMenu()) {
            case 1:
                ioc.printString(logic.randomWeather(ioc.inputDate("date of forecast"),iof.readTxtFile(weatherFile)));
                break;
            case 2:
                ioc.printString(logic.randomWeather(iof.readTxtFile(weatherFile)));
                break;
            case 3:
                ioc.printString(logic.randomWeather(iof.readTxtFile(weatherFile)));
                break;
        }
    }
    private void caseBilling() throws FileNotFoundException{

    }
}