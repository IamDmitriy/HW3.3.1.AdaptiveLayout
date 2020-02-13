package com.example.adaptivelayout;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEigth;
    private Button btnNine;
    private Button btnPoint;
    private TextView txtOutput;
    private String textBuffer = "";

    View.OnClickListener onButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            String curBtn = btn.getText().toString();

            if (!TextUtils.isEmpty(txtOutput.getText())) {
                textBuffer = txtOutput.getText().toString();
            }

            if (curBtn.equals(getString(R.string.btn_point)) &&
                    textBuffer.contains(getString(R.string.btn_point))) {
                Toast.makeText(MainActivity.this,
                        getString(R.string.error_point_already_exist), Toast.LENGTH_SHORT).show();
            } else {
                textBuffer += curBtn;
            }

            TextBuffer.text = textBuffer;

            txtOutput.setText(textBuffer);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEigth = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnPoint = findViewById(R.id.btnPoint);

        txtOutput = findViewById(R.id.txtOutput);

        btnZero.setOnClickListener(onButtonClickListener);
        btnOne.setOnClickListener(onButtonClickListener);
        btnTwo.setOnClickListener(onButtonClickListener);
        btnThree.setOnClickListener(onButtonClickListener);
        btnFour.setOnClickListener(onButtonClickListener);
        btnFive.setOnClickListener(onButtonClickListener);
        btnSix.setOnClickListener(onButtonClickListener);
        btnSeven.setOnClickListener(onButtonClickListener);
        btnEigth.setOnClickListener(onButtonClickListener);
        btnNine.setOnClickListener(onButtonClickListener);
        btnPoint.setOnClickListener(onButtonClickListener);

        if (!TextBuffer.text.equals("")) {
            txtOutput.setText(TextBuffer.text);
        }

    }

}