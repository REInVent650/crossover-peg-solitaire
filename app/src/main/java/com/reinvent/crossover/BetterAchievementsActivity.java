package com.reinvent.crossover;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class BetterAchievementsActivity extends AppCompatActivity {
	
	private final Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private final String title = "";
	private final String XP = "";
	private HashMap<String, Object> temp = new HashMap<>();
	private final boolean cool = false;
	
	private final ArrayList<HashMap<String, Object>> achievementTitles = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ListView listview1;
	
	private SharedPreferences shareIt;
	private final Intent intentional = new Intent();
	private TimerTask wait;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.better_achievements);
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
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		listview1 = findViewById(R.id.listview1);
		shareIt = getSharedPreferences("Data", Activity.MODE_PRIVATE);
	}
	
	private void initializeLogic() {
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover once");
		temp.put("XP", "500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover twice");
		temp.put("XP", "500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover five times");
		temp.put("XP", "1500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover ten times");
		temp.put("XP", "2500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover twenty-five times");
		temp.put("XP", "7500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover fifty times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover seventy-five times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover one hundred times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover one hundred and twenty-five times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover one hundred and fifty times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover one hundred and seventy-five times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover two hundred times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover two hundred and twenty-five times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover two hundred and fifty times");
		temp.put("XP", "12500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover in less than one hour");
		temp.put("XP", "500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover in less than half an hour");
		temp.put("XP", "500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover in less than ten minutes");
		temp.put("XP", "500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover in less than five minutes");
		temp.put("XP", "1500");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover in less than two minutes");
		temp.put("XP", "2000");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover in less than one minute");
		temp.put("XP", "5000");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Solve Crossover in less than thirty seconds");
		temp.put("XP", "10000");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Connect to PADSGAMER server");
		temp.put("XP", "5000");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Complete 20% of the achievements");
		temp.put("XP", "10000");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Complete 60% of the achievements");
		temp.put("XP", "20000");
		achievementTitles.add(temp);
		temp = new HashMap<>();
		temp.put("Title", "Complete 100% of the achievements");
		temp.put("XP", "20000");
		achievementTitles.add(temp);
		listview1.setAdapter(new Listview1Adapter(achievementTitles));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
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
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.achievement, null);
			}
			
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final LinearLayout linear6 = _view.findViewById(R.id.linear6);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear10 = _view.findViewById(R.id.linear10);
			final LinearLayout linear9 = _view.findViewById(R.id.linear9);
			final TextView achievement = _view.findViewById(R.id.achievement);
			final TextView xp = _view.findViewById(R.id.xp);
			
			achievement.setText(_data.get((int)_position).get("Title").toString());
			xp.setText(_data.get((int)_position).get("XP").toString().concat(" XP"));
			
			return _view;
		}
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
