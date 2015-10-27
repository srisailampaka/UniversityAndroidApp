package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NewStudentActivity extends Activity{

	private Button saveButton;
	private EditText etFirstName;
	private EditText etLastName;
	private EditText etDateOfBirth;
	private EditText etAddress;
	private EditText etphone;
	private EditText etemail;
	                     
	
	
		// TODO Auto-generated constructor stub

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_student);
		
saveButton=(Button)findViewById(R.id.student_save_button);		
etFirstName=(EditText)findViewById(R.id.student_fn);
etLastName=(EditText)findViewById(R.id.student_ln);
etDateOfBirth=(EditText)findViewById(R.id.student_dob);
etAddress=(EditText)findViewById(R.id.student_address);
etphone=(EditText)findViewById(R.id.student_phn);
etemail=(EditText)findViewById(R.id.student_id);
		
		saveButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//Intent intent = new Intent(NewStudentActivity.this,MainActivity.class);
				//startActivity(Intent);
			}
		});
		
		
	}

}
