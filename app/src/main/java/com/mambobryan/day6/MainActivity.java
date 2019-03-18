package com.mambobryan.day6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox firstCheckBox;
    CheckBox secondCheckBox;
    CheckBox thirdCheckBox;
    CheckBox fourthCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeDisplayText("No checkBox ");

    }

    public void generate(View view) {
        firstCheckBox = findViewById(R.id.checkbox_one);
        secondCheckBox = findViewById(R.id.checkbox_two);
        thirdCheckBox = findViewById(R.id.checkbox_three);
        fourthCheckBox = findViewById(R.id.checkbox_four);

        String firstCheckBoxName = " Check one";
        String secondCheckBoxName = " Check two";
        String thirdCheckBoxName = " Check three";
        String fourthCheckBoxName = " Check four";


        String textToDisplay = " ";

//        if (firstCheckBox.isChecked()) {
//            textToDisplay = firstCheckBoxName;
//            if (secondCheckBox.isChecked()) {
//                textToDisplay = textToDisplay + secondCheckBoxName;
//                if (thirdCheckBox.isChecked()) {
//                    textToDisplay = textToDisplay + thirdCheckBoxName;
//                    if (fourthCheckBox.isChecked()) {
//                        textToDisplay = textToDisplay + fourthCheckBoxName;
//                    } else {
//                        textToDisplay = textToDisplay;
//                    }
//                }
//            } else {
//                textToDisplay = textToDisplay;
//                if (thirdCheckBox.isChecked()) {
//                    textToDisplay = textToDisplay + thirdCheckBoxName;
//                    if (fourthCheckBox.isChecked()) {
//                        textToDisplay = textToDisplay + fourthCheckBoxName;
//                    } else {
//                        textToDisplay = textToDisplay;
//                    }
//                }
//            }
//        } else if (secondCheckBox.isChecked()) {
//            textToDisplay = secondCheckBoxName;
//            if (thirdCheckBox.isChecked()) {
//                textToDisplay = textToDisplay + thirdCheckBoxName;
//                if (fourthCheckBox.isChecked()) {
//                    textToDisplay = textToDisplay + fourthCheckBoxName;
//                } else {
//                    textToDisplay = textToDisplay;
//                }
//            }
//        } else if (thirdCheckBox.isChecked()) {
//            textToDisplay = thirdCheckBoxName;
//            if (fourthCheckBox.isChecked()) {
//                textToDisplay = textToDisplay + "and " + fourthCheckBoxName;
//            } else {
//                textToDisplay = textToDisplay;
//            }
//        } else if (fourthCheckBox.isChecked()) {
//            textToDisplay = fourthCheckBoxName;
//        } else {
//            textToDisplay = "No CheckBox";
//        }
        if (firstCheckBox.isChecked()) {
            textToDisplay = firstCheckBoxName;

            if (secondCheckBox.isChecked()) {
                textToDisplay = textToDisplay + " and" + secondCheckBoxName;

                if (thirdCheckBox.isChecked()) {
                    textToDisplay = textToDisplay + " and" + thirdCheckBoxName;

                    if (fourthCheckBox.isChecked()) {
                        textToDisplay = textToDisplay + " and" + fourthCheckBoxName;
                    }
                } else if (fourthCheckBox.isChecked()) {
                    textToDisplay = textToDisplay + " and" + fourthCheckBoxName;
                }

            } else if (thirdCheckBox.isChecked()) {
                textToDisplay = textToDisplay + " and" + thirdCheckBoxName;

                if (fourthCheckBox.isChecked()) {
                    textToDisplay = textToDisplay + " and" + fourthCheckBoxName;
                }

            } else if (fourthCheckBox.isChecked()) {
                textToDisplay = textToDisplay + " and" + fourthCheckBoxName;
            }

        } else if (secondCheckBox.isChecked()) {
            textToDisplay = secondCheckBoxName;

            if (thirdCheckBox.isChecked()) {
                textToDisplay = textToDisplay + " and" + thirdCheckBoxName;

                if (fourthCheckBox.isChecked()) {
                    textToDisplay = textToDisplay + " and" + fourthCheckBoxName;
                }
            } else if (fourthCheckBox.isChecked()) {
                textToDisplay = textToDisplay + " and" + fourthCheckBoxName;
            }

        } else if (thirdCheckBox.isChecked()) {
            textToDisplay = thirdCheckBoxName;

            if (fourthCheckBox.isChecked()) {
                textToDisplay = textToDisplay + " and" + fourthCheckBoxName;
            }

        } else if (fourthCheckBox.isChecked()) {
            textToDisplay = fourthCheckBoxName;

        } else {
            textToDisplay = "None is ";
        }


        changeDisplayText(textToDisplay);
    }


    public void changeDisplayText(String text) {
        TextView displayText = findViewById(R.id.display_text_view);
        displayText.setText(text + " selected");
    }
}