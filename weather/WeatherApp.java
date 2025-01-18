package com.mritunjay.weather;

import java.io.IOException;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("What city would you like to see the weather forecast for ?: ");
            String city = sc.nextLine();
            WeatherAPI api = new WeatherAPI();

            String forcastString = api.getForecast(city);


            WeatherResponseParser parser = new WeatherResponseParser();
            parser.parseAndPrint(forcastString, city);
        }

    }
}
