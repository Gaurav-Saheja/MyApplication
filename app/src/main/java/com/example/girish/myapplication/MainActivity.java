package com.example.girish.myapplication;

import android.content.SyncStatusObserver;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
    ViewPager Tab;
    TabPagerAdapter TabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);

        TabAdapter = new TabPagerAdapter(getSupportFragmentManager());


        Tab = (ViewPager)findViewById(R.id.pager);
        final ActionBar actionBar = getActionBar();
        System.out.println("Action bar : " + actionBar);
        Tab.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        actionBar.setSelectedNavigationItem(position);                    }
                });

        Tab.setAdapter(TabAdapter);

        //Enable Tabs on Action Bar
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener tabListener = new ActionBar.TabListener(){

            @Override
            public void onTabReselected(android.app.ActionBar.Tab tab,
                                        FragmentTransaction ft) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Tab selected", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

                Tab.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(android.app.ActionBar.Tab tab,
                                        FragmentTransaction ft) {
                // TODO Auto-generated method stub

            }};
        //Add New Tabs
        actionBar.addTab(actionBar.newTab().setText("Movie").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Music").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Video").setTabListener(tabListener));

    }




}