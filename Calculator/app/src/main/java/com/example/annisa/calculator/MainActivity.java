package com.example.annisa.calculator;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public String str = "";
    Character op = 'q';
    float i, num, numtemp;
    EditText lihatHasil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tombolKuadrat = (Button) findViewById(R.id.tombolKuadrat);
        tombolKuadrat.setText(Html.fromHtml("x<sup>2</sup"));
        lihatHasil = (EditText) findViewById(R.id.editText);

    }


    public void tombol1click(View v) {
        insert(1);
    }

    public void tombol2click(View v) {
        insert(2);
    }

    public void tombol3click(View v) {
        insert(3);
    }

    public void tombol4click(View v) {
        insert(4);
    }

    public void tombol5click(View v) {
        insert(5);
    }

    public void tombol6click(View v) {
        insert(6);
    }

    public void tombol7click(View v) {
        insert(7);
    }

    public void tombol8click(View v) {
        insert(8);
    }

    public void tombol9click(View v) {
        insert(9);
    }

    public void tombol0click(View v) {
        insert(0);
    }

    public void tombolResetclick(View v){
        reset();
    }

    public void tombolKaliclick(View v){
        perform();
        op = '*';
    }

    public void tombolTambahclick(View v){
        perform();
        op = '+';
    }

    public void tombolKurangclick(View v){
        perform();
        op = '-';
    }

    public void tombolBagiclick(View v){
        perform();
        op = '/';
    }

    public void tombolPersenclick(View v){
        perform();
        op = '%';
    }

    public void tombolAkarclick(View v){
        perform();
        op = 'a';
    }

    public void tombolKuadratclick(View v){
        perform();
        op = '^';
    }

    public void tombolHasilclick(View v){
        calculate();
    }

    public void tombolTitikclick(View v){
        insert('.');
    }

    public void tombolHapusclick(View v){

        String text = lihatHasil.getText().toString();
        if(text.length() <= 1){
            str = "";
            op = 'q';
            num = 0;
            numtemp = 0;
            lihatHasil.setText("");
        }
        else if(text.length() >= 1) {
            lihatHasil.setText(text.substring(0, text.length() - 1));
            lihatHasil.setSelection(lihatHasil.getText().length());
        }
    }

    private void insert(int j) {

        str = str + Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        lihatHasil.setText(str);

    }

    private void reset() {

        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        lihatHasil.setText("");
    }

    private void perform() {

        str = "";
        calculateNoShow();
        numtemp = num;

    }

    private void calculate() {

        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        else if(op == '^')
            num = (float) Math.pow(numtemp,2);
        else if(op == 'a')
            num = (float) Math.sqrt(numtemp);
        else if(op == '%')
            num = numtemp/100;
        lihatHasil.setText(""+num);

    }

    private void calculateNoShow() {

        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        else if(op == '^')
            num = (float) Math.pow(numtemp,2);
        else if(op == 'a')
            num = (float) Math.sqrt(numtemp);
        else if(op == '%')
            num = numtemp/100;

    }
}

