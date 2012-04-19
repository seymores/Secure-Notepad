package com.snote;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;

public class NotesAdapter extends FragmentPagerAdapter implements
		ViewPager.OnPageChangeListener {

	private static final String TAG = "NotesAdapter";
	Context activity;
	ViewPager pager;
	int noteCount = 0;

	public NotesAdapter(FragmentActivity activity, ViewPager pager) {
		super(activity.getSupportFragmentManager());
		
		this.activity = activity;
		this.pager = pager;
		
		pager.setAdapter(this);
		pager.setOnPageChangeListener(this);
	}

	@Override
	public Fragment getItem(int arg0) {
		String desc = "Note #" + arg0;
		return NoteFragment.newInstance(desc);
	}

	@Override
	public int getCount() {
		return getNoteCount();
	}

	public int getNoteCount() {
		return noteCount;
	}

	public void setNoteCount(int noteCount) {
		this.noteCount = noteCount;
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
