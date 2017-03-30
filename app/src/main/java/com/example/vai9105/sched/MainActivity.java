package com.example.vai9105.sched;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        th = (TabHost) findViewById(R.id.tabs);

        //tab1
        th.setup();
        TabHost.TabSpec tabSpec1 = th.newTabSpec("tab1");
        tabSpec1.setIndicator("Monday");
        tabSpec1.setContent(R.id.Monday);
        th.addTab(tabSpec1);

        //tab2
        th.setup();
        TabHost.TabSpec tabSpec2 = th.newTabSpec("tab2");
        tabSpec2.setIndicator("Tuesday");
        tabSpec2.setContent(R.id.Tuesday);
        th.addTab(tabSpec2);

        //tab3
        th.setup();
        TabHost.TabSpec tabSpec3 = th.newTabSpec("tab3");
        tabSpec3.setIndicator("Wednesday");
        tabSpec3.setContent(R.id.Wednesday);
        th.addTab(tabSpec3);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
