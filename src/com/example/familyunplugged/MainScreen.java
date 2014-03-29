package com.example.familyunplugged;



import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainScreen extends Activity {

	 Button b1;
	 Button b2;
	 EditText inputName;
	 EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);
        
        inputName = (EditText) findViewById(R.id.text1);
        inputPassword = (EditText) findViewById(R.id.text2);
        
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        
        b1.setOnClickListener(myhandler1);
        b2.setOnClickListener(myhandler2);

    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
        	
        	
        	//Starting a new Intent
            Intent nextScreen = new Intent(getApplicationContext(), SecondScreen.class);

            //Sending data to another Activity
            nextScreen.putExtra("name", inputName.getText().toString());
            nextScreen.putExtra("password", inputPassword.getText().toString());

            Log.e("n", inputName.getText()+"."+ inputPassword.getText());

            startActivity(nextScreen);
        }
      };
      View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
          // it was the 2nd button
        }
      };
    

    
}
