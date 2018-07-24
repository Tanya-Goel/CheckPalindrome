package com.example.tanya.palindrome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.bt);
        ed=findViewById(R.id.et);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String rev="";
      String st =  ed.getText().toString();

      int   n=st.length();
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+st.charAt(i);
        }

        if(st.equals(rev))
            Toast.makeText(this, "STRING is palindrome", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "String is not palindrome", Toast.LENGTH_SHORT).show();


    }
}
