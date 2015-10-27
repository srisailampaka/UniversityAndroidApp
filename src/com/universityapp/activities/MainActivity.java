package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button studentButton;
	private Button proffessorButton;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		studentButton=(Button)findViewById(R.id.student_button);
		proffessorButton=(Button)findViewById(R.id.proffessor_button);
		
		studentButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,StudentLoginActivity.class);
				startActivity(intent);
			}
		});;
		
proffessorButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ProffesorLoginActivtity.class);
				startActivity(intent);
			}
		});
		
		
	}

	
}
