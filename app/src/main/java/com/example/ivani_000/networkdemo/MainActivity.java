package com.example.ivani_000.networkdemo;

import android.net.ConnectivityManager;
import android.os.NetworkOnMainThreadException;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnNet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNet=(Button) findViewById(R.id.btnNet);
        btnNet.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        int status=NetworkStatus.getNetworkStatus(this);

        switch (status){
            case 1:
                Toast.makeText(this,"Mobile Internet Connect... ",Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this,"BlueTooth... ",Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(this,"Wifi Connect... ",Toast.LENGTH_LONG).show();
                break;
            case 4:
                Toast.makeText(this,"Dummy... ",Toast.LENGTH_LONG).show();
                break;
            case 0:
                Toast.makeText(this,"No Connectivity... ",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
