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
import android.widget.Button;
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
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class AchievementsActivity extends AppCompatActivity {
	
	private final FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private final String timessolved = "";
	private final String fastesttime = "";
	private double timessolvednum = 0;
	private double fastesttimenum = 0;
	private double achievementstally = 0;
	private String signedinquery = "";
	private boolean achievement1 = false;
	private boolean achievement2 = false;
	private boolean achievement3 = false;
	private boolean achievement4 = false;
	private boolean achievement5 = false;
	private boolean achievement6 = false;
	private boolean achievement7 = false;
	private boolean achievement8 = false;
	private boolean achievement9 = false;
	private boolean achievement10 = false;
	private boolean achievement11 = false;
	private boolean achievement12 = false;
	private boolean achievement13 = false;
	private boolean achievement14 = false;
	private boolean achievement15 = false;
	private boolean achievement16 = false;
	private boolean achievement17 = false;
	private boolean achievement18 = false;
	private boolean achievement19 = false;
	private boolean achievement20 = false;
	private boolean achievement21 = false;
	private boolean achievement22 = false;
	private boolean achievement23 = false;
	private boolean achievement24 = false;
	private boolean achievement25 = false;
	private double xptotal = 0;
	private final HashMap<String, Object> JSON = new HashMap<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear28;
	private LinearLayout linear27;
	private LinearLayout achievementlinear1;
	private LinearLayout achievementlinear2;
	private LinearLayout achievementlinear3;
	private LinearLayout achievementlinear4;
	private LinearLayout achievementlinear5;
	private LinearLayout achievementlinear6;
	private LinearLayout achievementlinear7;
	private LinearLayout achievementlinear8;
	private LinearLayout achievementlinear9;
	private LinearLayout achievementlinear10;
	private LinearLayout achievementlinear11;
	private LinearLayout achievementlinear12;
	private LinearLayout achievementlinear13;
	private LinearLayout achievementlinear14;
	private LinearLayout achievementlinear15;
	private LinearLayout achievementlinear16;
	private LinearLayout achievementlinear17;
	private LinearLayout achievementlinear18;
	private LinearLayout achievementlinear19;
	private LinearLayout achievementlinear20;
	private LinearLayout achievementlinear21;
	private LinearLayout achievementlinear22;
	private LinearLayout achievementlinear23;
	private LinearLayout achievementlinear24;
	private LinearLayout achievementlinear25;
	private TextView textview1;
	private Button exit;
	private TextView name;
	private TextView totalxp;
	private ImageView achievementicon1;
	private TextView achievementextview1;
	private ImageView achievementicon2;
	private TextView achievementextview2;
	private ImageView achievementicon3;
	private TextView achievementextview3;
	private ImageView achievementicon4;
	private TextView achievementextview4;
	private ImageView achievementicon5;
	private TextView achievementextview5;
	private ImageView achievementicon6;
	private TextView achievementextview6;
	private ImageView achievementicon7;
	private TextView achievementextview7;
	private ImageView achievementicon8;
	private TextView achievementextview8;
	private ImageView achievementicon9;
	private TextView achievementextview9;
	private ImageView achievementicon10;
	private TextView achievementextview10;
	private ImageView achievementicon11;
	private TextView achievementextview11;
	private ImageView achievementicon12;
	private TextView achievementextview12;
	private ImageView achievementicon13;
	private TextView achievementextview13;
	private ImageView achievementicon14;
	private TextView achievementextview14;
	private ImageView achievementicon15;
	private TextView achievementextview15;
	private ImageView achievementicon16;
	private TextView achievementextview16;
	private ImageView achievementicon17;
	private TextView achievementextview17;
	private ImageView achievementicon18;
	private TextView achievementextview18;
	private ImageView achievementicon19;
	private TextView achievementextview19;
	private ImageView achievementicon20;
	private TextView achievementextview20;
	private ImageView achievementicon21;
	private TextView achievementextview21;
	private ImageView achievementicon22;
	private TextView achievementextview22;
	private ImageView achievementicon23;
	private TextView achievementextview23;
	private ImageView achievementicon24;
	private TextView achievementextview24;
	private ImageView achievementicon25;
	private TextView achievementextview25;
	
	private final DatabaseReference FirebaseDB = _firebase.getReference("Crossover/Leaderboard");
	private ChildEventListener _FirebaseDB_child_listener;
	private SharedPreferences shareIt;
	private final Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.achievements);
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
		linear1 = findViewById(R.id.linear1);
		linear28 = findViewById(R.id.linear28);
		linear27 = findViewById(R.id.linear27);
		achievementlinear1 = findViewById(R.id.achievementlinear1);
		achievementlinear2 = findViewById(R.id.achievementlinear2);
		achievementlinear3 = findViewById(R.id.achievementlinear3);
		achievementlinear4 = findViewById(R.id.achievementlinear4);
		achievementlinear5 = findViewById(R.id.achievementlinear5);
		achievementlinear6 = findViewById(R.id.achievementlinear6);
		achievementlinear7 = findViewById(R.id.achievementlinear7);
		achievementlinear8 = findViewById(R.id.achievementlinear8);
		achievementlinear9 = findViewById(R.id.achievementlinear9);
		achievementlinear10 = findViewById(R.id.achievementlinear10);
		achievementlinear11 = findViewById(R.id.achievementlinear11);
		achievementlinear12 = findViewById(R.id.achievementlinear12);
		achievementlinear13 = findViewById(R.id.achievementlinear13);
		achievementlinear14 = findViewById(R.id.achievementlinear14);
		achievementlinear15 = findViewById(R.id.achievementlinear15);
		achievementlinear16 = findViewById(R.id.achievementlinear16);
		achievementlinear17 = findViewById(R.id.achievementlinear17);
		achievementlinear18 = findViewById(R.id.achievementlinear18);
		achievementlinear19 = findViewById(R.id.achievementlinear19);
		achievementlinear20 = findViewById(R.id.achievementlinear20);
		achievementlinear21 = findViewById(R.id.achievementlinear21);
		achievementlinear22 = findViewById(R.id.achievementlinear22);
		achievementlinear23 = findViewById(R.id.achievementlinear23);
		achievementlinear24 = findViewById(R.id.achievementlinear24);
		achievementlinear25 = findViewById(R.id.achievementlinear25);
		textview1 = findViewById(R.id.textview1);
		exit = findViewById(R.id.exit);
		name = findViewById(R.id.name);
		totalxp = findViewById(R.id.totalxp);
		achievementicon1 = findViewById(R.id.achievementicon1);
		achievementextview1 = findViewById(R.id.achievementextview1);
		achievementicon2 = findViewById(R.id.achievementicon2);
		achievementextview2 = findViewById(R.id.achievementextview2);
		achievementicon3 = findViewById(R.id.achievementicon3);
		achievementextview3 = findViewById(R.id.achievementextview3);
		achievementicon4 = findViewById(R.id.achievementicon4);
		achievementextview4 = findViewById(R.id.achievementextview4);
		achievementicon5 = findViewById(R.id.achievementicon5);
		achievementextview5 = findViewById(R.id.achievementextview5);
		achievementicon6 = findViewById(R.id.achievementicon6);
		achievementextview6 = findViewById(R.id.achievementextview6);
		achievementicon7 = findViewById(R.id.achievementicon7);
		achievementextview7 = findViewById(R.id.achievementextview7);
		achievementicon8 = findViewById(R.id.achievementicon8);
		achievementextview8 = findViewById(R.id.achievementextview8);
		achievementicon9 = findViewById(R.id.achievementicon9);
		achievementextview9 = findViewById(R.id.achievementextview9);
		achievementicon10 = findViewById(R.id.achievementicon10);
		achievementextview10 = findViewById(R.id.achievementextview10);
		achievementicon11 = findViewById(R.id.achievementicon11);
		achievementextview11 = findViewById(R.id.achievementextview11);
		achievementicon12 = findViewById(R.id.achievementicon12);
		achievementextview12 = findViewById(R.id.achievementextview12);
		achievementicon13 = findViewById(R.id.achievementicon13);
		achievementextview13 = findViewById(R.id.achievementextview13);
		achievementicon14 = findViewById(R.id.achievementicon14);
		achievementextview14 = findViewById(R.id.achievementextview14);
		achievementicon15 = findViewById(R.id.achievementicon15);
		achievementextview15 = findViewById(R.id.achievementextview15);
		achievementicon16 = findViewById(R.id.achievementicon16);
		achievementextview16 = findViewById(R.id.achievementextview16);
		achievementicon17 = findViewById(R.id.achievementicon17);
		achievementextview17 = findViewById(R.id.achievementextview17);
		achievementicon18 = findViewById(R.id.achievementicon18);
		achievementextview18 = findViewById(R.id.achievementextview18);
		achievementicon19 = findViewById(R.id.achievementicon19);
		achievementextview19 = findViewById(R.id.achievementextview19);
		achievementicon20 = findViewById(R.id.achievementicon20);
		achievementextview20 = findViewById(R.id.achievementextview20);
		achievementicon21 = findViewById(R.id.achievementicon21);
		achievementextview21 = findViewById(R.id.achievementextview21);
		achievementicon22 = findViewById(R.id.achievementicon22);
		achievementextview22 = findViewById(R.id.achievementextview22);
		achievementicon23 = findViewById(R.id.achievementicon23);
		achievementextview23 = findViewById(R.id.achievementextview23);
		achievementicon24 = findViewById(R.id.achievementicon24);
		achievementextview24 = findViewById(R.id.achievementextview24);
		achievementicon25 = findViewById(R.id.achievementicon25);
		achievementextview25 = findViewById(R.id.achievementextview25);
		shareIt = getSharedPreferences("Data", Activity.MODE_PRIVATE);
		
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
		SketchwareUtil.showMessage(getApplicationContext(), "Work in progress");
		timessolvednum = Double.parseDouble(shareIt.getString("Statistics", ""));
		fastesttimenum = Double.parseDouble(shareIt.getString("Time", ""));
		name.setText(shareIt.getString("Username", ""));
		achievementstally = 0;
		xptotal = 0;
		signedinquery = getIntent().getStringExtra("Query");
		if (timessolvednum > 0) {
			achievement1 = true;
			achievementstally++;
			achievementicon1.setImageResource(R.drawable.tick);
			xptotal = xptotal + 500;
			if (timessolvednum > 1) {
				achievement2 = true;
				achievementstally++;
				achievementicon2.setImageResource(R.drawable.tick);
				xptotal = xptotal + 500;
				if (timessolvednum > 4) {
					achievement3 = true;
					achievementstally++;
					achievementicon3.setImageResource(R.drawable.tick);
					xptotal = xptotal + 1500;
					if (timessolvednum > 9) {
						achievement4 = true;
						achievementstally++;
						achievementicon4.setImageResource(R.drawable.tick);
						xptotal = xptotal + 2500;
						if (timessolvednum > 24) {
							achievement5 = true;
							achievementstally++;
							achievementicon5.setImageResource(R.drawable.tick);
							xptotal = xptotal + 7500;
							if (timessolvednum > 49) {
								achievement6 = true;
								achievementstally++;
								achievementicon6.setImageResource(R.drawable.tick);
								xptotal = xptotal + 12500;
								if (timessolvednum > 74) {
									achievement7 = true;
									achievementstally++;
									achievementicon7.setImageResource(R.drawable.tick);
									xptotal = xptotal + 12500;
									if (timessolvednum > 99) {
										achievement8 = true;
										achievementstally++;
										achievementicon8.setImageResource(R.drawable.tick);
										xptotal = xptotal + 12500;
										if (timessolvednum > 124) {
											achievement9 = true;
											achievementstally++;
											achievementicon9.setImageResource(R.drawable.tick);
											xptotal = xptotal + 12500;
											if (timessolvednum > 149) {
												achievement10 = true;
												achievementstally++;
												achievementicon10.setImageResource(R.drawable.tick);
												xptotal = xptotal + 12500;
												if (timessolvednum > 174) {
													achievement11 = true;
													achievementstally++;
													achievementicon11.setImageResource(R.drawable.tick);
													xptotal = xptotal + 12500;
													if (timessolvednum > 199) {
														achievement12 = true;
														achievementstally++;
														achievementicon12.setImageResource(R.drawable.tick);
														xptotal = xptotal + 12500;
														if (timessolvednum > 224) {
															achievement13 = true;
															achievementstally++;
															achievementicon13.setImageResource(R.drawable.tick);
															xptotal = xptotal + 12500;
															if (timessolvednum > 249) {
																achievement14 = true;
																achievementstally++;
																achievementicon14.setImageResource(R.drawable.tick);
																xptotal = xptotal + 12500;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!signedinquery.equals("")) {
			achievement22 = true;
			achievementstally++;
			achievementicon22.setImageResource(R.drawable.tick);
			xptotal = xptotal + 5000;
		}
		if (fastesttimenum < 3600) {
			achievement15 = true;
			achievementstally++;
			achievementicon15.setImageResource(R.drawable.tick);
			xptotal = xptotal + 500;
			if (fastesttimenum < 1800) {
				achievement16 = true;
				achievementstally++;
				achievementicon16.setImageResource(R.drawable.tick);
				xptotal = xptotal + 500;
				if (fastesttimenum < 600) {
					achievement17 = true;
					achievementstally++;
					achievementicon17.setImageResource(R.drawable.tick);
					xptotal = xptotal + 500;
					if (fastesttimenum < 300) {
						achievement18 = true;
						achievementstally++;
						achievementicon18.setImageResource(R.drawable.tick);
						xptotal = xptotal + 1500;
						if (fastesttimenum < 120) {
							achievement19 = true;
							achievementstally++;
							achievementicon19.setImageResource(R.drawable.tick);
							xptotal = xptotal + 2000;
							if (fastesttimenum < 60) {
								achievement20 = true;
								achievementstally++;
								achievementicon20.setImageResource(R.drawable.tick);
								xptotal = xptotal + 5000;
								if (fastesttimenum < 30) {
									achievement21 = true;
									achievementstally++;
									achievementicon21.setImageResource(R.drawable.tick);
									xptotal = xptotal + 10000;
								}
							}
						}
					}
				}
			}
		}
		if (achievementstally > 5) {
			achievement23 = true;
			achievementstally++;
			achievementicon23.setImageResource(R.drawable.tick);
			xptotal = xptotal + 10000;
			if (achievementstally > 15) {
				achievement24 = true;
				achievementstally++;
				achievementicon24.setImageResource(R.drawable.tick);
				xptotal = xptotal + 20000;
				if (achievementstally == 24) {
					achievement25 = true;
					achievementstally++;
					achievementicon25.setImageResource(R.drawable.tick);
					xptotal = xptotal + 20000;
				}
			}
		}
		totalxp.setText("Total XP: ".concat(String.valueOf((long)(xptotal))));
		shareIt.edit().putString("XP", String.valueOf((long)(xptotal))).commit();
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		
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
