package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ProffesorScreenActivity extends Activity {
	private Button viewStudentsButton;
	private Button commentsButton;
	private Button logoutButton;

	// TODO Auto-generated constructor stub

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proffesor_screen);

		viewStudentsButton = (Button) findViewById(R.id.viewstudent_button);
		commentsButton = (Button) findViewById(R.id.comments_button);
		logoutButton = (Button) findViewById(R.id.proff_logout_button);
		viewStudentsButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProffesorScreenActivity.this, ViewStudentsActivity.class);
				startActivity(intent);
			}
		});
		commentsButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProffesorScreenActivity.this, CommentsActivity.class);
				startActivity(intent);
			}
		});

		logoutButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProffesorScreenActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});

	}

}
