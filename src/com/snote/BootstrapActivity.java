package com.snote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BootstrapActivity extends Activity {
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