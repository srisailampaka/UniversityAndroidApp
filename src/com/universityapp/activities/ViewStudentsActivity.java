package com.universityapp.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.database.CursorIndexOutOfBoundsException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ViewStudentsActivity extends Activity {
	// TODO Auto-generated constructor stub
	ListView listview;

	private Button backButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_students);
		listview = (ListView) findViewById(R.id.listview);

		backButton = (Button) findViewById(R.id.viewstdnt_back_button);
		try {
			ArrayList<String> list = (new DatabaseHelper(getApplicationContext())).listOfStudents();
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
					android.R.id.text1, list);
			listview.setAdapter(adapter);
		} catch (CursorIndexOutOfBoundsException e) {
			// TODO: handle exception
		}

		backButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

}
