package com.nikop.firstlook.firstlook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private Button mButton2;
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.mButton);
        mButton2 = (Button) findViewById(R.id.mButton2);
        mTextView = (TextView) findViewById(R.id.mTextView);
        mEditText = (EditText) findViewById(R.id.mEditText); // Allows us to get information from the input text

        // Change the title of the button
        mButton.setText(R.string.showMe_Button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredText;

                enteredText = mEditText.getText().toString();

                mTextView.setVisibility(View.VISIBLE);
                mTextView.setText(enteredText);

            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setVisibility(View.INVISIBLE);
            }
        });

    }

    /*public void ShowMe(View view) {
        mTextView.setVisibility(View.VISIBLE);
        mTextView.setText(R.string.show_text);
    }*/
}
