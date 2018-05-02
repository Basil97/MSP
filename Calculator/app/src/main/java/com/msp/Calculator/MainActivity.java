package com.msp.Calculator;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.text.*;

public class MainActivity extends Activity 
{
	TextView maintxt, resulttxt;
	double result, newresult, num;
	char oprat = ' ';

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		maintxt = (TextView) findViewById(R.id.maintxt);
		resulttxt = (TextView) findViewById(R.id.resulttxt);

		Button btnremove = (Button) findViewById(R.id.btnremove);
		
		btnremove.setOnLongClickListener(new View.OnLongClickListener() {

				@Override
				public boolean onLongClick(View p1)
				{
					maintxt.setText("");
					resulttxt.setText("");
					num = 0;
					result = 0;
					newresult = 0;
					oprat = ' ';
					start = 0;
					return true;
				}
			});
    }
	
	int start = 0;
	public void onChange()
	{
		String text = maintxt.getText().toString();
		if(text.endsWith("+") || text.endsWith("-") || 
			text.endsWith("*") || text.endsWith("/")) {
			oprat = text.charAt(text.length()-1);
			result = newresult;
			start = text.length();
		}else {
			num = Double.valueOf(text.substring(start));
			calculat(num);
		}
	}
	
	public void calculat(double number)
	{
		switch(oprat) {
			case '+':
				newresult = result + number;
				break;
			case '-':
				newresult = result - number;
				break;
			case '*':
				newresult = result * number;
				break;
			case '/':
				if(number == 0) {resulttxt.setText("∞"); return;}
				newresult = result / number;
				break;
			default:
				newresult = number;
				result = number;
		}
		
		resulttxt.setText(Double.toString(newresult));
	}

	public void onBtn(View view)
	{
		switch (view.getId())
		{
			case R.id.btn0:
				maintxt.append("0");
				onChange();
				break;
			case R.id.btn1:
				maintxt.append("1");
				onChange();
				break;
			case R.id.btn2:
				maintxt.append("2");
				onChange();
				break;
			case R.id.btn3:
				maintxt.append("3");
				onChange();
				break;
			case R.id.btn4:
				maintxt.append("4");
				onChange();
				break;
			case R.id.btn5:
				maintxt.append("5");
				onChange();
				break;
			case R.id.btn6:
				maintxt.append("6");
				onChange();
				break;
			case R.id.btn7:
				maintxt.append("7");
				onChange();
				break;
			case R.id.btn8:
				maintxt.append("8");
				onChange();
				break;
			case R.id.btn9:
				maintxt.append("9");
				onChange();
				break;
			case R.id.btndot:
				maintxt.append(".");
				break;
			case R.id.btnplus:
				maintxt.append("+");
				onChange();
				break;
			case R.id.btnminas:
				maintxt.append("-");
				onChange();
				break;
			case R.id.btnmalti:
				maintxt.append("*");
				onChange();
				break;
			case R.id.btndivid:
				maintxt.append("/");
				onChange();
				break;
			case R.id.btnremove:
				maintxt.setText("");
				resulttxt.setText("");
				num = 0;
				result = 0;
				newresult = 0;
				oprat = ' ';
				start = 0;
				/*
				String txt = maintxt.getText().toString();
				if (!txt.isEmpty())
					maintxt.setText(txt.substring(0, txt.length()-1));
				//onChange();*/
				break;
			case R.id.btneql:
				maintxt.setText(Double.toString(newresult));
				resulttxt.setText("");
				break;
		}
	}

}
