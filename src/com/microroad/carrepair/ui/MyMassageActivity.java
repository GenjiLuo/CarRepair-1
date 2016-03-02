package com.microroad.carrepair.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.microroad.carrepair.R;

public class MyMassageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.car_my_view);
	}
}
