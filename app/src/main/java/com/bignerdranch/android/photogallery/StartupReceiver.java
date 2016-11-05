package com.bignerdranch.android.photogallery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class StartupReceiver extends BroadcastReceiver {
	private static final String TAG = "StartupReceiver";

	@Override
	public void onReceive(final Context context, final Intent intent) {
		Log.i(TAG, "Received broadcast intent: " + intent.getAction());

		final boolean isOn = QueryPreferences.isAlarmOn(context);
		PollService.setServiceAlarm(context, isOn);
	}
}
