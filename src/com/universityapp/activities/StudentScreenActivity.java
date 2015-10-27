package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class StudentScreenActivity extends Activity{



	private Button personalDetailsButton;
	private Button coursesButton;
	private Button gradesButton;
	private Button logoutButton;
		// TODO Auto-generated constructor stub

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_screen);
		
		personalDetailsButton=(Button)findViewById(R.id.personaldetails_button);
		coursesButton=(Button)findViewById(R.id.courses_button);
		gradesButton=(Button)findViewById(R.id.grades_button);
		logoutButton=(Button)findViewById(R.id.student_logout_button);
		
		

personalDetailsButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StudentScreenActivity.this,PersonalDetailsActivity.class);
				startActivity(intent);
			}
		});
coursesButton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(StudentScreenActivity.this,CoursesActivity.class);
		startActivity(intent);
	}
});

gradesButton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(StudentScreenActivity.this,GradeActivity.class);
		startActivity(intent);
	}
});

logoutButton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(StudentScreenActivity.this,MainActivity.class);
		startActivity(intent);
	}
});



		
	}

}
