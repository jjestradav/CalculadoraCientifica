package com.example.calculadoracientifica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calculadoracientifica.model.Calculadora;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private EditText editText;
    private Button btnDiv;
    private Button btnMut;
    private Button btnC;
    private Button btnDel;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btnSum;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btnRes;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnRaiz;
    private Button btn0;
    private Button btnPunto;
    private Button btnAbrir;
    private Button btnCerrar;
    private Button btnSin;
    private Button btnCos;
    private Button btnTan;
    private Button btnPorcentaje;
    private Button btnCsc;
    private Button btnSec;
    private Button btnCot;
    private Button btnIgual;
    private Button btnOff;
    private Button btnFac;
    private Button btnPot;
    private Calculadora model;
    private boolean firstNumberFlag;
    private boolean onlyOneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);
        initButtons();
        setOnClickListenerButtons();
        model=new Calculadora();
        firstNumberFlag=false;
        onlyOneNumber=false;

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDiv:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnDiv);
                firstNumberFlag=true;
                editText.setText("");

            }
                break;
            case R.id.btnMult:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnMult);
                firstNumberFlag=true;
                editText.setText("");
            }
                break;
            case R.id.btnC:
            {
                editText.setText("");
            }
                break;
            case R.id.btnDel:
            {
                String text=editText.getText().toString();

                    if(text.length()!=0) {
                        int index = text.length() - 1;
                        editText.setText(text.substring(0, index));
                    }

            }
                break;

            case R.id.btn1:
            {
                Log.v("HOLA","HOLA");
                 editText.setText(editText.getText().toString()+1);
             }
                break;

            case R.id.btn2:
               {
                   editText.setText(editText.getText().toString()+2);
               }
                break;

            case R.id.btn3:
                editText.setText(editText.getText().toString()+3);
                break;

            case R.id.btnSum:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnSum);
                firstNumberFlag=true;
                editText.setText("");
            }
                break;

            case R.id.btn4:
            {
                editText.setText(editText.getText().toString()+4);
            }
                break;

            case R.id.btn5:
            {
                editText.setText(editText.getText().toString()+5);
            }
                break;

            case R.id.btn6:
             {
                 editText.setText(editText.getText().toString()+6);
             }
                break;

            case R.id.btnRes:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnRes);
                firstNumberFlag=true;
                editText.setText("");
            }
                break;

            case R.id.btn7:
            {
                editText  .setText(editText.getText().toString()+7);
            }
                break;

            case R.id.btn8:
                editText.setText(editText.getText().toString()+8);
                break;

            case R.id.btn9:
                editText  .setText(editText.getText().toString()+9);
                break;

            case R.id.btnRaiz:
                {
                    model.setNum1(Float.parseFloat(editText.getText().toString()));
                    model.setOperador(R.id.btnRaiz);
                    firstNumberFlag=true;
                    editText.setText("");
                    onlyOneNumber=true;
                 }
                break;

            case R.id.btn0:
            {
                editText  .setText(editText.getText().toString()+0);
            }
                break;

            case R.id.btnPunto:
                editText  .setText(editText.getText().toString()+".");
                break;

            case R.id.btnAbrir:
                editText  .setText(editText.getText().toString()+"(");
                break;

            case R.id.btnCerrar:
                editText  .setText(editText.getText().toString()+")");
                break;

            case R.id.btnSin:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnSin);
                firstNumberFlag=true;
                editText.setText("");
                onlyOneNumber=true;
            }
                break;

            case R.id.btnCos:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnCos);
                firstNumberFlag=true;
                editText.setText("");
                onlyOneNumber=true;
            }
                break;

            case R.id.btnTan:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnTan);
                firstNumberFlag=true;
                editText.setText("");
                onlyOneNumber=true;
            }
                break;

            case R.id.btnPorcentaje:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnPorcentaje);
                firstNumberFlag=true;
                editText.setText("");
                onlyOneNumber=true;
            }
                break;

            case R.id.btnCsc:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnCsc);
                firstNumberFlag=true;
                editText.setText("");
                onlyOneNumber=true;
            }
                break;

            case R.id.btnSec:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnSec);
                firstNumberFlag=true;
                editText.setText("");
                onlyOneNumber=true;
            }
                break;

            case R.id.btnCTG:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnCTG);
                firstNumberFlag=true;
                editText.setText("");
                onlyOneNumber=true;
            }
                break;

            case R.id.btnOFF:
            {

            }
                break;

            case R.id.btnFact:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnFact);
                firstNumberFlag=true;
                editText.setText("");
                onlyOneNumber=true;
            }
                break;

            case R.id.btnPot:
            {
                model.setNum1(Float.parseFloat(editText.getText().toString()));
                model.setOperador(R.id.btnPot);
                firstNumberFlag=true;
                editText.setText("");
            }
                break;

            case R.id.btnIgual:
            {
                if(onlyOneNumber || firstNumberFlag) {
                    if (firstNumberFlag) {
                        try {
                            model.setNum2(Float.parseFloat(editText.getText().toString()));
                        } catch (Exception e) {
                            Log.e("ERROR",e.getMessage());
                        }
                    }
                        model.calcular();
                        String result = String.valueOf(model.getResultado());
                        this.editText.setText(result);
                        firstNumberFlag = false;
                        onlyOneNumber=false;


                }
            }
                break;

                default:
            {

            }
            break;
        }
    }


    private void initButtons(){
        editText=findViewById(R.id.editText);
        btnDiv=findViewById(R.id.btnDiv);
        btnMut=findViewById(R.id.btnMult);
        btnC=findViewById(R.id.btnC);
        btnDel=findViewById(R.id.btnDel);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btnSum=findViewById(R.id.btnSum);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btnRes=findViewById(R.id.btnRes);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnRaiz=findViewById(R.id.btnRaiz);
        btn0=findViewById(R.id.btn0);
        btnPunto=findViewById(R.id.btnPunto);
        btnAbrir=findViewById(R.id.btnAbrir);
        btnCerrar=findViewById(R.id.btnCerrar);
        btnSin=findViewById(R.id.btnSin);
        btnCos=findViewById(R.id.btnCos);
        btnTan=findViewById(R.id.btnTan);
        btnPorcentaje=findViewById(R.id.btnPorcentaje);
        btnCsc=findViewById(R.id.btnCsc);
        btnSec=findViewById(R.id.btnSec);
        btnCot=findViewById(R.id.btnCTG);
        btnIgual=findViewById(R.id.btnIgual);
        btnOff=findViewById(R.id.btnOFF);
        btnFac=findViewById(R.id.btnFact);
        btnPot=findViewById(R.id.btnPot);
    }

    private void setOnClickListenerButtons(){
        editText.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMut.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btnRes.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnRaiz.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnPunto.setOnClickListener(this);
        btnAbrir.setOnClickListener(this);
        btnCerrar.setOnClickListener(this);
        btnSin.setOnClickListener(this);
        btnCos.setOnClickListener(this);
        btnTan.setOnClickListener(this);
        btnPorcentaje.setOnClickListener(this);
        btnCsc.setOnClickListener(this);
        btnSec.setOnClickListener(this);
        btnCot.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnOff.setOnClickListener(this);
        btnFac.setOnClickListener(this);
        btnPot.setOnClickListener(this);


    }
}





