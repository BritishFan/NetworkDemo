package com.example.ivani_000.networkdemo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Button;

/**
 * Created by ivani_000 on 6/20/2015.
 */
public class NetworkStatus  {



    public static int getNetworkStatus(Context context)
    {
        ConnectivityManager cm = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo ni = cm.getActiveNetworkInfo();

        if(ni != null){
            switch (ni.getType()){
                case ConnectivityManager.TYPE_MOBILE:
                    return 1;
                case ConnectivityManager.TYPE_BLUETOOTH:
                    return 2;
                case ConnectivityManager.TYPE_WIFI:
                    return 3;
                case ConnectivityManager.TYPE_DUMMY:
                    return 4;
                default:
                    return 5;
            }
        }else {
            return 0;
        }
    }

}
