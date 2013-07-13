package com.example.wu_mball;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.widget.ImageView;

public class Intro extends Activity {

	private CountDownTimer timer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intro);

		ImageView introImg = (ImageView) findViewById(R.id.introImg);

		timer = new CountDownTimer(3 * 1000, 1000) {

			public void onTick(long millisUntilFinished) {
			}

			public void onFinish() {
				Intent mainIntent = new Intent(Intro.this, Main.class);

				startActivity(mainIntent);
			}

		};
		timer.start();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intro, menu);
		return true;
	}

}
