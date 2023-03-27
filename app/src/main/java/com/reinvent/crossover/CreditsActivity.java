package com.reinvent.crossover;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class CreditsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ScrollView vscroll1;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear4;
	private TextView textview27;
	private LinearLayout linear9;
	private TextView textview25;
	private TextView textview1;
	private TextView textview2;
	private TextView textview20;
	private TextView emaildev;
	private TextView textview23;
	private TextView textview24;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview4;
	private TextView textview5;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private ImageView sketchware;
	private ImageView wordpress;
	private ImageView aide;
	private ImageView iconic;
	private TextView textview17;
	private TextView textview19;
	private TextView textview16;
	private TextView textview18;
	
	private final Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.credits);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		vscroll1 = findViewById(R.id.vscroll1);
		linear3 = findViewById(R.id.linear3);
		linear2 = findViewById(R.id.linear2);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear4 = findViewById(R.id.linear4);
		textview27 = findViewById(R.id.textview27);
		linear9 = findViewById(R.id.linear9);
		textview25 = findViewById(R.id.textview25);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview20 = findViewById(R.id.textview20);
		emaildev = findViewById(R.id.emaildev);
		textview23 = findViewById(R.id.textview23);
		textview24 = findViewById(R.id.textview24);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		sketchware = findViewById(R.id.sketchware);
		wordpress = findViewById(R.id.wordpress);
		aide = findViewById(R.id.aide);
		iconic = findViewById(R.id.iconic);
		textview17 = findViewById(R.id.textview17);
		textview19 = findViewById(R.id.textview19);
		textview16 = findViewById(R.id.textview16);
		textview18 = findViewById(R.id.textview18);
		
		emaildev.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setData(Uri.parse("mailto: apps.pads.ts@gmail.com"));
				startActivity(i);
			}
		});
		
		sketchware.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.besome.sketch"));
				startActivity(i);
			}
		});
		
		wordpress.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setData(Uri.parse("https://padsapps.wordpress.com"));
				startActivity(i);
			}
		});
		
		aide.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.aide.ui"));
				startActivity(i);
			}
		});
		
		iconic.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setData(Uri.parse("https://play.google.com/store/apps/details?id=xeus.iconic"));
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		textview24.setText("Crossover 1.6 \n*More improvements, UX improvements for the leaderboards - preparation for sorted leaderboards too.\n\n*Added version control - you'll need to have the latest version to be able to use the online features of the game.\n\n*The game timer now starts on your first move not as soon as the activity starts or you press the restart button.       \n\nMerry Christmas and Happy New Year to all you crazy gamers.\nWe'll be back in 2019 with more updates!\n\nEnjoy,\nTony Smith ");
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	@Override
	public void onResume() {
		super.onResume();
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int[] _location = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int[] _location = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
