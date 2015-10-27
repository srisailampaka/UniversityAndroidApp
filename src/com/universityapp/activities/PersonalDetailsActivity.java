package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PersonalDetailsActivity extends Activity {

	// TODO Auto-generated constructor stub

	private Button updateButton;
	private Button deleteButton;
	private Button backButton;
	private EditText etFirstName;
	private EditText etLastName;
	private EditText etDateOfBirth;
	private EditText etAddress;
	private EditText etphone;
	private EditText etemail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personal_details);

		updateButton = (Button) findViewById(R.id.pd_update_button);
		deleteButton = (Button) findViewById(R.id.pd_delete_button);
		backButton = (Button) findViewById(R.id.pd_back_button);
		etFirstName = (EditText) findViewById(R.id.pd_fn);
		etLastName = (EditText) findViewById(R.id.pd_ln);
		etDateOfBirth = (EditText) findViewById(R.id.pd_dob);
		etAddress = (EditText) findViewById(R.id.pd_address);
		etphone = (EditText) findViewById(R.id.pd_phn);
		etemail = (EditText) findViewById(R.id.pd_id);

		updateButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				//Intent intent = new Intent(PersonalDetailsActivity.this, MainActivity.class);
				//   startActivity(Intent);
			}
		});

		deleteButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				//Intent intent = new Intent(PersonalDetailsActivity.this, MainActivity.class);
				//   startActivity(Intent);
			}
		});

		backButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				//Intent intent = new Intent(PersonalDetailsActivity.this, MainActivity.class);
				//   startActivity(Intent);
			}
		});



	}

}
