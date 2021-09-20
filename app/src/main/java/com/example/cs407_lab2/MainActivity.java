package com.example.cs407_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void operatorFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNumTextField);
        EditText secondNum = (EditText) findViewById(R.id.secondNumTextField);
        int firstNumVal = Integer.valueOf(firstNum.getText().toString());
        int secondNumVal = Integer.valueOf(secondNum.getText().toString());
        String out = "";
        switch(view.getId()){
            case R.id.additionButton:
                int sum = firstNumVal + secondNumVal;
                out = String.valueOf(sum);
                break;
            case R.id.subtractionButton:
                int result = firstNumVal - secondNumVal;
                out = String.valueOf(result);
                break;
            case R.id.multiplyButton:
                int product = firstNumVal*secondNumVal;
                out = String.valueOf(product);
                break;
            case R.id.divisionButton:
                if(secondNumVal == 0){
                    //Toast.makeText(MainActivity.this, "Cannot divide by 0", Toast.LENGTH_LONG).show();
                    break;
                }else {
                    float quotient = (float)firstNumVal/ (float)secondNumVal;
                    out = Float.toString(quotient);
                    break;
                }
        }
        if (out == ""){
            goToActivity2("Cannot divide by 0");
        } else{
            goToActivity2(out);
        }

    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}