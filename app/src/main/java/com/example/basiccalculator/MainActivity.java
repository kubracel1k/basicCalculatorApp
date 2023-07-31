package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editTxtNumber1, editTxtNumber2;
    private TextView txtPoint;
    private String number1, number2;
    private int s1, s2, point;
    private Calculate calculate;// yaptığımız sınıfı tanımladık


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtNumber1 = (EditText) findViewById(R.id.txtNumber1);
        editTxtNumber2 = (EditText) findViewById(R.id.txtNumber2);
        txtPoint = (TextView) findViewById(R.id.txtViewPoint);

        // "Temizle" butonunu tanımla ve tıklanma olayını ele al
        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnClearClick(v);
            }
        });

    }

    public void btnCalculate(View v) {
        number1 = editTxtNumber1.getText().toString();
        number2 = editTxtNumber2.getText().toString();

        if (!TextUtils.isEmpty(number1) && !TextUtils.isEmpty(number2)) {// boş olup olmadığı kontrol ediliyor
            s1 = Integer.valueOf(number1);
            s2 = Integer.valueOf(number2);
            calculate = new Calculate(s1, s2);


            if (v.getId() == R.id.btnPlus) {
                point = calculate.point();
            } else if (v.getId() == R.id.btnNegative) {
                point = calculate.negative();
            } else if (v.getId() == R.id.btnStar) {
                point = calculate.star();
            } else if (v.getId() == R.id.btnDivision) {
                point = calculate.division();
            }
            txtPoint.setText("Sonuç : " + point);
        } else {
            txtPoint.setText("girilen değer geçersiz veya boş");
        }
    }
    public void btnClearClick(View v) {
        editTxtNumber1.setText(""); // İlk giriş alanını temizle
        editTxtNumber2.setText(""); // İkinci giriş alanını temizle
        txtPoint.setText(""); // Sonuç alanını temizle
    }

}