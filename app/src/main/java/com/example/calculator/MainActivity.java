package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TextView scoreboard;
    private TextView result;

    private ArrayList<Button> allBtn = new ArrayList<>();

    private boolean isMathSignUse = false;
    private boolean isPointUse = true;

    private String str;
    private Integer counterOpenBracket;
    private Integer counterCloseBracket;
    private Integer bracketCounter;


    private Button number0;
    private Button number1;
    private Button number2;
    private Button number3;
    private Button number4;
    private Button number5;
    private Button number6;
    private Button number7;
    private Button number8;
    private Button number9;
    private Button buttonCleaning;
    private Button buttonDel;
    private Button buttonOpenBracket;
    private Button buttonCloseBracket;
    private Button buttonRoot;
    private Button buttonSquare;
    private Button buttonExponent;
    private Button buttonDivision;
    private Button buttonSin;
    private Button buttonCos;
    private Button buttonMultiplication;
    private Button buttonSubtraction;
    private Button buttonSummation;
    private Button numberPower;
    private Button buttonCalculation;


    DataCalculation dataCalculation = new DataCalculation();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreboard = findViewById(R.id.scoreboard);
        scoreboard.setText("");
        result = findViewById(R.id.result);
        result.setText("");

        number0 = findViewById(R.id.number0);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        number6 = findViewById(R.id.number6);
        number7 = findViewById(R.id.number7);
        number8 = findViewById(R.id.number8);
        number9 = findViewById(R.id.number9);
        buttonCleaning = findViewById(R.id.buttonCleaning);
        buttonDel = findViewById(R.id.buttonDel);
        buttonOpenBracket = findViewById(R.id.buttonOpenBracket);
        buttonCloseBracket = findViewById(R.id.buttonCloseBracket);
        buttonRoot = findViewById(R.id.buttonRoot);
        buttonSquare = findViewById(R.id.buttonSquare);
        buttonExponent = findViewById(R.id.buttonExponent);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonSin = findViewById(R.id.buttonSin);
        buttonCos = findViewById(R.id.buttonCos);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonSubtraction = findViewById(R.id.buttonSubtraction);
        buttonSummation = findViewById(R.id.buttonSummation);
        numberPower = findViewById(R.id.numberPower);
        buttonCalculation = findViewById(R.id.buttonCalculation);


        allBtn.add(number0);
        allBtn.add(number1);
        allBtn.add(number2);
        allBtn.add(number3);
        allBtn.add(number4);
        allBtn.add(number5);
        allBtn.add(number6);
        allBtn.add(number7);
        allBtn.add(number8);
        allBtn.add(number9);
        allBtn.add(buttonCleaning);
        allBtn.add(buttonDel);
        allBtn.add(buttonOpenBracket);
        allBtn.add(buttonCloseBracket);
        allBtn.add(buttonRoot);
        allBtn.add(buttonSquare);
        allBtn.add(buttonExponent);
        allBtn.add(buttonDivision);
        allBtn.add(buttonSin);
        allBtn.add(buttonCos);
        allBtn.add(buttonMultiplication);
        allBtn.add(buttonSubtraction);
        allBtn.add(buttonSummation);
        allBtn.add(numberPower);
        allBtn.add(buttonCalculation);


        for(int i = 0; i < allBtn.size() ; i++ ){
            allBtn.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onMyButtonClick(v);
                }
            });

        }



    }

    public void onMyButtonClick(View view){

            switch (view.getId()) {
                case R.id.number0:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "0");
                    isMathSignUse = true;
                    break;
                case R.id.number1:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "1");
                    isMathSignUse = true;
                    break;
                case R.id.number2:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "2");
                    isMathSignUse = true;
                    break;
                case R.id.number3:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "3");
                    isMathSignUse = true;
                    break;
                case R.id.number4:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "4");
                    isMathSignUse = true;
                    break;
                case R.id.number5:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "5");
                    isMathSignUse = true;
                    break;
                case R.id.number6:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "6");
                    isMathSignUse = true;
                    break;
                case R.id.number7:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "7");
                    isMathSignUse = true;
                    break;
                case R.id.number8:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "8");
                    isMathSignUse = true;
                    break;
                case R.id.number9:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "9");
                    isMathSignUse = true;
                    break;
                case R.id.buttonDel:
                    str = scoreboard.getText().toString();
                    if (str.length() != 0) str = str.substring(0, str.length() - 1);
                    scoreboard.setText(str);
                    isMathSignUse = true;
                    break;
                case R.id.buttonCleaning:
                    str = "";
                    scoreboard.setText(str);
                    result.setText(str);
                    isMathSignUse = false;
                    break;
                case R.id.buttonOpenBracket:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "(");
                    isMathSignUse = false;
                    break;
                case R.id.buttonCloseBracket:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + ")");
                    break;
                case R.id.buttonRoot:
                    str = scoreboard.getText().toString();
                        scoreboard.setText(str + "√(");
                    break;
                case R.id.buttonSquare:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "^2");
                    isMathSignUse = true;
                    isPointUse = true;
                    break;
                case R.id.buttonExponent:
                    str = scoreboard.getText().toString();
                    if (isMathSignUse == true)  scoreboard.setText(str + "^");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonDivision:
                    str = scoreboard.getText().toString();
                    if (isMathSignUse == true)  scoreboard.setText(str + "/");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonSin:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "sin(");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonCos:
                    str = scoreboard.getText().toString();
                    scoreboard.setText(str + "cos(");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonMultiplication:
                    str = scoreboard.getText().toString();
                    if (isMathSignUse == true)  scoreboard.setText(str + "*");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonSubtraction:
                    str = scoreboard.getText().toString();
                    if (isMathSignUse == true)  scoreboard.setText(str + "-");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonSummation:
                    str = scoreboard.getText().toString();
                    if (isMathSignUse == true)  scoreboard.setText(str + "+");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.numberPower:
                    str = scoreboard.getText().toString();

                    if( isPointUse == true ) {
                        scoreboard.setText(str + ".");
                        isMathSignUse = false;
                    }

                    isPointUse = false;
                    break;
                case R.id.buttonCalculation:
                    str = scoreboard.getText().toString();



// indexOf !!!!!!!!!!!
                    counterOpenBracket = countChar(str, '(');
                    counterCloseBracket = countChar(str, ')');
                    bracketCounter = counterOpenBracket - counterCloseBracket;
//                    System.out.println("Запятых тут : " + (counterOpenBracketArray.length - 1) + " штук.");




                    System.out.println("----------------------------");
                    System.out.println("откртыо : " + counterOpenBracket + " штук.");
                    System.out.println("закрыто : " + counterCloseBracket + " штук.");

                    if ( bracketCounter > 0){
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Закройте "+ (counterOpenBracket - counterCloseBracket) + " скобки !",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    } else if ( bracketCounter < 0){
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Закрыто больше скобок, чем открыто на " + ( counterCloseBracket - counterOpenBracket)+" скобки!",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    } else {
                        String fixBrackets = str.replaceAll("[(|)|cos|sin]", "");

                        if(fixBrackets.length() == 0){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Введите числа", Toast.LENGTH_SHORT);
                            toast.show();
                        }else {
                            String  resoldCalculate = dataCalculation.calc(str).toString();
                            result.setText(resoldCalculate);
                        }

                    }
                    break;

            }

    }

    public int countChar(String str, char c)
    {
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {
            if(str.charAt(i) == c) count++;
        }

        return count;
    }
}