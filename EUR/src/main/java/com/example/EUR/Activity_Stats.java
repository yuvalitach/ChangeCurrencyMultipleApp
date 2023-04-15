package com.example.EUR;

import com.example.common.Activity_StatsParent;
import com.example.common.utils.MSP;

public class Activity_Stats extends Activity_StatsParent {

    private float ILS, USD;
    private final float EUR_PER_SHEKEL = (float) 4.08;
    @Override
    protected float getData() {
        ILS = MSP.getInstance().getFloat("ILS", -1);
        USD = MSP.getInstance().getFloat("USD", -1);

        if (ILS==-1){
            return USD * EUR_PER_SHEKEL;
        }
        else 
            return ILS/EUR_PER_SHEKEL;
    }

//    private String CalculateChange() {
//
//    }
}