package com.tijaniadewale.temp.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText DollarsAmountEditText = findViewById(R.id.DollarsAmountEditText);
        Double dollarAmountDouble = Double.parseDouble(DollarsAmountEditText.getText().toString());
        Double poundAmount = dollarAmountDouble * 381.20;
        Toast.makeText(this, "₦" + String.format("%.2f", poundAmount), Toast.LENGTH_LONG).show();
        Log.i("Amount: ", DollarsAmountEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
