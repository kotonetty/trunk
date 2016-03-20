package com.example.kikuchikotone.trunkandroid;

import android.app.Application;

import com.adobe.creativesdk.aviary.IAviaryClientCredentials;
import com.adobe.creativesdk.foundation.AdobeCSDKFoundation;

/**
 * Created by kikuchikotone on 16/03/20.
 */
public class MainApplication extends Application implements IAviaryClientCredentials {

    /* Be sure to fill in the two strings below. */
    private static final String CREATIVE_SDK_CLIENT_ID = "<YOUR_CLIENT_ID_HERE>";
    private static final String CREATIVE_SDK_CLIENT_SECRET = "<YOUR_CLIENT_SECRET_HERE>";

    @Override
    public void onCreate() {
        super.onCreate();
        AdobeCSDKFoundation.initializeCSDKFoundation(getApplicationContext());
    }

    @Override
    public String getClientID() {
        return CREATIVE_SDK_CLIENT_ID;
    }

    @Override
    public String getClientSecret() {
        return CREATIVE_SDK_CLIENT_SECRET;
    }
    @Override
    public String getBillingKey() {
        return ""; // Leave this blank
    }
}
