package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewStudentsActivity extends Activity {
	// TODO Auto-generated constructor stub
	
	private Button backButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_students);
		
		backButton=(Button)findViewById(R.id.viewstdnt_back_button);
		
		
		
		backButton.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Intent intent = new Intent(ViewStudentsActivity.this,GradeActivity.class);
			//startActivity(intent);
		}
		});
	}

}
