package com.msp.TicTacToe;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		View view = new View(this);
		view.setBackgroundResource(R.drawable.xo);
		
		Toast toast = new Toast(this);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(view);
		toast.show();
    }
	
	public void onPlay(View view) 
	{
		Intent intent = new Intent(MainActivity.this, GameActivity.class);
		startActivity(intent);
	}
}
