package com.universityapp.activities;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	// Logcat tag
	private static final String LOG = "DatabaseHelper";

	// Database Version
	private static final int DATABASE_VERSION = 1;

	// Database Name
	private static final String DATABASE_NAME = "university";

	// Table Names
	private static final String TABLE_STUDENT_REGISTRATION = "student_registration";
	private static final String TABLE_PROFESSOR_REGISTRATION = "professor_registration";

	// Common Column names
	private static final String KEY_ID = "id";
	private static final String KEY_FNAME = "fname";
	private static final String KEY_LNAME = "lname";
	private static final String KEY_PHONE = "phone";
	private static final String KEY_EMAIL = "email";

	// Column names for student registration
	private static final String KEY_DOB = "dob";
	private static final String KEY_GENDER = "gender";
	private static final String KEY_ADDRESS = "address";
	private static final String KEY_USERNAME = "username";
	private static final String KEY_PASSWORD = "password";

	// Table Create Statements
	// Todo table create statement
	private static final String CREATE_TABLE_STUDENT = "CREATE TABLE " + TABLE_STUDENT_REGISTRATION + "(" + KEY_ID
			+ " INTEGER PRIMARY KEY," + KEY_FNAME + " TEXT," + KEY_LNAME + " TEXT," + KEY_PHONE + " TEXT," + KEY_EMAIL
			+ " TEXT," + KEY_DOB + " TEXT," + KEY_GENDER + " TEXT," + KEY_ADDRESS + " TEXT," + KEY_USERNAME + " TEXT,"
			+ KEY_PASSWORD + " TEXT" + ")";

	// Tag table create statement
	private static final String CREATE_TABLE_PREFESSOR = "CREATE TABLE " + TABLE_PROFESSOR_REGISTRATION + "(" + KEY_ID
			+ " INTEGER PRIMARY KEY," + KEY_FNAME + " TEXT," + KEY_LNAME + " TEXT," + KEY_PHONE + " TEXT," + KEY_EMAIL
			+ " TEXT," + KEY_USERNAME + " TEXT," + KEY_PASSWORD + " TEXT"+ ")";

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

		// creating required tables
		db.execSQL(CREATE_TABLE_STUDENT);
		db.execSQL(CREATE_TABLE_PREFESSOR);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// on upgrade drop older tables
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_TABLE_STUDENT);
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_TABLE_PREFESSOR);

		// create new tables
		onCreate(db);
	}

	public long createStudentegistraton(Student student) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_FNAME, student.getFname());
		values.put(KEY_LNAME, student.getLname());
		values.put(KEY_DOB, student.getDob());

		values.put(KEY_ADDRESS, student.getAddress());
		values.put(KEY_GENDER, student.getGender());
		values.put(KEY_PHONE, student.getPhone());

		values.put(KEY_USERNAME, student.getUsername());
		values.put(KEY_PASSWORD, student.getPassword());
		values.put(KEY_EMAIL, student.getEmail());

		// insert row
		long todo_id = db.insert(TABLE_STUDENT_REGISTRATION, null, values);

		return todo_id;
	}

	public Student getStudentLogin(String username, String password) {
	
		SQLiteDatabase db = this.getReadableDatabase();
		String selectQuery = "SELECT *FROM " + TABLE_STUDENT_REGISTRATION + " WHERE " + KEY_USERNAME + "='" + username
				+ "' AND " + KEY_PASSWORD + "='" + password+"'";

		Cursor c = db.rawQuery(selectQuery, null);
		Student student = new Student();
		if (c != null)
			c.moveToFirst();
		student.setSno(c.getString(c.getColumnIndex(KEY_ID)));
		student.setFname(c.getString(c.getColumnIndex(KEY_FNAME)));
		student.setLname(c.getString(c.getColumnIndex(KEY_LNAME)));
		student.setGender(c.getString(c.getColumnIndex(KEY_GENDER)));
		student.setEmail(c.getString(c.getColumnIndex(KEY_EMAIL)));

		student.setAddress(c.getString(c.getColumnIndex(KEY_ADDRESS)));
		student.setDob(c.getString(c.getColumnIndex(KEY_DOB)));
		student.setPassword(c.getString(c.getColumnIndex(KEY_PASSWORD)));
		student.setPhone(c.getString(c.getColumnIndex(KEY_PHONE)));
		student.setUsername(c.getString(c.getColumnIndex(KEY_USERNAME)));
		return student;
	}

	public Student getStudentLogin(String sno) {
		SQLiteDatabase db = this.getReadableDatabase();
		String selectQuery = "SELECT *FROM " + TABLE_STUDENT_REGISTRATION + " WHERE " + KEY_ID + "=" + sno;

		Cursor c = db.rawQuery(selectQuery, null);
		Student student = new Student();
		if (c != null)
			c.moveToFirst();
		student.setSno(c.getString(c.getColumnIndex(KEY_ID)));
		student.setFname(c.getString(c.getColumnIndex(KEY_FNAME)));
		student.setLname(c.getString(c.getColumnIndex(KEY_LNAME)));
		student.setGender(c.getString(c.getColumnIndex(KEY_GENDER)));
		student.setEmail(c.getString(c.getColumnIndex(KEY_EMAIL)));

		student.setAddress(c.getString(c.getColumnIndex(KEY_ADDRESS)));
		student.setDob(c.getString(c.getColumnIndex(KEY_DOB)));
		student.setPassword(c.getString(c.getColumnIndex(KEY_PASSWORD)));
		student.setPhone(c.getString(c.getColumnIndex(KEY_PHONE)));
		student.setUsername(c.getString(c.getColumnIndex(KEY_USERNAME)));
		return student;
	}
	public ArrayList<String> listOfStudents() {
		ArrayList<String> list = new ArrayList<String>();
		SQLiteDatabase db = this.getReadableDatabase();

		String selectQuery = "SELECT " + KEY_FNAME + "," + KEY_LNAME + " FROM " + TABLE_STUDENT_REGISTRATION;

		Cursor c = db.rawQuery(selectQuery, null);

		if (c != null)
			c.moveToFirst();

		list.add(c.getString(c.getColumnIndex(KEY_FNAME)) + " " + c.getString(c.getColumnIndex(KEY_LNAME)));

		return list;

	}

	public void updateTheValues(String id,String address, String phoneno, String email) {
		
		
		String selectQuery = "UPDATE  "+TABLE_STUDENT_REGISTRATION+" SET "+KEY_ADDRESS+"='"+address+"',"+KEY_PHONE+"='"+phoneno+"',"+KEY_EMAIL+"='"+email+"' WHERE "+KEY_ID+"='"+id+"'";
		SQLiteDatabase db = this.getReadableDatabase();
		db.execSQL(selectQuery);
	}

	
	public long createProfessorRegistraton(Professor professor) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_FNAME, professor.getFname());
		values.put(KEY_LNAME, professor.getLname());
		values.put(KEY_PHONE, professor.getPhone());
		values.put(KEY_USERNAME, professor.getUsername());
		values.put(KEY_PASSWORD, professor.getPassword());
		values.put(KEY_EMAIL, professor.getEmail());

		// insert row
		long todo_id = db.insert(TABLE_PROFESSOR_REGISTRATION, null, values);

		return todo_id;
	}
	public Professor getProfesserLogin(String username, String password) {
		
		SQLiteDatabase db = this.getReadableDatabase();
		String selectQuery = "SELECT *FROM " + TABLE_PROFESSOR_REGISTRATION + " WHERE " + KEY_USERNAME + "='" + username
				+ "' AND " + KEY_PASSWORD + "='" + password+"'";

		Cursor c = db.rawQuery(selectQuery, null);
		Professor professor = new Professor();
		if (c != null)
			c.moveToFirst();
		professor.setFname(c.getString(c.getColumnIndex(KEY_FNAME)));
		professor.setLname(c.getString(c.getColumnIndex(KEY_LNAME)));
		professor.setEmail(c.getString(c.getColumnIndex(KEY_EMAIL)));

		professor.setPassword(c.getString(c.getColumnIndex(KEY_PASSWORD)));
		professor.setPhone(c.getString(c.getColumnIndex(KEY_PHONE)));
		professor.setUsername(c.getString(c.getColumnIndex(KEY_USERNAME)));
		return professor;
	}
	
}
