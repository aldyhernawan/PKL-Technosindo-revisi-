package com.example.gombelapp;

import android.app.Activity;
import android.os.Bundle;

public class tab_user_activity extends Activity {
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_user);
		TabActivity.getInstance().connectToActivity(this);
		TabActivity TA = TabActivity.getInstance();
        TA.connectToActivity(this);
		TA.pressButtonById(R.id.imageButtonuser, true);
	}
}
