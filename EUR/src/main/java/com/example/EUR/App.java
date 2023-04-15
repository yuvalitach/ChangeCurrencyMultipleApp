package com.example.EUR;

import com.example.common.App_Parent;
import com.example.eur.BuildConfig;

public class App extends App_Parent {

    @Override
    protected String getWeatherApiKey() {
        return BuildConfig.WEATHER_API_KEY;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        statsClass = Activity_Stats.class;
    }

}
