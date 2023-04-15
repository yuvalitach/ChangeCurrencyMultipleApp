package com.example.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.common.utils.MSP;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public abstract class Activity_StatsParent extends AppCompatActivity {

    private MaterialTextView stats_LBL_save;

    protected abstract float getData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        findViews();

        updateUI();


//        findViews();
//        mainEDTFirstMoney.requestFocus();
//        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
//
//        calcBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MSP.getInstance().putInt("ILS", Integer.parseInt(String.valueOf(mainEDTFirstMoney.getText())));
//                // MSP.getInstance().putInt("SecMoney", Integer.parseInt(String.valueOf(mainEDTSecMoney.getText())));
////                startActivity(new Intent(Activity_Home.this,App_Parent.statsClass));
//            }
//        });
//
//        changeImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String temp = firstMoney.getText().toString();
//                firstMoney.setText(secondMoney.getText());
//                secondMoney.setText(temp);
//
//                temp = mainEDTFirstMoney.getText().toString();
//                mainEDTFirstMoney.setText(mainEDTSecMoney.getText());
//                mainEDTSecMoney.setText(temp);
//            }
//        });
//
//
//        updateUI();
    }

    private void updateUI() {
        stats_LBL_save.setText("Your change is "+getData());
    }

    private void findViews() {
        stats_LBL_save = findViewById(R.id.stats_LBL_save);
    }

}