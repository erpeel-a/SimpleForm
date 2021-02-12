package com.simpleform;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView tv1;
	Button btn1;
	EditText et1, et2;
	public static final String messageMain = "MessageMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv1 = (TextView)findViewById(R.id.textView1);
    	btn1 = (Button)findViewById(R.id.button1);
    	et1 = (EditText)findViewById(R.id.editText1);
    	et2 = (EditText)findViewById(R.id.editText2);
    }
    
    public void btnSimpan(View view) {  	
    	tv1.setText("Nama Lengkap Anda \t : " + et1.getText().toString() +
    			    "\n NIS Anda \t : " + et2.getText().toString());
    }
    
    public void goToHome(View view) {
    	Intent intGoToHome = new Intent(this, HomeActivity.class);
    	String[] message = {
    			et1.getText().toString(),
    			et2.getText().toString()
    	};
    	intGoToHome.putExtra(messageMain, message);
    	startActivity(intGoToHome);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
