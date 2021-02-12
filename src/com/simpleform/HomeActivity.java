package com.simpleform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends Activity {
	TextView showInfo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		Intent intGoToMain = getIntent();
		String[] message = intGoToMain.getStringArrayExtra(MainActivity.messageMain);
		showInfo = (TextView)findViewById(R.id.textViewHome);
		showInfo.setText("Nama Anda \t : " + message[0].toString() +
				         "\n NIS Anda \t : " + message[1].toString());
	}
	
	public void goToMain(View view) {
		Intent intGoToMain = new Intent(this, MainActivity.class);
    	startActivity(intGoToMain);
	}

}
