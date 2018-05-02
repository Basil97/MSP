package com.msp.AngryBirds;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;

public class ProfileActivity extends Activity
{
	TextView txtName, txtSlog, txtDescr;
	ImageView Img;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		
		txtName = (TextView) findViewById(R.id.txtName);
		txtSlog = (TextView) findViewById(R.id.txtSlog);
		txtDescr = (TextView) findViewById(R.id.txtDescript);
		Img = (ImageView) findViewById(R.id.profileIMG);
		
		Intent intent = getIntent();
		
		Img.setImageResource(intent.getIntExtra("id", R.drawable.red));
		txtName.setText(intent.getStringExtra("name"));
		txtSlog.setText(intent.getStringExtra("slogen"));
		txtDescr.setText(intent.getStringExtra("describe"));
	}
	
}
