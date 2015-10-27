package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentLoginActivity extends Activity{
	private Button loginButton;
	private Button newStudentButton;
	private EditText etUserName;
	private EditText etPassword;
		// TODO Auto-generated constructor stub
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_studentlogin);	
		
		loginButton=(Button)findViewById(R.id.button_student_login);
		newStudentButton=(Button)findViewById(R.id.button_newstudent);
		etUserName=(EditText)findViewById(R.id.student_username);
		etPassword=(EditText)findViewById(R.id.student_password);
		
		loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StudentLoginActivity.this,StudentScreenActivity.class);
				startActivity(intent);
			}
		});
		
newStudentButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StudentLoginActivity.this,NewStudentActivity.class);
				startActivity(intent);
			}
		});
		
		
}

}
