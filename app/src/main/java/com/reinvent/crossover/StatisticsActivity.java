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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
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
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.io.*;
import java.text.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class StatisticsActivity extends AppCompatActivity {
	
	private final FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private final String CurrentStatistics = "";
	private final HashMap<String, Object> timessolved = new HashMap<>();
	private final HashMap<String, Object> fastesttime = new HashMap<>();
	private final String currenttimestatistic = "";
	private final boolean achievement1 = false;
	private final boolean achievement2 = false;
	private final boolean achievement3 = false;
	private final boolean achievement4 = false;
	private final boolean achievement5 = false;
	private final boolean achievement6 = false;
	private final boolean achievement7 = false;
	private final boolean achievement8 = false;
	private final boolean achievement9 = false;
	private final boolean achievement10 = false;
	private double timessolvednum = 0;
	private double fastesttimenum = 0;
	private final boolean achievement11 = false;
	private final boolean achievement12 = false;
	private final boolean achievement13 = false;
	private final boolean achievement14 = false;
	private final boolean achievement15 = false;
	private final boolean achievement16 = false;
	private final boolean achievement17 = false;
	private final boolean achievement18 = false;
	private final boolean achievement19 = false;
	private final boolean achievement20 = false;
	private final boolean achievement21 = false;
	private final boolean achievement22 = false;
	private final boolean achievement23 = false;
	private final boolean achievement24 = false;
	private final boolean achievement25 = false;
	private double achievementstally = 0;
	private final double signedinquery = 0;
	private final HashMap<String, Object> Jasonmap1 = new HashMap<>();
	private final HashMap<String, Object> Jasonmap2 = new HashMap<>();
	private final HashMap<String, Object> Statistics = new HashMap<>();
	private final double statisticsint = 0;
	private final double timestatistics = 0;
	private HashMap<String, Object> Leaderboard_Data = new HashMap<>();
	private double totalXP = 0;
	private final boolean bool = false;
	private final double vid = 0;
	
	private final ArrayList<String> achievementsstring = new ArrayList<>();
	private final ArrayList<HashMap<String, Object>> achievementsmap = new ArrayList<>();
	
	private ScrollView vscroll4;
	private LinearLayout linear1;
	private TextView welcome;
	private LinearLayout linear2;
	private LinearLayout linear6;
	private LinearLayout linear3;
	private LinearLayout firebaseauth;
	private LinearLayout linear7;
	private TextView textview2;
	private TextView gamessolved;
	private TextView textview6;
	private TextView textview4;
	private TextView fastesttimee;
	private TextView textview7;
	private Button achievments;
	private Button leaderboards;
	private EditText emailinput;
	private TextView emailfieldrequired;
	private EditText usernameinput;
	private TextView unamefieldrequired;
	private EditText passwordinput;
	private TextView pwordfieldrequired;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear5;
	private Button signin;
	private TextView textview8;
	private Button register;
	
	private final Intent intent = new Intent();
	private FirebaseAuth Authentication;
	private OnCompleteListener<AuthResult> _Authentication_create_user_listener;
	private OnCompleteListener<AuthResult> _Authentication_sign_in_listener;
	private OnCompleteListener<Void> _Authentication_reset_password_listener;
	private OnCompleteListener<Void> Authentication_updateEmailListener;
	private OnCompleteListener<Void> Authentication_updatePasswordListener;
	private OnCompleteListener<Void> Authentication_emailVerificationSentListener;
	private OnCompleteListener<Void> Authentication_deleteUserListener;
	private OnCompleteListener<Void> Authentication_updateProfileListener;
	private OnCompleteListener<AuthResult> Authentication_phoneAuthListener;
	private OnCompleteListener<AuthResult> Authentication_googleSignInListener;
	
	private SharedPreferences Username;
	private final DatabaseReference database = _firebase.getReference("crossover/users");
	private ChildEventListener _database_child_listener;
	private final DatabaseReference FirebaseDB = _firebase.getReference("Crossover/Leaderboard");
	private ChildEventListener _FirebaseDB_child_listener;
	private SharedPreferences shareIt;
	private Calendar date = Calendar.getInstance();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.statistics);
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
		_fab = findViewById(R.id._fab);
		
		vscroll4 = findViewById(R.id.vscroll4);
		linear1 = findViewById(R.id.linear1);
		welcome = findViewById(R.id.welcome);
		linear2 = findViewById(R.id.linear2);
		linear6 = findViewById(R.id.linear6);
		linear3 = findViewById(R.id.linear3);
		firebaseauth = findViewById(R.id.firebaseauth);
		linear7 = findViewById(R.id.linear7);
		textview2 = findViewById(R.id.textview2);
		gamessolved = findViewById(R.id.gamessolved);
		textview6 = findViewById(R.id.textview6);
		textview4 = findViewById(R.id.textview4);
		fastesttimee = findViewById(R.id.fastesttimee);
		textview7 = findViewById(R.id.textview7);
		achievments = findViewById(R.id.achievments);
		leaderboards = findViewById(R.id.leaderboards);
		emailinput = findViewById(R.id.emailinput);
		emailfieldrequired = findViewById(R.id.emailfieldrequired);
		usernameinput = findViewById(R.id.usernameinput);
		unamefieldrequired = findViewById(R.id.unamefieldrequired);
		passwordinput = findViewById(R.id.passwordinput);
		pwordfieldrequired = findViewById(R.id.pwordfieldrequired);
		hscroll2 = findViewById(R.id.hscroll2);
		linear5 = findViewById(R.id.linear5);
		signin = findViewById(R.id.signin);
		textview8 = findViewById(R.id.textview8);
		register = findViewById(R.id.register);
		Authentication = FirebaseAuth.getInstance();
		Username = getSharedPreferences("Username", Activity.MODE_PRIVATE);
		shareIt = getSharedPreferences("Data", Activity.MODE_PRIVATE);
		
		achievments.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), BetterAchievementsActivity.class);
				startActivity(intent);
			}
		});
		
		leaderboards.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), LeaderboardActivity.class);
				startActivity(intent);
			}
		});
		
		signin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!usernameinput.getText().toString().equals("") && (!emailinput.getText().toString().equals("") && !passwordinput.getText().toString().equals(""))) {
					Authentication.signInWithEmailAndPassword(emailinput.getText().toString(), passwordinput.getText().toString()).addOnCompleteListener(StatisticsActivity.this, _Authentication_sign_in_listener);
					shareIt.edit().putString("Username", usernameinput.getText().toString()).commit();
					shareIt.edit().putString("Email", emailinput.getText().toString()).commit();
					shareIt.edit().putString("Password", passwordinput.getText().toString()).commit();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "All Fields Required!");
					if (emailinput.getText().toString().equals("")) {
						emailfieldrequired.setVisibility(View.VISIBLE);
					}
					if (usernameinput.getText().toString().equals("")) {
						unamefieldrequired.setVisibility(View.VISIBLE);
					}
					if (passwordinput.getText().toString().equals("")) {
						pwordfieldrequired.setVisibility(View.VISIBLE);
					}
				}
			}
		});
		
		register.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!usernameinput.getText().toString().equals("") && (!emailinput.getText().toString().equals("") && !passwordinput.getText().toString().equals(""))) {
					Authentication.createUserWithEmailAndPassword(emailinput.getText().toString(), passwordinput.getText().toString()).addOnCompleteListener(StatisticsActivity.this, _Authentication_create_user_listener);
					shareIt.edit().putString("Username", usernameinput.getText().toString()).commit();
					shareIt.edit().putString("Email", emailinput.getText().toString()).commit();
					shareIt.edit().putString("Password", passwordinput.getText().toString()).commit();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "All Fields Required!");
					if (emailinput.getText().toString().equals("")) {
						emailfieldrequired.setVisibility(View.VISIBLE);
					}
					if (usernameinput.getText().toString().equals("")) {
						unamefieldrequired.setVisibility(View.VISIBLE);
					}
					if (passwordinput.getText().toString().equals("")) {
						pwordfieldrequired.setVisibility(View.VISIBLE);
					}
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
					_fab.setAlpha((float)0.5);
			}
		});
		
		_database_child_listener = new ChildEventListener() {
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
		database.addChildEventListener(_database_child_listener);
		
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
		
		Authentication_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Authentication_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Authentication_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Authentication_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Authentication_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		Authentication_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		Authentication_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_Authentication_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				_moreBlock();
				if (_success) {
					welcome.setText("Welcome ".concat(shareIt.getString("Username", "")));
					firebaseauth.setVisibility(View.INVISIBLE);
					SketchwareUtil.showMessage(getApplicationContext(), "Success!");
					Username.edit().putString("Signed in before", "1").commit();
					Leaderboard_Data.put("Uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
					FirebaseDB.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).updateChildren(Leaderboard_Data);
					RemoteViews contentView = new RemoteViews(getPackageName(), R.layout.notify_register);
					Notification.Builder mBuilder = new Notification.Builder(StatisticsActivity.this);
					mBuilder.setSmallIcon(R.drawable.logo);
					mBuilder.setContent(contentView);
					mBuilder.setDefaults( Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE);
					NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
					Intent notificationIntent = new Intent(getApplicationContext(),
					MainActivity.class);
					PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, notificationIntent, PendingIntent.FLAG_NO_CREATE);
					mBuilder.setContentIntent(pendingIntent).setAutoCancel(false);
					notificationManager.notify(4, mBuilder.build());
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
		
		_Authentication_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				_moreBlock();
				if (_success) {
					welcome.setText("Welcome ".concat(shareIt.getString("Username", "")));
					firebaseauth.setVisibility(View.INVISIBLE);
					Username.edit().putString("Signed in before", "1").commit();
					Leaderboard_Data.put("Uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
					FirebaseDB.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).updateChildren(Leaderboard_Data);
					RemoteViews contentView = new RemoteViews(getPackageName(), R.layout.notify_sign_in);
					Notification.Builder mBuilder = new Notification.Builder(StatisticsActivity.this);
					mBuilder.setSmallIcon(R.drawable.logo);
					mBuilder.setContent(contentView);
					mBuilder.setDefaults( Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE);
					NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
					Intent notificationIntent = new Intent(getApplicationContext(),
					MainActivity.class);
					PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, notificationIntent, PendingIntent.FLAG_NO_CREATE);
					mBuilder.setContentIntent(pendingIntent).setAutoCancel(false);
					notificationManager.notify(4, mBuilder.build());
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
		
		_Authentication_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		gamessolved.setText(shareIt.getString("Statistics", ""));
		fastesttimee.setText(shareIt.getString("Time", ""));
		unamefieldrequired.setVisibility(View.GONE);
		pwordfieldrequired.setVisibility(View.GONE);
		emailfieldrequired.setVisibility(View.GONE);


	}
	
	@Override
	public void onStart() {
		super.onStart();
		welcome.setText("Welcome ".concat(shareIt.getString("Username", "")));
		if (!shareIt.getString("Email", "").equals("") && !"".equals(shareIt.getString("Password", ""))) {
			Authentication.signInWithEmailAndPassword(shareIt.getString("Email", ""), shareIt.getString("Password", "")).addOnCompleteListener(StatisticsActivity.this, _Authentication_sign_in_listener);
		}
	}
	
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);
		timessolvednum = Double.parseDouble(shareIt.getString("Statistics", ""));
		fastesttimenum = Double.parseDouble(shareIt.getString("Time", ""));
		achievementstally = 0;
		totalXP = 0;
		if (timessolvednum > 0) {
			achievementstally++;
			totalXP = totalXP + 500;
			shareIt.edit().putString("Achievement 1", "1").commit();
			if (timessolvednum > 1) {
				achievementstally++;
				totalXP = totalXP + 500;
				shareIt.edit().putString("Achievement 2", "1").commit();
				if (timessolvednum > 4) {
					achievementstally++;
					totalXP = totalXP + 1500;
					shareIt.edit().putString("Achievement 3", "1").commit();
					if (timessolvednum > 9) {
						achievementstally++;
						totalXP = totalXP + 2500;
						shareIt.edit().putString("Achievement 4", "1").commit();
						if (timessolvednum > 24) {
							achievementstally++;
							totalXP = totalXP + 7500;
							shareIt.edit().putString("Achievement 5", "1").commit();
							if (timessolvednum > 49) {
								achievementstally++;
								totalXP = totalXP + 12500;
								shareIt.edit().putString("Achievement 6", "1").commit();
								if (timessolvednum > 74) {
									achievementstally++;
									totalXP = totalXP + 12500;
									shareIt.edit().putString("Achievement 7", "1").commit();
									if (timessolvednum > 99) {
										achievementstally++;
										totalXP = totalXP + 12500;
										shareIt.edit().putString("Achievement 8", "1").commit();
										if (timessolvednum > 124) {
											achievementstally++;
											totalXP = totalXP + 12500;
											shareIt.edit().putString("Achievement 9", "1").commit();
											if (timessolvednum > 149) {
												achievementstally++;
												totalXP = totalXP + 12500;
												shareIt.edit().putString("Achievement 10", "1").commit();
												if (timessolvednum > 174) {
													achievementstally++;
													totalXP = totalXP + 12500;
													shareIt.edit().putString("Achievement 11", "1").commit();
													if (timessolvednum > 199) {
														achievementstally++;
														totalXP = totalXP + 12500;
														shareIt.edit().putString("Achievement 12", "1").commit();
														if (timessolvednum > 224) {
															achievementstally++;
															totalXP = totalXP + 12500;
															shareIt.edit().putString("Achievement 13", "1").commit();
															if (timessolvednum > 249) {
																achievementstally++;
																totalXP = totalXP + 12500;
																shareIt.edit().putString("Achievement 14", "1").commit();
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
		if (!shareIt.getString("Signed in before", "").equals("")) {
			achievementstally++;
			totalXP = totalXP + 5000;
			shareIt.edit().putString("Achievement 22", "1").commit();
		}
		if (fastesttimenum < 3600) {
			achievementstally++;
			totalXP = totalXP + 500;
			shareIt.edit().putString("Achievement 15", "1").commit();
			if (fastesttimenum < 1800) {
				achievementstally++;
				totalXP = totalXP + 500;
				shareIt.edit().putString("Achievement 16", "1").commit();
				if (fastesttimenum < 600) {
					achievementstally++;
					totalXP = totalXP + 500;
					shareIt.edit().putString("Achievement 17", "1").commit();
					if (fastesttimenum < 300) {
						achievementstally++;
						totalXP = totalXP + 1500;
						shareIt.edit().putString("Achievement 18", "1").commit();
						if (fastesttimenum < 120) {
							achievementstally++;
							totalXP = totalXP + 2000;
							shareIt.edit().putString("Achievement 19", "1").commit();
							if (fastesttimenum < 60) {
								achievementstally++;
								totalXP = totalXP + 5000;
								shareIt.edit().putString("Achievement 20", "1").commit();
								if (fastesttimenum < 30) {
									achievementstally++;
									totalXP = totalXP + 10000;
									shareIt.edit().putString("Achievement 21", "1").commit();
								}
							}
						}
					}
				}
			}
		}
		if (achievementstally > 5) {
			achievementstally++;
			totalXP = totalXP + 10000;
			shareIt.edit().putString("Achievement 23", "1").commit();
			if (achievementstally > 15) {
				achievementstally++;
				totalXP = totalXP + 20000;
				shareIt.edit().putString("Achievement 24", "1").commit();
				if (achievementstally == 24) {
					achievementstally++;
					totalXP = totalXP + 20000;
					shareIt.edit().putString("Achievement 25", "1").commit();
				}
			}
		}
		shareIt.edit().putString("XP", String.valueOf((long)(totalXP))).commit();
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	@Override
	public void onStop() {
		super.onStop();
		
	}
	
	@Override
	public void onResume() {
		super.onResume();

	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
	}
	public void _moreBlock() {
		Leaderboard_Data = new HashMap<>();
		Leaderboard_Data.put("Name", shareIt.getString("Username", ""));
		Leaderboard_Data.put("Quantity", shareIt.getString("Statistics", ""));
		Leaderboard_Data.put("Time", shareIt.getString("Time", ""));
		Leaderboard_Data.put("XP", shareIt.getString("XP", ""));
		date = Calendar.getInstance();
		Leaderboard_Data.put("Date", String.valueOf(date.getTimeInMillis()));
	}
	
	
	public void _bottomSheetDialog() {
		//enabled AppCompat
		//create custom view bottom_dialog.xml
		/*
		android.support.design.widget.BottomSheetDialog bottomSheetDialog = new android.support.design.widget.BottomSheetDialog(StatisticsActivity.this);
		View bottomSheetView;
		
		bottomSheetView = getLayoutInflater().inflate(R.layout.bottom_dialog,
		null );
		bottomSheetDialog.setContentView(bottomSheetView);
		
		bottomSheetDialog.show();
		*/
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
