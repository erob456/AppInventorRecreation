package ctec.recreation.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity
{
	private Button beginButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		beginButton = (Button) findViewById(R.id.beginButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		beginButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent myIntent = new Intent(currentView.getContext(), SecondActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	}
}
