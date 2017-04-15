package com.example.vai9105.sched;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity.class";

    @ViewById
    FloatingActionButton fab;

    @ViewById
    Toolbar toolbar;

    @ViewById
    TabHost tabs;
    
    @AfterInject
    void afterInject(){
        //data calls for main activity here
    }
    
    @AfterViews
    void afterViews(){
        Log.d(TAG, "Creating the main Activities view");

        setSupportActionBar(toolbar);

        //tab1
        tabs.setup();
        TabHost.TabSpec tabSpec1 = tabs.newTabSpec("tab1");
        tabSpec1.setIndicator("Monday");
        tabSpec1.setContent(R.id.Monday);
        tabs.addTab(tabSpec1);

        //tab2
        tabs.setup();
        TabHost.TabSpec tabSpec2 = tabs.newTabSpec("tab2");
        tabSpec2.setIndicator("Tuesday");
        tabSpec2.setContent(R.id.Tuesday);
        tabs.addTab(tabSpec2);

        //tab3
        tabs.setup();
        TabHost.TabSpec tabSpec3 = tabs.newTabSpec("tab3");
        tabSpec3.setIndicator("Wednesday");
        tabSpec3.setContent(R.id.Wednesday);
        tabs.addTab(tabSpec3);
    }

    @Click(R.id.fab)
    void floatingActionButtonClicked(View view){
        Snackbar.make(view, "Replace witabs your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate tabse menu; tabsis adds items to tabse action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. tabse action bar will
        // automatically handle clicks on tabse Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
