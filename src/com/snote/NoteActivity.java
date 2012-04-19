package com.snote;

import android.os.Bundle;
import android.support.v4.view.ViewPager;


import com.actionbarsherlock.app.SherlockFragmentActivity;

public class NoteActivity extends SherlockFragmentActivity {
	ViewPager pager;
	NotesAdapter tabsAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.note_activity);
		pager = (ViewPager)findViewById(R.id.pager);
		
        //bar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
        tabsAdapter = new NotesAdapter(this, pager);
        tabsAdapter.setNoteCount(3);
	}

	@Override
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {

		com.actionbarsherlock.view.MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.note_menus, menu);
				
		return true;
	}
}
