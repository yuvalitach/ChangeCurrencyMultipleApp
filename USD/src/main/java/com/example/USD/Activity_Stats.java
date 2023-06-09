package com.example.USD;

import com.example.common.Activity_StatsParent;
import com.example.common.utils.MSP;

public class Activity_Stats extends Activity_StatsParent {

    private float ILS, USD;
    private final float USD_PER_SHEKEL = (float) 3.67;
    @Override
    protected float getData() {
        ILS = MSP.getInstance().getFloat("ILS", -1);
        USD = MSP.getInstance().getFloat("USD", -1);

        if (ILS==-1){
            return USD * USD_PER_SHEKEL;
        }
        else 
            return ILS/USD_PER_SHEKEL;
    }

//    private String CalculateChange() {
//
//    }
}