package com.example.common;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.common.utils.MSP;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;


public class Activity_Home extends AppCompatActivity {

    private TextInputEditText mainEDTFirstMoney, mainEDTSecMoney;
    private ExtendedFloatingActionButton calcBtn;
    private static TextView secondMoney;
    private TextView firstMoney;
    ImageView changeImageView;

    private boolean first=false, second=true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViews();

        mainEDTFirstMoney.requestFocus();

        // Show the keyboard
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);


        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MSP.getInstance().putFloat("ILS", Integer.parseInt(String.valueOf(mainEDTFirstMoney.getText())));
//                MSP.getInstance().putFloat("SecMoney", Integer.parseInt(String.valueOf(mainEDTSecMoney.getText())));
                startActivity(new Intent(Activity_Home.this,App_Parent.statsClass));
            }
        });

        changeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = firstMoney.getText().toString();
                firstMoney.setText(secondMoney.getText());
                secondMoney.setText(temp);

                temp = mainEDTFirstMoney.getText().toString();
                mainEDTFirstMoney.setText(mainEDTSecMoney.getText());
                mainEDTSecMoney.setText(temp);


                mainEDTSecMoney.setEnabled(!second);
                mainEDTFirstMoney.setEnabled(!first);

                mainEDTFirstMoney.setText("0");
                mainEDTSecMoney.setText("0");
            }
        });

    }

    private void findViews() {
        mainEDTFirstMoney = findViewById(R.id.main_EDT_firstMoney);
        mainEDTSecMoney = findViewById(R.id.main_EDT_SecMoney);
        calcBtn = findViewById(R.id.BTN_calc);
        secondMoney = findViewById(R.id.secondMoney);
        changeImageView = findViewById(R.id.changeImageView);
        firstMoney = findViewById(R.id.firstMoney);
    }
}