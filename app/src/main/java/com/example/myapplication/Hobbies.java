package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Hobbies extends AppCompatActivity implements OnClickListener
{
	Button playbtn, stopbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hobbies);
		playbtn = findViewById(R.id.button3);
		stopbtn = findViewById(R.id.button4);
		playbtn.setOnClickListener(this);
		stopbtn.setOnClickListener(this);
	}
	public void onClick(View view) {
		Intent media_player = new Intent(this, MediaPlayerService.class);
		if (view == playbtn) {
			startService(media_player);
		}
		else if (view == stopbtn) {
			stopService(media_player);
		}
	}
}