package com.universityapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewProffesorActivity extends Activity {


	private Button saveButton;
	private EditText etFirstName;
	private EditText etLastName;
	private EditText etphone;
	private EditText etemail;
	private EditText etusername;
	private EditText etpassword;

	// TODO Auto-generated constructor stub

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_proffesor);
		
			saveButton=(Button)findViewById(R.id.professor_save_button);		
	etFirstName=(EditText)findViewById(R.id.professor_fn);
	etLastName=(EditText)findViewById(R.id.professor_ln);
	etphone=(EditText)findViewById(R.id.professor_phn);
	etemail=(EditText)findViewById(R.id.professor_id);
	etusername=(EditText)findViewById(R.id.et_username);
	etpassword=(EditText)findViewById(R.id.et_password);
			
			saveButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Professor professor=new Professor();
					professor.setEmail(etemail.getText().toString());
					professor.setFname(etFirstName.getText().toString());
					professor.setLname(etLastName.getText().toString());
					professor.setPassword(etpassword.getText().toString());;
					professor.setUsername(etusername.getText().toString());
					(new DatabaseHelper(getApplicationContext())).createProfessorRegistraton(professor);
					Toast.makeText(getApplicationContext(),"successfully registered", Toast.LENGTH_LONG).show();
					// TODO Auto-generated method stub
					
					//Intent intent = new Intent(NewStudentActivity.this,MainActivity.class);
					//startActivity(Intent);
				}
			});
		
	}

}
