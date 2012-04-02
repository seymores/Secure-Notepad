package com.snote;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class NoteActivity extends FragmentActivity {
	ViewPager pager;
	TabsAdapter tabsAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.note_activity);
		pager = (ViewPager)findViewById(R.id.pager);
		
		final ActionBar bar = getActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        bar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
        tabsAdapter = new TabsAdapter(this, pager, bar);
        tabsAdapter.setNoteCount(3);
	}

}
