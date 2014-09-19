package com.myheat;

import android.app.Application;
import android.content.Context;

/**
 * @author myheat
 */
public class MyApplication extends Application {

	public static Context mContext;
	public static int mAppState;

	@Override
	public void onCreate() {
		super.onCreate();
		mContext = this.getApplicationContext();
		mAppState = -1;
	}

	public synchronized static void setAppState(int state) {
		mAppState = state;
	}
}
