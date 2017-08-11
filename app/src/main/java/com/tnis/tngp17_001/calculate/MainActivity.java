package com.tnis.tngp17_001.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public char CURRENT_ACTION;
    public int Sum;
    public String Result;
    public int Value;
    public int status = 0;

    public void cal() {
        if (CURRENT_ACTION == ADDITION)
            Sum += Value;
        else if (CURRENT_ACTION == SUBTRACTION)
            Sum -= Value;
        if (Sum < 0)
            Sum = 0;
        Result = Sum + "";
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CURRENT_ACTION = ADDITION;
        final TextView tvNumber = (TextView) findViewById(R.id.tvNumber);
        final TextView tvOperation = (TextView) findViewById(R.id.tvOperation);
        final Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    Value = 1;
                    cal();
                    tvNumber.setText(Result);
                }

            }
        });

        final Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    Value = 3;
                    cal();
                    tvNumber.setText(Result);
                }
            }
        });

        final Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    Value = 5;
                    cal();
                    tvNumber.setText(Result);
                }
            }
        });
        final Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    Value = 7;
                    cal();
                    tvNumber.setText(Result);
                }
            }
        });
        final Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    Value = 9;
                    cal();
                    tvNumber.setText(Result);
                }
            }
        });
        final Button btn11 = (Button) findViewById(R.id.btn11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    Value = 11;
                    cal();
                    tvNumber.setText(Result);
                }
            }
        });

        final Button btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOperation.setText(btnPlus.getText());
                CURRENT_ACTION = ADDITION;
                status = 1;
            }
        });
        final Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOperation.setText(btnSubtract.getText());
                CURRENT_ACTION = SUBTRACTION;
                status = 1;
            }
        });

        final Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOperation.setText(" ");
                tvNumber.setText(" ");
                Sum = 0;
                status = 0;
            }
        });
    }
}
