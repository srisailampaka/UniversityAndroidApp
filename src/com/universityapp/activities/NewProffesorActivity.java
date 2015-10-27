package com.universityapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NewProffesorActivity extends Activity {


	private Button saveButton;
	private EditText etFirstName;
	private EditText etLastName;
	private EditText etphone;
	private EditText etemail;

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
