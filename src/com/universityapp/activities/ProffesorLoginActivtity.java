package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ProffesorLoginActivtity extends Activity{
	
	private Button loginButton;
	private Button newProffessorButton;
	private EditText etUserName;
	private EditText etPassword;
	

			// TODO Auto-generated constructor stub

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proffesor_login);

		loginButton=(Button)findViewById(R.id.button_professor_login);
		newProffessorButton=(Button)findViewById(R.id.button_newproffesor);
		etUserName=(EditText)findViewById(R.id.proffesor_username);
		etPassword=(EditText)findViewById(R.id.proffesor_password);
		
		loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProffesorLoginActivtity.this,ProffesorScreenActivity.class);
				startActivity(intent);
			}
		});
		
       newProffessorButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ProffesorLoginActivtity.this,NewProffesorActivity.class);
				startActivity(intent);
			}
		});

		

	}
	}


