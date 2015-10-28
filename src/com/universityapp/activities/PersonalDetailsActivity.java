package com.universityapp.activities;

import org.w3c.dom.Text;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersonalDetailsActivity extends Activity {

	// TODO Auto-generated constructor stub

	private Button updateButton;
	private Button deleteButton;
	private Button backButton;
	private TextView etFirstName;
	private TextView etLastName;
	private TextView etDateOfBirth;
	private TextView etGender;
	private EditText etAddress;
	private EditText etphone;
	private EditText etemail;
	private SharedPreferences prefs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personal_details);
		prefs = getSharedPreferences("univer", MODE_PRIVATE);
		updateButton = (Button) findViewById(R.id.pd_update_button);
		deleteButton = (Button) findViewById(R.id.pd_delete_button);
		backButton = (Button) findViewById(R.id.pd_back_button);
		etFirstName = (TextView) findViewById(R.id.pd_fn);
		etLastName = (TextView) findViewById(R.id.pd_ln);
		etGender = (TextView) findViewById(R.id.pd_gender);
		etDateOfBirth = (TextView) findViewById(R.id.pd_dob);
		etAddress = (EditText) findViewById(R.id.pd_address);
		etphone = (EditText) findViewById(R.id.pd_phn);
		etemail = (EditText) findViewById(R.id.pd_id);

		Student student = (new DatabaseHelper(getApplicationContext())).getStudentLogin(prefs.getString("id", "0"));
		etFirstName.setText(student.getFname());
		etLastName.setText(student.getLname());
		etGender.setText(student.getGender());
		etDateOfBirth.setText(student.getDob());
		etAddress.setText(student.getAddress());
		etphone.setText(student.getPhone());
		etemail.setText(student.getEmail());

		updateButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				(new DatabaseHelper(getApplicationContext())).updateTheValues(prefs.getString("id", "0"),
						etAddress.getText().toString(), etphone.getText().toString(), etemail.getText().toString());
				Toast.makeText(getApplicationContext(), "personal information is updated", Toast.LENGTH_LONG).show();
			}
		});

		deleteButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// Intent intent = new Intent(PersonalDetailsActivity.this,
				// MainActivity.class);
				// startActivity(Intent);
			}
		});

		backButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// Intent intent = new Intent(PersonalDetailsActivity.this,
				// MainActivity.class);
				// startActivity(Intent);
			}
		});

	}

}
