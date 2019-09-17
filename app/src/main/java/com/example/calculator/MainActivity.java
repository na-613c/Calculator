package com.example.calculator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.udojava.evalex.Expression;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TextView scoreboard;
    private TextView result;

    private ArrayList<Button> allBtn = new ArrayList<>();

    private boolean isMathSignUse = false;
    private boolean isPointUse = true;
    private boolean isFirstMinus = true;


    DataCalculation dataCalculation = new DataCalculation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreboard = findViewById(R.id.scoreboard);
        scoreboard.setText("");
        result = findViewById(R.id.result);
        result.setText("");

        Button number0 = findViewById(R.id.number0);
        Button number1 = findViewById(R.id.number1);
        Button number2 = findViewById(R.id.number2);
        Button number3 = findViewById(R.id.number3);
        Button number4 = findViewById(R.id.number4);
        Button number5 = findViewById(R.id.number5);
        Button number6 = findViewById(R.id.number6);
        Button number7 = findViewById(R.id.number7);
        Button number8 = findViewById(R.id.number8);
        Button number9 = findViewById(R.id.number9);
        Button buttonCleaning = findViewById(R.id.buttonCleaning);
        Button buttonDel = findViewById(R.id.buttonDel);
        Button buttonOpenBracket = findViewById(R.id.buttonOpenBracket);
        Button buttonCloseBracket = findViewById(R.id.buttonCloseBracket);
        Button buttonRoot = findViewById(R.id.buttonRoot);
        Button buttonSquare = findViewById(R.id.buttonSquare);
        Button buttonExponent = findViewById(R.id.buttonExponent);
        Button buttonDivision = findViewById(R.id.buttonDivision);
        Button buttonSin = findViewById(R.id.buttonSin);
        Button buttonCos = findViewById(R.id.buttonCos);
        Button buttonMultiplication = findViewById(R.id.buttonMultiplication);
        Button buttonSubtraction = findViewById(R.id.buttonSubtraction);
        Button buttonSummation = findViewById(R.id.buttonSummation);
        Button numberPower = findViewById(R.id.numberPower);
        Button buttonCalculation = findViewById(R.id.buttonCalculation);


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


//        for(int i = 0; i < allBtn.size() ; i++ ){
//            allBtn.get(i).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    onMyButtonClick(v);
//                }
//            });
//        }

        for(Button i: allBtn){
            i.setOnClickListener(new View.OnClickListener() {
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
                    String inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "0");
                    isMathSignUse = true;
                    break;
                case R.id.number1:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "1");
                    isMathSignUse = true;
                    break;
                case R.id.number2:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "2");
                    isMathSignUse = true;
                    break;
                case R.id.number3:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "3");
                    isMathSignUse = true;
                    break;
                case R.id.number4:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "4");
                    isMathSignUse = true;
                    break;
                case R.id.number5:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "5");
                    isMathSignUse = true;
                    break;
                case R.id.number6:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "6");
                    isMathSignUse = true;
                    break;
                case R.id.number7:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "7");
                    isMathSignUse = true;
                    break;
                case R.id.number8:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "8");
                    isMathSignUse = true;
                    break;
                case R.id.number9:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "9");
                    isMathSignUse = true;
                    break;
                case R.id.buttonDel:
                    inputString = scoreboard.getText().toString();
                    if (inputString.length() != 0) inputString = inputString.substring(0, inputString.length() - 1);
                    scoreboard.setText(inputString);
                    isMathSignUse = true;
                    break;
                case R.id.buttonCleaning:
                    inputString = "";
                    scoreboard.setText(inputString);
                    result.setText(inputString);
                    isMathSignUse = false;
                    Toast toastCleaning = Toast.makeText(getApplicationContext(),
                            "Поле очищено!", Toast.LENGTH_SHORT);
                    toastCleaning.show();
                    break;
                case R.id.buttonOpenBracket:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "(");
                    isMathSignUse = false;
                    break;
                case R.id.buttonCloseBracket:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + ")");
                    break;
                case R.id.buttonRoot:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "√(");
                    break;
                case R.id.buttonSquare:
                    inputString = scoreboard.getText().toString();
                    if (isMathSignUse == true) scoreboard.setText(inputString + "^2");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonExponent:
                    inputString = scoreboard.getText().toString();
                    if (isMathSignUse == true) scoreboard.setText(inputString + "^");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonDivision:
                    inputString = scoreboard.getText().toString();
                    if (isMathSignUse == true) scoreboard.setText(inputString + "/");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonSin:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "sin(");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonCos:
                    inputString = scoreboard.getText().toString();
                    scoreboard.setText(inputString + "cos(");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonMultiplication:
                    inputString = scoreboard.getText().toString();
                    if (isMathSignUse == true) scoreboard.setText(inputString + "*");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonSubtraction:
                    inputString = scoreboard.getText().toString();
                    if (isMathSignUse == true) scoreboard.setText(inputString + "-");
                    if (isFirstMinus == true) {scoreboard.setText(inputString + "-"); isFirstMinus = false;}
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.buttonSummation:
                    inputString = scoreboard.getText().toString();
                    if (isMathSignUse == true) scoreboard.setText(inputString + "+");
                    isMathSignUse = false;
                    isPointUse = true;
                    break;
                case R.id.numberPower:
                    inputString = scoreboard.getText().toString();

                    if (isPointUse == true) {
                        scoreboard.setText(inputString + ".");
                        isMathSignUse = false;
                    }

                    isPointUse = false;
                    break;
                case R.id.buttonCalculation:


                    inputString = scoreboard.getText().toString();

                    Integer counterOpenBracket = countChar(inputString, '(');
                    Integer counterCloseBracket = countChar(inputString, ')');

                    for (;counterOpenBracket > counterCloseBracket; counterCloseBracket++){
                        inputString += ")";
                        scoreboard.setText(inputString);
                    }

                        String resultCalculate;
                        try {
                            resultCalculate = dataCalculation.calc(inputString).toString();
                            result.setText(resultCalculate);
                        } catch (Expression.ExpressionException | ArithmeticException error){

                            AlertDialog.Builder builder = new AlertDialog.Builder(this);
                            builder.setTitle("Error!")
                                    .setMessage(error.getMessage())
                                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });
                            AlertDialog alert = builder.create();
                            alert.show();

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