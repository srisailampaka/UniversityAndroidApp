package com.universityapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CommentsActivity extends Activity {

	// TODO Auto-generated constructor stub

	private EditText etComment;
	private Button backButton;
	private Button postButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comments);

		etComment = (EditText) findViewById(R.id.comments_et);
		backButton = (Button) findViewById(R.id.back_comment_btn);
		postButton = (Button) findViewById(R.id.post_comment_btn);

		backButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(CommentsActivity.this, ViewStudentsActivity.class);
				startActivity(intent);
			}
		});

		postButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Commnets added successfully ", Toast.LENGTH_LONG).show();
			}
		});

	}
}
