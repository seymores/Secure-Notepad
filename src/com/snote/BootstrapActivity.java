package com.snote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.actionbarsherlock.app.SherlockActivity;

public class BootstrapActivity extends SherlockActivity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    
    public void next(View v) {
    	startActivity(new Intent(this, NoteActivity.class));
    }
    
}