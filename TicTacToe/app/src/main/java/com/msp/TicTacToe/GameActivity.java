package com.msp.TicTacToe;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.graphics.*;

public class GameActivity extends Activity
{
	int p1Score = 0, p2Score = 0;
	char player = 'x';

	TextView P1Score, P2Score;
	View v1, v2;
	ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gamelayout);

		P1Score = (TextView) findViewById(R.id.P1Score);
		P2Score = (TextView) findViewById(R.id.P2Score);

		v1 = findViewById(R.id.v1);
		v2 = findViewById(R.id.v2);
		v1.setBackgroundColor(getResources().getColor(R.color.green));

		img1 = (ImageView) findViewById(R.id.Img1);
		img2 = (ImageView) findViewById(R.id.Img2);
		img3 = (ImageView) findViewById(R.id.Img3);
		img4 = (ImageView) findViewById(R.id.Img4);
		img5 = (ImageView) findViewById(R.id.Img5);
		img6 = (ImageView) findViewById(R.id.Img6);
		img7 = (ImageView) findViewById(R.id.Img7);
		img8 = (ImageView) findViewById(R.id.Img8);
		img9 = (ImageView) findViewById(R.id.Img9);
	}

	char xo[] = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	boolean bo = false;
	public void onClick(View view)
	{
		switch (view.getId()) 
		{
			case R.id.Img1:
				if (xo[1] == ' ')
				{
					xo[1] = player;
					bo = true;
				}
				break;
			case R.id.Img2:
				if (xo[2] == ' ')
				{
					xo[2] = player;
					bo = true;
				}
				break;
			case R.id.Img3:
				if (xo[3] == ' ')
				{
					xo[3] = player;
					bo = true;
				}
				break;
			case R.id.Img4:
				if (xo[4] == ' ')
				{
					xo[4] = player;
					bo = true;
				}
				break;
			case R.id.Img5:
				if (xo[5] == ' ')
				{
					xo[5] = player;
					bo = true;
				}
				break;
			case R.id.Img6:
				if (xo[6] == ' ')
				{
					xo[6] = player;
					bo = true;
				}
				break;
			case R.id.Img7:
				if (xo[7] == ' ')
				{
					xo[7] = player;
					bo = true;
				}
				break;
			case R.id.Img8:
				if (xo[8] == ' ')
				{
					xo[8] = player;
					bo = true;
				}
				break;
			case R.id.Img9:
				if (xo[9] == ' ')
				{
					xo[9] = player;
					bo = true;
				}
				break;
		}
		if (bo && winner == ' ')
		{
			display();
			if (player == 'x')
			{
				player = 'o';
				v1.setBackgroundColor(0);
				v2.setBackgroundColor(getResources().getColor(R.color.green));
				bo = false;
			}
			else
			{
				player = 'x';
				v1.setBackgroundColor(getResources().getColor(R.color.green));
				v2.setBackgroundColor(0);
				bo = false;
			}
		}
	}
	
	public void display()
	{
		if (xo[1] != ' ')
			img1.setImageResource((xo[1] == 'x') ? R.drawable.x: R.drawable.o);
		if (xo[2] != ' ')
			img2.setImageResource((xo[2] == 'x') ? R.drawable.x: R.drawable.o);
		if (xo[3] != ' ')
			img3.setImageResource((xo[3] == 'x') ? R.drawable.x: R.drawable.o);
		if (xo[4] != ' ')
			img4.setImageResource((xo[4] == 'x') ? R.drawable.x: R.drawable.o);
		if (xo[5] != ' ')
			img5.setImageResource((xo[5] == 'x') ? R.drawable.x: R.drawable.o);
		if (xo[6] != ' ')
			img6.setImageResource((xo[6] == 'x') ? R.drawable.x: R.drawable.o);
		if (xo[7] != ' ')
			img7.setImageResource((xo[7] == 'x') ? R.drawable.x: R.drawable.o);
		if (xo[8] != ' ')
			img8.setImageResource((xo[8] == 'x') ? R.drawable.x: R.drawable.o);
		if (xo[9] != ' ')
			img9.setImageResource((xo[9] == 'x') ? R.drawable.x: R.drawable.o);

		check();
	}

	char winner = ' ';
	public void check()
	{
		if (xo[1] == xo[2] && xo[1] == xo[3]  &&  xo[1] != ' ') winner = xo[1];
		if (xo[4] == xo[5] && xo[4] == xo[6]  &&  xo[4] != ' ') winner = xo[4];
		if (xo[7] == xo[8] && xo[7] == xo[9]  &&  xo[7] != ' ') winner = xo[7];
		if (xo[1] == xo[4] && xo[1] == xo[7]  &&  xo[1] != ' ') winner = xo[1];
		if (xo[2] == xo[5] && xo[2] == xo[8]  &&  xo[2] != ' ') winner = xo[2];
		if (xo[3] == xo[6] && xo[3] == xo[9]  &&  xo[3] != ' ') winner = xo[3];
		if (xo[1] == xo[5] && xo[1] == xo[9]  &&  xo[1] != ' ') winner = xo[1];
		if (xo[3] == xo[5] && xo[3] == xo[7]  &&  xo[3] != ' ') winner = xo[3];

		if (winner != ' ')
		{
			if (winner == 'x')
			{
				Toast.makeText(this, "X player wins", Toast.LENGTH_LONG).show();
				p1Score++;
				setScore();
			}
			else
			{
				Toast.makeText(this, "O player wins", Toast.LENGTH_LONG).show();
				p2Score++;
				setScore();
			}
		}
		else if (xo[1] != ' ' && xo[2] != ' ' && xo[3] != ' ' &&
				 xo[4] != ' ' && xo[5] != ' ' && xo[6] != ' ' &&
				 xo[7] != ' ' && xo[8] != ' ' && xo[9] != ' ')
		{
			Toast.makeText(this, "DRAW", Toast.LENGTH_LONG).show();
		}
	}

	public void onNewGame(View view) 
	{
		newGame();
	}

	public void newGame() 
	{
		img1.setImageDrawable(null);
		img2.setImageDrawable(null);
		img3.setImageDrawable(null);
		img4.setImageDrawable(null);
		img5.setImageDrawable(null);
		img6.setImageDrawable(null);
		img7.setImageDrawable(null);
		img8.setImageDrawable(null);
		img9.setImageDrawable(null);
		for (int i = 0; i < 10; i++)
		{
			xo[i] = ' ';
		}
		winner = ' ';
		player = 'x';
		v1.setBackgroundColor(getResources().getColor(R.color.green));
		v2.setBackgroundColor(0);
	}

	public void onReset(View view) 
	{
		p1Score = 0;
		p2Score = 0;
		setScore();
	}

	public void setScore()
	{
		P1Score.setText("Score: " + p1Score);
		P2Score.setText("Score: " + p2Score);
	}

}
