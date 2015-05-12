package com.Fast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class aboutus extends Activity implements OnClickListener {
	Button bOK, bRegiter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		TextView text =  (TextView) findViewById(R.id.db3);
		text.setText(Html.fromHtml(
	            "<b>Open Source:</b>   " +
	                    "<a href=\"https://github.com/Ajk2rxKamehameha/Material-Design-Cricket-App-Template\">here</a> " +
	                    ""));
	        text.setMovementMethod(LinkMovementMethod.getInstance());

		bOK = (Button) findViewById(R.id.bOK);
		bRegiter = (Button) findViewById(R.id.bRegister);

		bOK.setOnClickListener(this);
		bRegiter.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.bOK:
			finish();
			break;
		case R.id.bRegister:
			Intent i = new Intent("com.Fast.REGISTER");
			startActivity(i);
			break;
		}
	}
}
