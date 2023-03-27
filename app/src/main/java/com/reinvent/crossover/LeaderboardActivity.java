package com.reinvent.crossover;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.media.SoundPool;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class LeaderboardActivity extends AppCompatActivity {
	
	private final Timer _timer = new Timer();
	private final FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private final double number = 0;
	private final double animated = 0;
	private final double HighestIndex = 0;
	private final double a = 0;
	private double number1 = 0;
	private HashMap<String, Object> defaultDB = new HashMap<>();
	private double num = 0;
	private double result = 0;
	private double viewSelector = 0;
	private final double NuM = 0;
	private final HashMap<String, Object> temp = new HashMap<>();
	private boolean bool = false;
	
	private final ArrayList<HashMap<String, Object>> leaderboards = new ArrayList<>();
	private final ArrayList<String> Spinner = new ArrayList<>();
	private final ArrayList<HashMap<String, Object>> quantityMap = new ArrayList<>();
	private final ArrayList<HashMap<String, Object>> winner = new ArrayList<>();
	private final ArrayList<HashMap<String, Object>> timeMap = new ArrayList<>();
	private final ArrayList<HashMap<String, Object>> new_map = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> Original_FB_data = new ArrayList<>();
	private final ArrayList<Double> sort_list = new ArrayList<>();
	private final ArrayList<Double> result_list = new ArrayList<>();
	
	private LinearLayout linear1;
	private Spinner spinner1;
	private ListView list;
	
	private final DatabaseReference FirebaseDB = _firebase.getReference("Crossover/Leaderboard");
	private ChildEventListener _FirebaseDB_child_listener;
	private SharedPreferences shareIt;
	private TimerTask animate;
	private SoundPool tick;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.leaderboard);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		spinner1 = findViewById(R.id.spinner1);
		list = findViewById(R.id.list);
		shareIt = getSharedPreferences("Data", Activity.MODE_PRIVATE);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				bool = false;
				if (bool) {
					if (_position == 0) {
						new_map.clear();
						number1 = 0;
						viewSelector = 0;
						list.setAdapter(new ListAdapter(new_map));
						for(int _repeat245 = 0; _repeat245 < (int)(Original_FB_data.size()); _repeat245++) {
							if (!Original_FB_data.get((int)number1).get("XP").toString().equals("200000")) {
								defaultDB = new HashMap<>();
								defaultDB.put("Name", Original_FB_data.get((int)number1).get("Name").toString());
								defaultDB.put("Quantity", Original_FB_data.get((int)number1).get("Quantity").toString());
								defaultDB.put("Time", Original_FB_data.get((int)number1).get("Time").toString());
								defaultDB.put("XP", Original_FB_data.get((int)number1).get("XP").toString());
								new_map.add(defaultDB);
							}
							number1++;
							((BaseAdapter)list.getAdapter()).notifyDataSetChanged();
						}
						SketchwareUtil.showMessage(getApplicationContext(), "Winners");
					}
					if (_position == 1) {
						winner.clear();
						number1 = 0;
						viewSelector = 1;
						list.setAdapter(new ListAdapter(winner));
						for(int _repeat27 = 0; _repeat27 < (int)(Original_FB_data.size()); _repeat27++) {
							if (Original_FB_data.get((int)number1).get("XP").toString().equals("200000")) {
								defaultDB = new HashMap<>();
								defaultDB.put("Name", Original_FB_data.get((int)number1).get("Name").toString());
								defaultDB.put("Quantity", Original_FB_data.get((int)number1).get("Quantity").toString());
								defaultDB.put("Time", Original_FB_data.get((int)number1).get("Time").toString());
								defaultDB.put("XP", Original_FB_data.get((int)number1).get("XP").toString());
								winner.add(defaultDB);
							}
							number1++;
							((BaseAdapter)list.getAdapter()).notifyDataSetChanged();
						}
						SketchwareUtil.showMessage(getApplicationContext(), "Winners");
					}
					if (_position == 2) {
						viewSelector = 2;
						SketchwareUtil.showMessage(getApplicationContext(), "Time");
						sort_list.clear();
						result_list.clear();
						num = 0;
						for(int _repeat113 = 0; _repeat113 < (int)(Original_FB_data.size()); _repeat113++) {
							sort_list.add(Double.valueOf(Double.parseDouble(Original_FB_data.get((int)num).get("Time").toString())));
							num++;
						}
						Collections.sort(sort_list);
						num = 0;
						for(int _repeat137 = 0; _repeat137 < (int)(Original_FB_data.size()); _repeat137++) {
							result = 0;
							for(int _repeat138 = 0; _repeat138 < (int)(Original_FB_data.size()); _repeat138++) {
								if (Original_FB_data.get((int)result).get("Time").toString().equals(String.valueOf((long)(sort_list.get((int)(num)).doubleValue())))) {
									result_list.add(Double.valueOf(result));
									result++;
								}
								else {
									result++;
								}
							}
							num++;
							((BaseAdapter)list.getAdapter()).notifyDataSetChanged();
						}
					}
					if (_position == 3) {
						SketchwareUtil.showMessage(getApplicationContext(), "Quantity");
						viewSelector = 3;
						sort_list.clear();
						result_list.clear();
						num = 0;
						for(int _repeat168 = 0; _repeat168 < (int)(Original_FB_data.size()); _repeat168++) {
							sort_list.add(Double.valueOf(Double.parseDouble(Original_FB_data.get((int)num).get("Quantity").toString())));
							num++;
						}
						Collections.sort(sort_list, Collections.reverseOrder());
						num = 0;
						for(int _repeat180 = 0; _repeat180 < (int)(Original_FB_data.size()); _repeat180++) {
							result = 0;
							for(int _repeat184 = 0; _repeat184 < (int)(Original_FB_data.size()); _repeat184++) {
								if (Original_FB_data.get((int)result).get("Quantity").toString().equals(String.valueOf((long)(sort_list.get((int)(num)).doubleValue())))) {
									result_list.add(Double.valueOf(result));
									result++;
								}
								else {
									result++;
								}
							}
							num++;
							((BaseAdapter)list.getAdapter()).notifyDataSetChanged();
						}
					}
					if (_position == 4) {
						SketchwareUtil.showMessage(getApplicationContext(), "XP");
						viewSelector = 4;
						sort_list.clear();
						result_list.clear();
						num = 0;
						for(int _repeat208 = 0; _repeat208 < (int)(Original_FB_data.size()); _repeat208++) {
							sort_list.add(Double.valueOf(Double.parseDouble(Original_FB_data.get((int)num).get("XP").toString())));
							num++;
						}
						Collections.sort(sort_list, Collections.reverseOrder());
						num = 0;
						for(int _repeat220 = 0; _repeat220 < (int)(Original_FB_data.size()); _repeat220++) {
							result = 0;
							for(int _repeat224 = 0; _repeat224 < (int)(Original_FB_data.size()); _repeat224++) {
								if (Original_FB_data.get((int)result).get("XP").toString().equals(String.valueOf((long)(sort_list.get((int)(num)).doubleValue())))) {
									result_list.add(Double.valueOf(result));
									result++;
								}
								else {
									result++;
								}
							}
							num++;
							((BaseAdapter)list.getAdapter()).notifyDataSetChanged();
						}
					}
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		_FirebaseDB_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		FirebaseDB.addChildEventListener(_FirebaseDB_child_listener);
	}
	
	private void initializeLogic() {
		viewSelector = 0;
		Spinner.add("                                                   ");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, Spinner));
		((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
		FirebaseDB.addListenerForSingleValueEvent(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot _dataSnapshot) {
				Original_FB_data = new ArrayList<>();
				try {
					GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
					for (DataSnapshot _data : _dataSnapshot.getChildren()) {
						HashMap<String, Object> _map = _data.getValue(_ind);
						Original_FB_data.add(_map);
					}
				}
				catch (Exception _e) {
					_e.printStackTrace();
				}
				list.setAdapter(new ListAdapter(Original_FB_data));
				((BaseAdapter)list.getAdapter()).notifyDataSetChanged();
			}
			@Override
			public void onCancelled(DatabaseError _databaseError) {
			}
		});
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
	public class ListAdapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public ListAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_view = _inflater.inflate(R.layout.leaderboards, null);
			}
			
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final LinearLayout linear7 = _view.findViewById(R.id.linear7);
			final LinearLayout linear6 = _view.findViewById(R.id.linear6);
			final TextView namelite = _view.findViewById(R.id.namelite);
			final TextView xplite = _view.findViewById(R.id.xplite);
			final TextView quantitylite = _view.findViewById(R.id.quantitylite);
			final TextView timelite = _view.findViewById(R.id.timelite);
			
			namelite.setText(_data.get((int)_position).get("Name").toString());
			quantitylite.setText(_data.get((int)_position).get("Quantity").toString().concat(" Game(s)"));
			timelite.setText(_data.get((int)_position).get("Time").toString().concat(" Second(s)"));
			xplite.setText(_data.get((int)_position).get("XP").toString().concat(" XP"));
			
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
