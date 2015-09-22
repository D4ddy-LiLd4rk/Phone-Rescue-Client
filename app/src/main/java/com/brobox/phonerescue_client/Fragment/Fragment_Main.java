package com.brobox.phonerescue_client.Fragment;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import com.brobox.phonerescue_client.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class Fragment_Main extends Fragment {

    private Button buttonWiFi;
    final static String PHONE_NUMBER = "+49 AAAA BBBBBB-XX";

    public Fragment_Main() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        buttonWiFi = (Button) rootView.findViewById(R.id.button_wifi);

        buttonWiFi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSMS(PHONE_NUMBER, "Test SMS Message: WiFi");
            }
        });

        return rootView;
    }

    private void sendSMS(String number, String message) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(number, null, message, null, null);
    }

}
