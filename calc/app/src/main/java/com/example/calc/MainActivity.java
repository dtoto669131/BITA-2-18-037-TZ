package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnDot;
    Button btnClear;
    EditText edl;
    float res1,res2;
    boolean Add,Sub,Mul,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById((R.id.btn1));
        btn2=(Button)findViewById((R.id.btn2));
        btn3=(Button)findViewById((R.id.btn3));
        btn4=(Button)findViewById((R.id.btn4));
        btn5=(Button)findViewById((R.id.btn5));
        btn6=(Button)findViewById((R.id.btn6));
        btn7=(Button)findViewById((R.id.btn7));
        btn8=(Button)findViewById((R.id.btn8));
        btn9=(Button)findViewById((R.id.btn9));
        btn0=(Button)findViewById((R.id.btn0));
        btnAdd=(Button)findViewById((R.id.btnAdd));
        btnDiv=(Button)findViewById((R.id.btnDiv));
        btnMul=(Button)findViewById((R.id.btnMul));
        btnDot=(Button)findViewById((R.id.btnDot));
        btnEqual=(Button)findViewById((R.id.btnEqual));
        btnClear=(Button)findViewById(R.id.btnClear);
        edl=(EditText)findViewById(R.id.editTextTextPersonName);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "1"));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "2"));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "3"));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "4"));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "5"));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "6"));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "7"));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "9"));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "9"));
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "0"));
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "."));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText((edl.getText() + "1"));
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edl==null) {
                    edl.setText("");
                }
                else {
                    res1=Float.parseFloat(edl.getText()+"");
                    Add=true;
                    edl.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edl == null) {
                    edl.setText("");
                } else {
                    res1 = Float.parseFloat(edl.getText() + "");
                    Mul = true;
                    edl.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edl == null) {
                    edl.setText("");
                } else {
                    res1= Float.parseFloat(edl.getText() + "");
                    Sub = true;
                    edl.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edl == null) {
                    edl.setText("");
                } else {
                    res1 = Float.parseFloat(edl.getText() + "");
                    Div = true;
                    edl.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2 = Float.parseFloat(edl.getText() + "");
                if (Add == true) {
                    edl.setText(res1 + res2 + "");
                    Add = false;
                }
                if (Sub == true) {
                    edl.setText(res1-res2 + "");
                    Sub = false;
                }
                if (Mul == true) {
                    edl.setText(res1*res2 + "");
                    Mul = false;
                }
                if (Div == true) {
                    edl.setText(res1/res2+"");
                    Add = false;
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edl.setText("");
            }
        });

        }


    }
