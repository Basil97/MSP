package com.msp.AngryBirds;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	String Name, Slog, Descr;
	int Id;
	Intent intent;
	public void onImg(View view) 
	{
		intent = new Intent(MainActivity.this, ProfileActivity.class);
		
		switch(view.getId()) {
			case R.id.Red:
				Name = "Red";
				Slog = "ANGRIEST BIRD";
				Descr = getString(R.string.Red);
				Id = R.drawable.red;
				break;
			case R.id.Chuck:
				Name = "Chuck";
				Slog = "NO FILTER";
				Descr = getString(R.string.Chuck);
				Id = R.drawable.chuck;
				break;
			case R.id.Bomb:
				Name = "Bomb";
				Slog = "HAVE A BLAST!";
				Descr = getString(R.string.Bomb);
				Id = R.drawable.bomb;
				break;
			case R.id.Matilda:
				Name = "Matilda";
				Slog = "HIPPIE OF THE FLOCK";
				Descr = getString(R.string.Matilda);
				Id = R.drawable.matilda;
				break;
			case R.id.LeonardPigs:
				Name = "Leonard and The Pigs";
				Slog = "BAD PIGGIES?";
				Descr = getString(R.string.Leonard);
				Id = R.drawable.leonard_pigs;
				break;
			case R.id.MightyEagle:
				Name = "Mighty Eagle";
				Slog = "TOTAL LEGEND";
				Descr = getString(R.string.MightyEagle);
				Id = R.drawable.mighty_eagle;
				break;
			case R.id.Terence:
				Name = "Terence";
				Slog = "REALLY BIG";
				Descr = getString(R.string.Terence);
				Id = R.drawable.terence;
				break;
			case R.id.Stella:
				Name = "Stella";
				Slog = "FEISTY OPTIMIST";
				Descr = getString(R.string.Stella);
				Id = R.drawable.stella;
				break;
			case R.id.Blues:
				Name = "The Blues";
				Slog = "THREE OF A KIND";
				Descr = getString(R.string.TheBlues);
				Id = R.drawable.blues;
				break;
			case R.id.Hatchlings:
				Name = "Hatchlings";
				Slog = "FRESHLY HATCHED";
				Descr = getString(R.string.Hatchlings);
				Id = R.drawable.hatchlings;
				break;
		}
		intent.putExtra("name", Name);
		intent.putExtra("slogen", Slog);
		intent.putExtra("describe", Descr);
		intent.putExtra("id", Id);
		startActivity(intent);
	}
}
