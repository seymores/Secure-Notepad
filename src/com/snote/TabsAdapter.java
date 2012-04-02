package com.snote;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class TabsAdapter extends FragmentPagerAdapter implements
		ViewPager.OnPageChangeListener, ActionBar.TabListener {

	private static final String TAG = "TabsAdapter";
	Context activity;
	ViewPager pager;
	ActionBar bar;
	int noteCount = 0;

	public TabsAdapter(FragmentActivity activity, ViewPager pager, ActionBar bar) {
		super(activity.getSupportFragmentManager());
		
		this.activity = activity;
		this.pager = pager;
		this.bar = bar;
		
		pager.setAdapter(this);
		pager.setOnPageChangeListener(this);
		Log.d(TAG, " init >>>> " + bar);
	}

	@Override
	public Fragment getItem(int arg0) {
		Log.d(TAG, " >>>> " + bar );
		if (bar == null) return null;
		Tab tab = bar.newTab();
		String desc = "Note #" + arg0;
		tab.setText(desc);
		tab.setTabListener(this);
		bar.addTab(tab);
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

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

}
