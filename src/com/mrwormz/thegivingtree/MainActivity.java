package com.mrwormz.thegivingtree;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tx = (TextView) findViewById(R.id.textViewJTitle);
		Typeface green_avocado_font = Typeface.createFromAsset(getAssets(), "fonts/green avocado.ttf");
		tx.setTypeface(green_avocado_font);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void createJournalEntry(View view) {
		Intent intent = new Intent(this, EntryActivity.class);
		startActivity(intent);
		
	}

}
