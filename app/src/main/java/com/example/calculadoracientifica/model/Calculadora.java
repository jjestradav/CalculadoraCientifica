package com.example.calculadoracientifica.model;

import com.example.calculadoracientifica.R;

public class Calculadora {

    private float num1;
    private float num2;
    private int operador;
    private float resultado;
    public Calculadora(){

    }
    public Calculadora(float num1, float num2){
        this.num1=num1;
        this.num2=num2;
    }


    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public int getOperador() {
        return operador;
    }

    public float getResultado() {
        return resultado;
    }

    public void suma(){
        this.resultado=this.num2 + this.num2;
    }

    public void resta(){
      this.resultado= this.num1-this.num2;
    }

    public void division(){
        this.resultado= this.num1/this.num2;
    }

    public void multiplicacion(){
        this.resultado=  this.num1* this.num2;
    }

    public void raiz(){
        this.resultado= (float) Math.sqrt(this.num1);

    }
    public void potencia(){
        this.resultado=  (float) Math.pow(this.num1,this.num2);
    }

    public void factorial(){
        if(this.num1==0) {
            this.resultado = 1;
            return;
        }
        int aux=1;
        for(int i=(int)num1; i>0; i--)
            aux*=i;

        this.resultado= aux;
    }

    public void cos(){
        this.resultado= (float)Math.cos(this.num1);
    }

    public void sin(){
        this.resultado= (float)Math.sin(this.num1);
    }

    public void tan(){
        this.resultado=  (float)Math.tan(this.num1);
    }

    public void csc(){
        this.resultado=  (float)Math.acos(this.num1);
    }

    public void sec(){
        this.resultado=  (float)Math.acos(this.num1);
    }

    public void cot(){
        this.resultado=  (float)Math.atan(this.num1);
    }


    public void porcentaje(){
        this.resultado=  (this.num1*100)/this.num2;
    }

    public void calcular(){

        switch (this.operador){

            case R.id.btnDiv:
                this.division();
                break;

            case R.id.btnMult:
                this.multiplicacion();
                break;

            case R.id.btnSum:
                this.suma();
                break;

            case R.id.btnRes:
                this.resta();
                break;

            case R.id.btnRaiz:
                this.raiz();
                break;

            case R.id.btnPorcentaje:
                this.porcentaje();
                break;

            case R.id.btnSin:
                this.sin();
                break;

            case R.id.btnCos:
                this.cos();
                break;

            case R.id.btnTan:
                this.tan();
                break;

            case R.id.btnFact:
                this.factorial();
                break;

            case R.id.btnPot:
                this.potencia();
                break;


            case R.id.btnSec:
                this.sec();
                break;

            case R.id.btnCTG:
                this.cot();
                break;

            case R.id.btnCsc:
                this.csc();
                break;





        }


    }



}
