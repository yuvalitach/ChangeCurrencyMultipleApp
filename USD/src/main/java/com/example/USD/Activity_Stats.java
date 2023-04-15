package com.example.USD;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.common.Activity_StatsParent;
import com.example.common.utils.MSP;
import com.example.usd.R;

public class Activity_Stats extends Activity_StatsParent {

    private int ILS, USD;
    private final double USD_PER_SHEKEL = 3.63;
    @Override
    protected String getData() {
        ILS = MSP.getInstance().getInt("ILS", 100);
        USD = MSP.getInstance().getInt("USD", 100);
        Toast.makeText(this, "ILS "+ILS+" USD"+USD, Toast.LENGTH_SHORT).show();
//        return "Your Change is"+CalculateChange();
        return "NA";
    }

//    private String CalculateChange() {
//
//    }
}