package com.universityapp.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewStudentActivity extends Activity {

	private Button saveButton;
	private EditText etFirstName;
	private EditText etLastName;
	private EditText etDateOfBirth;
	private EditText etAddress;
	private EditText etphone;
	private EditText etemail, etUserName, etPassword;
	private RadioGroup radioGroup;

	// TODO Auto-generated constructor stub

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_student);

		saveButton = (Button) findViewById(R.id.student_save_button);
		etFirstName = (EditText) findViewById(R.id.student_fn);
		etLastName = (EditText) findViewById(R.id.student_ln);
		etDateOfBirth = (EditText) findViewById(R.id.student_dob);
		etAddress = (EditText) findViewById(R.id.student_address);
		etphone = (EditText) findViewById(R.id.student_phn);
		etemail = (EditText) findViewById(R.id.etemail);
		etUserName = (EditText) findViewById(R.id.etUserName);
		etPassword = (EditText) findViewById(R.id.etPassword);
		radioGroup = (RadioGroup) findViewById(R.id.gender_radio_group);
		
		saveButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int selectedId = radioGroup.getCheckedRadioButtonId();
				RadioButton radioSexButton = (RadioButton) findViewById(selectedId);
				Student student = new Student();
				student.setFname(etFirstName.getText().toString().trim());
				student.setLname(etLastName.getText().toString().trim());
				student.setGender(radioSexButton.getText().toString().trim());
				student.setEmail(etemail.getText().toString().trim());
				student.setDob(etDateOfBirth.getText().toString().trim());
				student.setAddress(etAddress.getText().toString().trim());
				student.setPhone(etphone.getText().toString().trim());
				student.setUsername(etUserName.getText().toString().trim());
				student.setPassword(etPassword.getText().toString().trim());

				// TODO Auto-generated method stub
				(new DatabaseHelper(getApplicationContext())).createStudentegistraton(student);
				Intent intent = new Intent(NewStudentActivity.this, StudentLoginActivity.class);
				startActivity(intent);
			}
		});

	}

}
