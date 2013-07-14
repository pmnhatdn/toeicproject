package com.np.toiectest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.AvoidXfermode;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button btnToiecReading;
	private Button btnToiecListenning;
	private Button btnToiecPhoto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnToiecPhoto = (Button)findViewById(R.id.btnToiecPhoto);
		btnToiecReading = (Button)findViewById(R.id.btnToiecReading);
		btnToiecListenning = (Button)findViewById(R.id.btnToiecListenning);

		btnToiecPhoto.setOnClickListener(this);
		btnToiecReading.setOnClickListener(this);
		btnToiecListenning.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		Intent i;
		switch (id) {
		case R.id.btnToiecPhoto:
			i = new Intent(this, ListenningActivity.class);
			
			startActivity(i);
			break;
		case R.id.btnToiecListenning:
			i = new Intent(this, ListenningActivity.class);
			startActivity(i);
			break;
		case R.id.btnToiecReading:
			i = new Intent(this, ReadingActivity.class);
			startActivity(i);
			break;
		default:
			break;
		}

	}

}

