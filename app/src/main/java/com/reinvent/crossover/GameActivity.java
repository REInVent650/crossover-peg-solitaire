package com.reinvent.crossover;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class GameActivity extends AppCompatActivity {
	
	private final Timer _timer = new Timer();
	private final FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	private final double previousbesttime = 0;
	private final HashMap<String, Object> leaderboard = new HashMap<>();
	private final double DisplayWidthPixels = 0;
	private final double DisplayHeightPixels = 0;
	private final boolean bool = false;
	private final double w_h = 0;
	private final ArrayList<HashMap<String, Object>> leaderboards = new ArrayList<>();
	private final Intent i = new Intent();
	private final DatabaseReference firebasedatabase = _firebase.getReference("crossover/players");
	private String _ad_unit_id;
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private boolean p1stateclicked = false;
	private boolean p2stateclicked = false;
	private boolean p3stateclicked = false;
	private boolean p4stateclicked = false;
	private boolean p5stateclicked = false;
	private boolean p6stateclicked = false;
	private boolean p7stateclicked = false;
	private boolean p8stateclicked = false;
	private boolean p9stateclicked = false;
	private boolean p10stateclicked = false;
	private boolean p11stateclicked = false;
	private boolean p12stateclicked = false;
	private boolean p13stateclicked = false;
	private boolean p14stateclicked = false;
	private boolean p15stateclicked = false;
	private boolean p16stateclicked = false;
	private boolean p17stateclicked = false;
	private boolean p18stateclicked = false;
	private boolean p19stateclicked = false;
	private boolean p20stateclicked = false;
	private boolean p21stateclicked = false;
	private boolean p22stateclicked = false;
	private boolean p23stateclicked = false;
	private boolean p24stateclicked = false;
	private boolean p25stateclicked = false;
	private boolean p26stateclicked = false;
	private boolean p27stateclicked = false;
	private boolean p28stateclicked = false;
	private boolean p29stateclicked = false;
	private boolean p30stateclicked = false;
	private boolean p31stateclicked = false;
	private boolean p32stateclicked = false;
	private boolean p33stateclicked = false;
	private String statisticsstring = "";
	private boolean unlocked = false;
	private double time = 0;
	private String FastestTime = "";
	private double ShorterSideDouble = 0;
	private double statisticsint = 0;
	private double timestatistics = 0;
	private double peg1 = 0;
	private double peg2 = 0;
	private double peg3 = 0;
	private double peg4 = 0;
	private double peg5 = 0;
	private double peg6 = 0;
	private double peg7 = 0;
	private double peg8 = 0;
	private double peg9 = 0;
	private double peg10 = 0;
	private double peg11 = 0;
	private double peg12 = 0;
	private double peg13 = 0;
	private double peg14 = 0;
	private double peg15 = 0;
	private double peg16 = 0;
	private double peg17 = 0;
	private double peg18 = 0;
	private double peg19 = 0;
	private double peg20 = 0;
	private double peg21 = 0;
	private double peg22 = 0;
	private double peg23 = 0;
	private double peg24 = 0;
	private double peg25 = 0;
	private double peg26 = 0;
	private double peg27 = 0;
	private double peg28 = 0;
	private double peg29 = 0;
	private double peg30 = 0;
	private double peg31 = 0;
	private double peg32 = 0;
	private double peg33 = 0;
	private double highlight = 0;
	private double blank = 0;
	private double brown = 0;
	private double black = 0;
	private double tick = 0;
	private double tickPlay = 0;
	private double tock = 0;
	private double tockPlay = 0;
	private double started = 0;
	private double width_height = 0;
	private LinearLayout backgroundlayout;
	private LinearLayout line1;
	private LinearLayout line2;
	private LinearLayout line3;
	private LinearLayout line4;
	private LinearLayout line5;
	private LinearLayout line6;
	private LinearLayout line7;
	private HorizontalScrollView hscroll1;
	private ImageView p1;
	private ImageView p2;
	private ImageView p3;
	private ImageView p4;
	private ImageView textview6;
	private ImageView textview1;
	private ImageView textview2;
	private ImageView p5;
	private ImageView p6;
	private ImageView p7;
	private ImageView p8;
	private ImageView imageview3;
	private ImageView imageview2;
	private ImageView imageview1;
	private ImageView p9;
	private ImageView p10;
	private ImageView p11;
	private ImageView p12;
	private ImageView p13;
	private ImageView imageview4;
	private ImageView imageview6;
	private ImageView p14;
	private ImageView p15;
	private ImageView p16;
	private ImageView p17;
	private ImageView p18;
	private ImageView p19;
	private ImageView p20;
	private ImageView x1;
	private ImageView x2;
	private ImageView p21;
	private ImageView p22;
	private ImageView p23;
	private ImageView p24;
	private ImageView p25;
	private ImageView x3;
	private ImageView x4;
	private ImageView x5;
	private ImageView p26;
	private ImageView p27;
	private ImageView p28;
	private ImageView p29;
	private ImageView x6;
	private ImageView x7;
	private ImageView x8;
	private ImageView p30;
	private ImageView p31;
	private ImageView p32;
	private ImageView p33;
	private LinearLayout line8;
	private Button restart;
	private Button statistics;
	private Button help;
	private Button credits;
	private Button exit;
	private TimerTask timer;
	private AlertDialog.Builder dialog;
	private MediaPlayer MediaPlayer;
	private SharedPreferences Statistics;
	private TimerTask time2;
	private ChildEventListener _firebasedatabase_child_listener;
	private SharedPreferences newusr;
	private SharedPreferences shareIt;
	private SoundPool sfx;
	private SoundPool sfx2;
	private TimerTask restartAnim;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.game);
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
		backgroundlayout = findViewById(R.id.backgroundlayout);
		line1 = findViewById(R.id.line1);
		line2 = findViewById(R.id.line2);
		line3 = findViewById(R.id.line3);
		line4 = findViewById(R.id.line4);
		line5 = findViewById(R.id.line5);
		line6 = findViewById(R.id.line6);
		line7 = findViewById(R.id.line7);
		hscroll1 = findViewById(R.id.hscroll1);
		p1 = findViewById(R.id.p1);
		p2 = findViewById(R.id.p2);
		p3 = findViewById(R.id.p3);
		p4 = findViewById(R.id.p4);
		textview6 = findViewById(R.id.textview6);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		p5 = findViewById(R.id.p5);
		p6 = findViewById(R.id.p6);
		p7 = findViewById(R.id.p7);
		p8 = findViewById(R.id.p8);
		imageview3 = findViewById(R.id.imageview3);
		imageview2 = findViewById(R.id.imageview2);
		imageview1 = findViewById(R.id.imageview1);
		p9 = findViewById(R.id.p9);
		p10 = findViewById(R.id.p10);
		p11 = findViewById(R.id.p11);
		p12 = findViewById(R.id.p12);
		p13 = findViewById(R.id.p13);
		imageview4 = findViewById(R.id.imageview4);
		imageview6 = findViewById(R.id.imageview6);
		p14 = findViewById(R.id.p14);
		p15 = findViewById(R.id.p15);
		p16 = findViewById(R.id.p16);
		p17 = findViewById(R.id.p17);
		p18 = findViewById(R.id.p18);
		p19 = findViewById(R.id.p19);
		p20 = findViewById(R.id.p20);
		x1 = findViewById(R.id.x1);
		x2 = findViewById(R.id.x2);
		p21 = findViewById(R.id.p21);
		p22 = findViewById(R.id.p22);
		p23 = findViewById(R.id.p23);
		p24 = findViewById(R.id.p24);
		p25 = findViewById(R.id.p25);
		x3 = findViewById(R.id.x3);
		x4 = findViewById(R.id.x4);
		x5 = findViewById(R.id.x5);
		p26 = findViewById(R.id.p26);
		p27 = findViewById(R.id.p27);
		p28 = findViewById(R.id.p28);
		p29 = findViewById(R.id.p29);
		x6 = findViewById(R.id.x6);
		x7 = findViewById(R.id.x7);
		x8 = findViewById(R.id.x8);
		p30 = findViewById(R.id.p30);
		p31 = findViewById(R.id.p31);
		p32 = findViewById(R.id.p32);
		p33 = findViewById(R.id.p33);
		line8 = findViewById(R.id.line8);
		restart = findViewById(R.id.restart);
		statistics = findViewById(R.id.statistics);
		help = findViewById(R.id.help);
		credits = findViewById(R.id.credits);
		exit = findViewById(R.id.exit);
		dialog = new AlertDialog.Builder(this);
		Statistics = getSharedPreferences("stats", Activity.MODE_PRIVATE);
		newusr = getSharedPreferences("NewUser", Activity.MODE_PRIVATE);
		shareIt = getSharedPreferences("Data", Activity.MODE_PRIVATE);
		
		p1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p1onClick();
			}
		});
		
		p2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p2onClick();
			}
		});
		
		p3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p3onClick();
			}
		});
		
		p4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p4onClick();
			}
		});
		
		p5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p5onClick();
			}
		});
		
		p6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p6onClick();
			}
		});
		
		p7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p7onClick();
			}
		});
		
		p8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p8onClick();
			}
		});
		
		p9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p9onClick();
			}
		});
		
		p10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p10onClick();
			}
		});
		
		p11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p11onClick();
			}
		});
		
		p12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p12onClick();
			}
		});
		
		p13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p13onClick();
			}
		});
		
		p14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p14onClick();
			}
		});
		
		p15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p15onClick();
			}
		});
		
		p16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p16onClick();
			}
		});
		
		p17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p17onClick();
			}
		});
		
		p18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p18onClick();
			}
		});
		
		p19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p19onClick();
			}
		});
		
		p20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p20onClick();
			}
		});
		
		p21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p21onClick();
			}
		});
		
		p22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p22onClick();
			}
		});
		
		p23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p23onClick();
			}
		});
		
		p24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p24onClick();
			}
		});
		
		p25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p25onClick();
			}
		});
		
		p26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p26onClick();
			}
		});
		
		p27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p27onClick();
			}
		});
		
		p28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p28onClick();
			}
		});
		
		p29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p29onClick();
			}
		});
		
		p30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p30onClick();
			}
		});
		
		p31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p31onClick();
			}
		});
		
		p32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p32onClick();
			}
		});
		
		p33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_p33onClick();
			}
		});
		
		restart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_InitializeAll();
				//textview2.setText("");
				started = 0;
			}
		});
		
		statistics.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), StatisticsActivity.class);
				startActivity(i);
				
			}
		});
		
		help.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), HelpActivity.class);
				startActivity(i);
			}
		});
		
		credits.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CreditsActivity.class);
				startActivity(i);
				
			}
		});
		
		exit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Statistics.edit().putString("Statistics", statisticsstring).commit();
				i.setClass(getApplicationContext(), MainActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				
			}
		});
		
		_firebasedatabase_child_listener = new ChildEventListener() {
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
		firebasedatabase.addChildEventListener(_firebasedatabase_child_listener);
	}
	
	private void initializeLogic() {
		if (shareIt.getString("User", "").equals("")) {
			shareIt.edit().putString("Statistics", "0").commit();
			shareIt.edit().putString("Time", "3600").commit();
			shareIt.edit().putString("User", "not new").commit();
			shareIt.edit().putString("XP", "0").commit();
			shareIt.edit().putString("Username", "Random Crossover Player").commit();
			shareIt.edit().putString("Achievement 1", "0").commit();
			shareIt.edit().putString("Achievement 2", "0").commit();
			shareIt.edit().putString("Achievement 3", "0").commit();
			shareIt.edit().putString("Achievement 4", "0").commit();
			shareIt.edit().putString("Achievement 5", "0").commit();
			shareIt.edit().putString("Achievement 6", "0").commit();
			shareIt.edit().putString("Achievement 7", "0").commit();
			shareIt.edit().putString("Achievement 8", "0").commit();
			shareIt.edit().putString("Achievement 9", "0").commit();
			shareIt.edit().putString("Achievement 10", "0").commit();
			shareIt.edit().putString("Achievement 11", "0").commit();
			shareIt.edit().putString("Achievement 12", "0").commit();
			shareIt.edit().putString("Achievement 13", "0").commit();
			shareIt.edit().putString("Achievement 14", "0").commit();
			shareIt.edit().putString("Achievement 15", "0").commit();
			shareIt.edit().putString("Achievement 16", "0").commit();
			shareIt.edit().putString("Achievement17", "0").commit();
			shareIt.edit().putString("Achievement 18", "0").commit();
			shareIt.edit().putString("Achievement 19", "0").commit();
			shareIt.edit().putString("Achievement 20", "0").commit();
			shareIt.edit().putString("Achievement 21", "0").commit();
			shareIt.edit().putString("Achievement 22", "0").commit();
			shareIt.edit().putString("Achievement 23", "0").commit();
			shareIt.edit().putString("Achievement 24", "0").commit();
			shareIt.edit().putString("Achievement 25", "0").commit();
		}
		statisticsint = Double.parseDouble(shareIt.getString("Statistics", ""));
		timestatistics = Double.parseDouble(shareIt.getString("Time", ""));
		statisticsstring = String.valueOf((long)(statisticsint));
		FastestTime = String.valueOf((long)(timestatistics));
		highlight = 3;
		blank = 2;
		brown = 1;
		black = 4;
		started = 0;
		time2 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_completePegColour(highlight);
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										_completePegColour(blank);
										timer = new TimerTask() {
											@Override
											public void run() {
												runOnUiThread(new Runnable() {
													@Override
													public void run() {
														_completePegColour(black);
														timer = new TimerTask() {
															@Override
															public void run() {
																runOnUiThread(new Runnable() {
																	@Override
																	public void run() {
																		_completePegColour(blank);
																		timer = new TimerTask() {
																			@Override
																			public void run() {
																				runOnUiThread(new Runnable() {
																					@Override
																					public void run() {
																						_completePegColour(brown);
																						timer = new TimerTask() {
																							@Override
																							public void run() {
																								runOnUiThread(new Runnable() {
																									@Override
																									public void run() {
																										_completePegColour(blank);
																										timer = new TimerTask() {
																											@Override
																											public void run() {
																												runOnUiThread(new Runnable() {
																													@Override
																													public void run() {
																														_InitializeAll();
																														SketchwareUtil.showMessage(getApplicationContext(), "Ready!");
																														timer.cancel();
																													}
																												});
																											}
																										};
																										_timer.schedule(timer, (int)(1000));
																									}
																								});
																							}
																						};
																						_timer.schedule(timer, (int)(1000));
																					}
																				});
																			}
																		};
																		_timer.schedule(timer, (int)(1000));
																	}
																});
															}
														};
														_timer.schedule(timer, (int)(1000));
													}
												});
											}
										};
										_timer.schedule(timer, (int)(1000));
									}
								});
							}
						};
						_timer.schedule(timer, (int)(1000));
					}
				});
			}
		};
		_timer.schedule(time2, (int)(0));
		sfx = new SoundPool((int)(2), AudioManager.STREAM_MUSIC, 0);
		tick = sfx.load(getApplicationContext(), R.raw.select, 1);
		tock = sfx.load(getApplicationContext(), R.raw.piecedrop, 1);
		MediaPlayer = android.media.MediaPlayer.create(getApplicationContext(), R.raw.main_theme);
		//MediaPlayer.start();
		//MediaPlayer.setLooping(true);
		width_height = Math.floor(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) / 7);
		//LayoutInflater ytoastinflater = getLayoutInflater();
		
		//View ytoastview = ytoastinflater.inflate(R.layout.toaster, null);
		
		//TextView textview1 = (TextView) ytoastview.findViewById(R.id.textview1);
		
		//textview1.setText("Tap to Start");
		_width_height_(width_height);
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
	public void _InitializeAll() {
		time = 0;
		p1.setImageResource(R.drawable.final_brown_peg);
		peg1 = brown;
		p2.setImageResource(R.drawable.final_brown_peg);
		peg2 = brown;
		p3.setImageResource(R.drawable.final_brown_peg);
		peg3 = brown;
		p4.setImageResource(R.drawable.final_brown_peg);
		peg4 = brown;
		p5.setImageResource(R.drawable.final_brown_peg);
		peg5 = brown;
		p6.setImageResource(R.drawable.final_brown_peg);
		peg6 = brown;
		p7.setImageResource(R.drawable.final_black_peg);
		peg7 = black;
		p8.setImageResource(R.drawable.final_brown_peg);
		peg8 = brown;
		p9.setImageResource(R.drawable.final_brown_peg);
		peg9 = brown;
		p10.setImageResource(R.drawable.final_black_peg);
		peg10 = black;
		p11.setImageResource(R.drawable.final_black_peg);
		peg11 = black;
		p12.setImageResource(R.drawable.final_brown_peg);
		peg12 = brown;
		p13.setImageResource(R.drawable.final_blank_peg);
		peg13 = blank;
		p14.setImageResource(R.drawable.final_brown_peg);
		peg14 = brown;
		p15.setImageResource(R.drawable.final_brown_peg);
		peg15 = brown;
		p16.setImageResource(R.drawable.final_brown_peg);
		peg16 = brown;
		p17.setImageResource(R.drawable.final_brown_peg);
		peg17 = brown;
		p18.setImageResource(R.drawable.final_blank_peg);
		peg18 = blank;
		p19.setImageResource(R.drawable.final_blank_peg);
		peg19 = blank;
		p20.setImageResource(R.drawable.final_blank_peg);
		peg20 = blank;
		p21.setImageResource(R.drawable.final_brown_peg);
		peg21 = brown;
		p22.setImageResource(R.drawable.final_blank_peg);
		peg22 = blank;
		p23.setImageResource(R.drawable.final_blank_peg);
		peg23 = blank;
		p24.setImageResource(R.drawable.final_blank_peg);
		peg24 = blank;
		p25.setImageResource(R.drawable.final_blank_peg);
		peg25 = blank;
		p26.setImageResource(R.drawable.final_blank_peg);
		peg26 = blank;
		p27.setImageResource(R.drawable.final_blank_peg);
		peg27 = blank;
		p28.setImageResource(R.drawable.final_blank_peg);
		peg28 = blank;
		p29.setImageResource(R.drawable.final_blank_peg);
		peg29 = blank;
		p30.setImageResource(R.drawable.final_blank_peg);
		peg30 = blank;
		p31.setImageResource(R.drawable.final_blank_peg);
		peg31 = blank;
		p32.setImageResource(R.drawable.final_blank_peg);
		peg32 = blank;
		p33.setImageResource(R.drawable.final_blank_peg);
		peg33 = blank;
		unlocked = true;
		time2.cancel();
		time2 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (!(started == 0)) {
							time = time + 1;
							//textview2.setText(String.valueOf((long)(time)).concat(" seconds"));
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(time2, (int)(0), (int)(1000));
	}
	
	
	public void _CheckforWin() {
		if (peg33 == brown) {
			if (peg32 == brown) {
				if (peg31 == brown) {
					if (peg30 == brown) {
						if (peg29 == brown) {
							if (peg28 == brown) {
								if (peg27 == black) {
									if (peg26 == brown) {
										if (peg25 == brown) {
											if (peg24 == black) {
												if (peg23 == black) {
													if (peg22 == brown) {
														if (peg20 == brown) {
															if (peg19 == brown) {
																if (peg18 == brown) {
																	if (peg17 == brown) {
																		if ((peg21 == brown) || (peg13 == brown)) {
																			if (peg16 == blank) {
																				if (peg15 == blank) {
																					if (peg14 == blank) {
																						if (peg12 == blank) {
																							if (peg11 == blank) {
																								if (peg10 == blank) {
																									if (peg9 == blank) {
																										if (peg8 == blank) {
																											if (peg7 == blank) {
																												if (peg6 == blank) {
																													if (peg5 == blank) {
																														if (peg4 == blank) {
																															if (peg3 == blank) {
																																if (peg2 == blank) {
																																	if (peg1 == blank) {
																																		unlocked = false;
																																		time2.cancel();
																																		statisticsint++;
																																		shareIt.edit().putString("Statistics", String.valueOf((long)(statisticsint))).commit();
																																		SketchwareUtil.showMessage(getApplicationContext(), "You solved the puzzle correctly!\nTimes solved correctly: ".concat(String.valueOf((long)(statisticsint))));
																																		if (time < timestatistics) {
																																			timestatistics = time;
																																			shareIt.edit().putString("Time", String.valueOf((long)(time))).commit();
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
						}
					}
				}
			}
		}
	}
	
	
	public void _Unhighlight() {
		if (peg1 == highlight) {
			p1.setImageResource(R.drawable.final_blank_peg);
			peg1 = blank;
			p1stateclicked = false;
		}
		if (peg2 == highlight) {
			p2.setImageResource(R.drawable.final_blank_peg);
			peg2 = blank;
		}
		if (peg3 == highlight) {
			p3.setImageResource(R.drawable.final_blank_peg);
			peg3 = blank;
		}
		if (peg4 == highlight) {
			p4.setImageResource(R.drawable.final_blank_peg);
			peg4 = blank;
		}
		if (peg5 == highlight) {
			p5.setImageResource(R.drawable.final_blank_peg);
			peg5 = blank;
		}
		if (peg6 == highlight) {
			p6.setImageResource(R.drawable.final_blank_peg);
			peg6 = blank;
		}
		if (peg7 == highlight) {
			p7.setImageResource(R.drawable.final_blank_peg);
			peg7 = blank;
		}
		if (peg8 == highlight) {
			p8.setImageResource(R.drawable.final_blank_peg);
			peg8 = blank;
		}
		if (peg9 == highlight) {
			p9.setImageResource(R.drawable.final_blank_peg);
			peg9 = blank;
		}
		if (peg10 == highlight) {
			p10.setImageResource(R.drawable.final_blank_peg);
			peg10 = blank;
		}
		if (peg11 == highlight) {
			p11.setImageResource(R.drawable.final_blank_peg);
			peg11 = blank;
		}
		if (peg12 == highlight) {
			p12.setImageResource(R.drawable.final_blank_peg);
			peg12 = blank;
		}
		if (peg13 == highlight) {
			p13.setImageResource(R.drawable.final_blank_peg);
			peg13 = blank;
		}
		if (peg14 == highlight) {
			p14.setImageResource(R.drawable.final_blank_peg);
			peg14 = blank;
		}
		if (peg15 == highlight) {
			p15.setImageResource(R.drawable.final_blank_peg);
			peg15 = blank;
		}
		if (peg16 == highlight) {
			p16.setImageResource(R.drawable.final_blank_peg);
			peg16 = blank;
		}
		if (peg17 == highlight) {
			p17.setImageResource(R.drawable.final_blank_peg);
			peg17 = blank;
		}
		if (peg18 == highlight) {
			p18.setImageResource(R.drawable.final_blank_peg);
			peg18 = blank;
		}
		if (peg19 == highlight) {
			p19.setImageResource(R.drawable.final_blank_peg);
			peg19 = blank;
		}
		if (peg20 == highlight) {
			p20.setImageResource(R.drawable.final_blank_peg);
			peg20 = blank;
		}
		if (peg21 == highlight) {
			p21.setImageResource(R.drawable.final_blank_peg);
			peg21 = blank;
		}
		if (peg22 == highlight) {
			p22.setImageResource(R.drawable.final_blank_peg);
			peg22 = blank;
		}
		if (peg23 == highlight) {
			p23.setImageResource(R.drawable.final_blank_peg);
			peg23 = blank;
		}
		if (peg24 == highlight) {
			p24.setImageResource(R.drawable.final_blank_peg);
			peg24 = blank;
		}
		if (peg25 == highlight) {
			p25.setImageResource(R.drawable.final_blank_peg);
			peg25 = blank;
		}
		if (peg26 == highlight) {
			p26.setImageResource(R.drawable.final_blank_peg);
			peg26 = blank;
		}
		if (peg27 == highlight) {
			p27.setImageResource(R.drawable.final_blank_peg);
			peg27 = blank;
		}
		if (peg28 == highlight) {
			p28.setImageResource(R.drawable.final_blank_peg);
			peg28 = blank;
		}
		if (peg29 == highlight) {
			p29.setImageResource(R.drawable.final_blank_peg);
			peg29 = blank;
		}
		if (peg30 == highlight) {
			p30.setImageResource(R.drawable.final_blank_peg);
			peg30 = blank;
		}
		if (peg31 == highlight) {
			p31.setImageResource(R.drawable.final_blank_peg);
			peg31 = blank;
		}
		if (peg32 == highlight) {
			p32.setImageResource(R.drawable.final_blank_peg);
			peg32 = blank;
		}
		if (peg33 == highlight) {
			p33.setImageResource(R.drawable.final_blank_peg);
			peg33 = blank;
		}
		_CheckforWin();
	}
	
	
	public void _ForceScreenCompatibl() {
		ShorterSideDouble = SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) / 7;
		int ShorterSide = (int) ShorterSideDouble;
		ViewGroup.LayoutParams params = p1.getLayoutParams(); 
		params.width = ShorterSide;
		params.height = ShorterSide;
		p1.setLayoutParams(params);
		
		//line1 set width and height
		ViewGroup.LayoutParams params1 = line1.getLayoutParams(); params.width = ShorterSide;
		params.height = ShorterSide;
		line1.setLayoutParams(params1);
		
		//line2 set width and height
		ViewGroup.LayoutParams params2 = line2.getLayoutParams(); 
		params.width = ShorterSide;
		params.height = ShorterSide;
		line2.setLayoutParams(params2);
		
		//line3 set width and height
		ViewGroup.LayoutParams params3 = line3.getLayoutParams(); 
		params.width = ShorterSide;
		params.height = ShorterSide;
		line3.setLayoutParams(params3);
		
		//line4 set width and height
		ViewGroup.LayoutParams params4 = line4.getLayoutParams(); 
		params.width = ShorterSide;
		params.height = ShorterSide;
		line4.setLayoutParams(params4);
		
		//line5 set width and height
		ViewGroup.LayoutParams params5 = line5.getLayoutParams(); 
		params.width = ShorterSide;
		params.height = ShorterSide;
		line5.setLayoutParams(params5);
		
		//line6 set width and height
		ViewGroup.LayoutParams params6 = line6.getLayoutParams(); 
		params.width = ShorterSide;
		params.height = ShorterSide;
		line6.setLayoutParams(params6);
		
		//line7 set width and height
		ViewGroup.LayoutParams params7 = line7.getLayoutParams(); 
		params.width = ShorterSide;
		params.height = ShorterSide;
		line7.setLayoutParams(params7);
		p2.getLayoutParams().height = ShorterSide;
		p2.getLayoutParams().width = ShorterSide;
		
	}
	
	
	public void _completePegColour(final double _colour) {
		if (_colour == highlight) {
			p1.setImageResource(R.drawable.final_highlight_peg);
			p2.setImageResource(R.drawable.final_highlight_peg);
			p3.setImageResource(R.drawable.final_highlight_peg);
			p4.setImageResource(R.drawable.final_highlight_peg);
			p5.setImageResource(R.drawable.final_highlight_peg);
			p6.setImageResource(R.drawable.final_highlight_peg);
			p7.setImageResource(R.drawable.final_highlight_peg);
			p8.setImageResource(R.drawable.final_highlight_peg);
			p9.setImageResource(R.drawable.final_highlight_peg);
			p10.setImageResource(R.drawable.final_highlight_peg);
			p11.setImageResource(R.drawable.final_highlight_peg);
			p12.setImageResource(R.drawable.final_highlight_peg);
			p13.setImageResource(R.drawable.final_highlight_peg);
			p14.setImageResource(R.drawable.final_highlight_peg);
			p15.setImageResource(R.drawable.final_highlight_peg);
			p16.setImageResource(R.drawable.final_highlight_peg);
			p17.setImageResource(R.drawable.final_highlight_peg);
			p18.setImageResource(R.drawable.final_highlight_peg);
			p19.setImageResource(R.drawable.final_highlight_peg);
			p20.setImageResource(R.drawable.final_highlight_peg);
			p21.setImageResource(R.drawable.final_highlight_peg);
			p22.setImageResource(R.drawable.final_highlight_peg);
			p23.setImageResource(R.drawable.final_highlight_peg);
			p24.setImageResource(R.drawable.final_highlight_peg);
			p25.setImageResource(R.drawable.final_highlight_peg);
			p26.setImageResource(R.drawable.final_highlight_peg);
			p27.setImageResource(R.drawable.final_highlight_peg);
			p28.setImageResource(R.drawable.final_highlight_peg);
			p29.setImageResource(R.drawable.final_highlight_peg);
			p30.setImageResource(R.drawable.final_highlight_peg);
			p31.setImageResource(R.drawable.final_highlight_peg);
			p32.setImageResource(R.drawable.final_highlight_peg);
			p33.setImageResource(R.drawable.final_highlight_peg);
		}
		else {
			
		}
		if (_colour == blank) {
			p1.setImageResource(R.drawable.final_blank_peg);
			p2.setImageResource(R.drawable.final_blank_peg);
			p3.setImageResource(R.drawable.final_blank_peg);
			p4.setImageResource(R.drawable.final_blank_peg);
			p5.setImageResource(R.drawable.final_blank_peg);
			p6.setImageResource(R.drawable.final_blank_peg);
			p7.setImageResource(R.drawable.final_blank_peg);
			p8.setImageResource(R.drawable.final_blank_peg);
			p9.setImageResource(R.drawable.final_blank_peg);
			p10.setImageResource(R.drawable.final_blank_peg);
			p11.setImageResource(R.drawable.final_blank_peg);
			p12.setImageResource(R.drawable.final_blank_peg);
			p13.setImageResource(R.drawable.final_blank_peg);
			p14.setImageResource(R.drawable.final_blank_peg);
			p15.setImageResource(R.drawable.final_blank_peg);
			p16.setImageResource(R.drawable.final_blank_peg);
			p17.setImageResource(R.drawable.final_blank_peg);
			p18.setImageResource(R.drawable.final_blank_peg);
			p19.setImageResource(R.drawable.final_blank_peg);
			p20.setImageResource(R.drawable.final_blank_peg);
			p21.setImageResource(R.drawable.final_blank_peg);
			p22.setImageResource(R.drawable.final_blank_peg);
			p23.setImageResource(R.drawable.final_blank_peg);
			p24.setImageResource(R.drawable.final_blank_peg);
			p25.setImageResource(R.drawable.final_blank_peg);
			p26.setImageResource(R.drawable.final_blank_peg);
			p27.setImageResource(R.drawable.final_blank_peg);
			p28.setImageResource(R.drawable.final_blank_peg);
			p29.setImageResource(R.drawable.final_blank_peg);
			p30.setImageResource(R.drawable.final_blank_peg);
			p31.setImageResource(R.drawable.final_blank_peg);
			p32.setImageResource(R.drawable.final_blank_peg);
			p33.setImageResource(R.drawable.final_blank_peg);
		}
		else {
			
		}
		if (_colour == brown) {
			p1.setImageResource(R.drawable.final_brown_peg);
			p2.setImageResource(R.drawable.final_brown_peg);
			p3.setImageResource(R.drawable.final_brown_peg);
			p4.setImageResource(R.drawable.final_brown_peg);
			p5.setImageResource(R.drawable.final_brown_peg);
			p6.setImageResource(R.drawable.final_brown_peg);
			p7.setImageResource(R.drawable.final_brown_peg);
			p8.setImageResource(R.drawable.final_brown_peg);
			p9.setImageResource(R.drawable.final_brown_peg);
			p10.setImageResource(R.drawable.final_brown_peg);
			p11.setImageResource(R.drawable.final_brown_peg);
			p12.setImageResource(R.drawable.final_brown_peg);
			p13.setImageResource(R.drawable.final_brown_peg);
			p14.setImageResource(R.drawable.final_brown_peg);
			p15.setImageResource(R.drawable.final_brown_peg);
			p16.setImageResource(R.drawable.final_brown_peg);
			p17.setImageResource(R.drawable.final_brown_peg);
			p18.setImageResource(R.drawable.final_brown_peg);
			p19.setImageResource(R.drawable.final_brown_peg);
			p20.setImageResource(R.drawable.final_brown_peg);
			p21.setImageResource(R.drawable.final_brown_peg);
			p22.setImageResource(R.drawable.final_brown_peg);
			p23.setImageResource(R.drawable.final_brown_peg);
			p24.setImageResource(R.drawable.final_brown_peg);
			p25.setImageResource(R.drawable.final_brown_peg);
			p26.setImageResource(R.drawable.final_brown_peg);
			p27.setImageResource(R.drawable.final_brown_peg);
			p28.setImageResource(R.drawable.final_brown_peg);
			p29.setImageResource(R.drawable.final_brown_peg);
			p30.setImageResource(R.drawable.final_brown_peg);
			p31.setImageResource(R.drawable.final_brown_peg);
			p32.setImageResource(R.drawable.final_brown_peg);
			p33.setImageResource(R.drawable.final_brown_peg);
		}
		else {
			
		}
		if (_colour == black) {
			p1.setImageResource(R.drawable.final_black_peg);
			p2.setImageResource(R.drawable.final_black_peg);
			p3.setImageResource(R.drawable.final_black_peg);
			p4.setImageResource(R.drawable.final_black_peg);
			p5.setImageResource(R.drawable.final_black_peg);
			p6.setImageResource(R.drawable.final_black_peg);
			p7.setImageResource(R.drawable.final_black_peg);
			p8.setImageResource(R.drawable.final_black_peg);
			p9.setImageResource(R.drawable.final_black_peg);
			p10.setImageResource(R.drawable.final_black_peg);
			p11.setImageResource(R.drawable.final_black_peg);
			p12.setImageResource(R.drawable.final_black_peg);
			p13.setImageResource(R.drawable.final_black_peg);
			p14.setImageResource(R.drawable.final_black_peg);
			p15.setImageResource(R.drawable.final_black_peg);
			p16.setImageResource(R.drawable.final_black_peg);
			p17.setImageResource(R.drawable.final_black_peg);
			p18.setImageResource(R.drawable.final_black_peg);
			p19.setImageResource(R.drawable.final_black_peg);
			p20.setImageResource(R.drawable.final_black_peg);
			p21.setImageResource(R.drawable.final_black_peg);
			p22.setImageResource(R.drawable.final_black_peg);
			p23.setImageResource(R.drawable.final_black_peg);
			p24.setImageResource(R.drawable.final_black_peg);
			p25.setImageResource(R.drawable.final_black_peg);
			p26.setImageResource(R.drawable.final_black_peg);
			p27.setImageResource(R.drawable.final_black_peg);
			p28.setImageResource(R.drawable.final_black_peg);
			p29.setImageResource(R.drawable.final_black_peg);
			p30.setImageResource(R.drawable.final_black_peg);
			p31.setImageResource(R.drawable.final_black_peg);
			p32.setImageResource(R.drawable.final_black_peg);
			p33.setImageResource(R.drawable.final_black_peg);
		}
	}
	
	
	public void _p1onClick() {
		if (unlocked) {
			if (!(peg1 == blank)) {
				started++;
				if (peg1 == highlight) {
					if (p3stateclicked) {
						if (peg3 == brown) {
							p3stateclicked = false;
							p3.setImageResource(R.drawable.final_blank_peg);
							p1.setImageResource(R.drawable.final_brown_peg);
							peg3 = blank;
							peg1 = brown;
							_Unhighlight();
						}
						else {
							if (peg3 == black) {
								p3stateclicked = false;
								p3.setImageResource(R.drawable.final_blank_peg);
								p1.setImageResource(R.drawable.final_black_peg);
								peg3 = blank;
								peg1 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p9stateclicked) {
							if (peg9 == brown) {
								p9stateclicked = false;
								p9.setImageResource(R.drawable.final_blank_peg);
								p1.setImageResource(R.drawable.final_brown_peg);
								peg9 = blank;
								peg1 = brown;
								_Unhighlight();
							}
							else {
								if (peg9 == black) {
									p9stateclicked = false;
									p9.setImageResource(R.drawable.final_blank_peg);
									p1.setImageResource(R.drawable.final_black_peg);
									peg9 = blank;
									peg1 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p1stateclicked = true;
					if ((peg2 == black) || (peg2 == brown)) {
						if (peg3 == blank) {
							p3.setImageResource(R.drawable.final_highlight_peg);
							peg3 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg5 == black) || (peg5 == brown)) {
						if (peg9 == blank) {
							p9.setImageResource(R.drawable.final_highlight_peg);
							peg9 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p2onClick() {
		if (unlocked) {
			if (!(peg2 == blank)) {
				started++;
				if (peg2 == highlight) {
					if (p4stateclicked) {
						if (peg4 == brown) {
							p4stateclicked = false;
							p4.setImageResource(R.drawable.final_blank_peg);
							p2.setImageResource(R.drawable.final_brown_peg);
							peg4 = blank;
							peg2 = brown;
							_Unhighlight();
						}
						else {
							if (peg4 == black) {
								p4stateclicked = false;
								p4.setImageResource(R.drawable.final_blank_peg);
								p2.setImageResource(R.drawable.final_black_peg);
								peg4 = blank;
								peg2 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p10stateclicked) {
							if (peg10 == brown) {
								p10stateclicked = false;
								p10.setImageResource(R.drawable.final_blank_peg);
								p2.setImageResource(R.drawable.final_brown_peg);
								peg10 = blank;
								peg2 = brown;
								_Unhighlight();
							}
							else {
								if (peg10 == black) {
									p10stateclicked = false;
									p10.setImageResource(R.drawable.final_blank_peg);
									p2.setImageResource(R.drawable.final_black_peg);
									peg10 = blank;
									peg2 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p2stateclicked = true;
					if ((peg3 == black) || (peg3 == brown)) {
						if (peg4 == blank) {
							p4.setImageResource(R.drawable.final_highlight_peg);
							peg4 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg6 == black) || (peg6 == brown)) {
						if (peg10 == blank) {
							p10.setImageResource(R.drawable.final_highlight_peg);
							peg10 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p3onClick() {
		if (unlocked) {
			if (!(peg3 == blank)) {
				started++;
				if (peg3 == highlight) {
					if (p1stateclicked) {
						if (peg1 == brown) {
							p1stateclicked = false;
							p1.setImageResource(R.drawable.final_blank_peg);
							p3.setImageResource(R.drawable.final_brown_peg);
							peg1 = blank;
							peg3 = brown;
							_Unhighlight();
						}
						else {
							if (peg1 == black) {
								p1stateclicked = false;
								p1.setImageResource(R.drawable.final_blank_peg);
								p3.setImageResource(R.drawable.final_black_peg);
								peg1 = blank;
								peg3 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p11stateclicked) {
							if (peg11 == brown) {
								p11stateclicked = false;
								p11.setImageResource(R.drawable.final_blank_peg);
								p3.setImageResource(R.drawable.final_brown_peg);
								peg11 = blank;
								peg3 = brown;
								_Unhighlight();
							}
							else {
								if (peg11 == black) {
									p11stateclicked = false;
									p11.setImageResource(R.drawable.final_blank_peg);
									p3.setImageResource(R.drawable.final_black_peg);
									peg11 = blank;
									peg3 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p3stateclicked = true;
					if ((peg2 == black) || (peg2 == brown)) {
						if (peg1 == blank) {
							p1.setImageResource(R.drawable.final_highlight_peg);
							peg1 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg7 == black) || (peg7 == brown)) {
						if (peg11 == blank) {
							p11.setImageResource(R.drawable.final_highlight_peg);
							peg11 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p4onClick() {
		if (unlocked) {
			if (!(peg4 == blank)) {
				started++;
				if (peg4 == highlight) {
					if (p2stateclicked) {
						if (peg2 == brown) {
							p2stateclicked = false;
							p2.setImageResource(R.drawable.final_blank_peg);
							p4.setImageResource(R.drawable.final_brown_peg);
							peg2 = blank;
							peg4 = brown;
							_Unhighlight();
						}
						else {
							if (peg2 == black) {
								p2stateclicked = false;
								p2.setImageResource(R.drawable.final_blank_peg);
								p4.setImageResource(R.drawable.final_black_peg);
								peg2 = blank;
								peg4 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p12stateclicked) {
							if (peg12 == brown) {
								p12stateclicked = false;
								p12.setImageResource(R.drawable.final_blank_peg);
								p4.setImageResource(R.drawable.final_brown_peg);
								peg12 = blank;
								peg4 = brown;
								_Unhighlight();
							}
							else {
								if (peg12 == black) {
									p12stateclicked = false;
									p12.setImageResource(R.drawable.final_blank_peg);
									p4.setImageResource(R.drawable.final_black_peg);
									peg12 = blank;
									peg4 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p4stateclicked = true;
					if ((peg3 == black) || (peg3 == brown)) {
						if (peg2 == blank) {
							p2.setImageResource(R.drawable.final_highlight_peg);
							peg2 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg8 == black) || (peg8 == brown)) {
						if (peg12 == blank) {
							p12.setImageResource(R.drawable.final_highlight_peg);
							peg12 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p5onClick() {
		if (unlocked) {
			if (!(peg5 == blank)) {
				started++;
				if (peg5 == highlight) {
					if (p7stateclicked) {
						if (peg7 == brown) {
							p7stateclicked = false;
							p7.setImageResource(R.drawable.final_blank_peg);
							p5.setImageResource(R.drawable.final_brown_peg);
							peg7 = blank;
							peg5 = brown;
							_Unhighlight();
						}
						else {
							if (peg7 == black) {
								p7stateclicked = false;
								p7.setImageResource(R.drawable.final_blank_peg);
								p5.setImageResource(R.drawable.final_black_peg);
								peg7 = blank;
								peg5 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p14stateclicked) {
							if (peg14 == brown) {
								p14stateclicked = false;
								p14.setImageResource(R.drawable.final_blank_peg);
								p5.setImageResource(R.drawable.final_brown_peg);
								peg14 = blank;
								peg5 = brown;
								_Unhighlight();
							}
							else {
								if (peg14 == black) {
									p14stateclicked = false;
									p14.setImageResource(R.drawable.final_blank_peg);
									p5.setImageResource(R.drawable.final_black_peg);
									peg14 = blank;
									peg5 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p5stateclicked = true;
					if ((peg6 == black) || (peg6 == brown)) {
						if (peg7 == blank) {
							p7.setImageResource(R.drawable.final_highlight_peg);
							peg7 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg9 == black) || (peg9 == brown)) {
						if (peg14 == blank) {
							p14.setImageResource(R.drawable.final_highlight_peg);
							peg14 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p6onClick() {
		if (unlocked) {
			if (!(peg6 == blank)) {
				started++;
				if (peg6 == highlight) {
					if (p8stateclicked) {
						if (peg8 == brown) {
							p8stateclicked = false;
							p8.setImageResource(R.drawable.final_blank_peg);
							p6.setImageResource(R.drawable.final_brown_peg);
							peg8 = blank;
							peg6 = brown;
							_Unhighlight();
						}
						else {
							if (peg8 == black) {
								p8stateclicked = false;
								p8.setImageResource(R.drawable.final_blank_peg);
								p6.setImageResource(R.drawable.final_black_peg);
								peg8 = blank;
								peg6 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p15stateclicked) {
							if (peg15 == brown) {
								p15stateclicked = false;
								p15.setImageResource(R.drawable.final_blank_peg);
								p6.setImageResource(R.drawable.final_brown_peg);
								peg15 = blank;
								peg6 = brown;
								_Unhighlight();
							}
							else {
								if (peg15 == black) {
									p15stateclicked = false;
									p15.setImageResource(R.drawable.final_blank_peg);
									p6.setImageResource(R.drawable.final_black_peg);
									peg15 = blank;
									peg6 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p6stateclicked = true;
					if ((peg7 == black) || (peg7 == brown)) {
						if (peg8 == blank) {
							p8.setImageResource(R.drawable.final_highlight_peg);
							peg8 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg10 == black) || (peg10 == brown)) {
						if (peg15 == blank) {
							p15.setImageResource(R.drawable.final_highlight_peg);
							peg15 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p7onClick() {
		if (unlocked) {
			if (!(peg7 == blank)) {
				started++;
				if (peg7 == highlight) {
					if (p5stateclicked) {
						if (peg5 == brown) {
							p5stateclicked = false;
							p5.setImageResource(R.drawable.final_blank_peg);
							p7.setImageResource(R.drawable.final_brown_peg);
							peg5 = blank;
							peg7 = brown;
							_Unhighlight();
						}
						else {
							if (peg5 == black) {
								p5stateclicked = false;
								p5.setImageResource(R.drawable.final_blank_peg);
								p7.setImageResource(R.drawable.final_black_peg);
								peg5 = blank;
								peg7 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p16stateclicked) {
							if (peg16 == brown) {
								p16stateclicked = false;
								p16.setImageResource(R.drawable.final_blank_peg);
								p7.setImageResource(R.drawable.final_brown_peg);
								peg16 = blank;
								peg7 = brown;
								_Unhighlight();
							}
							else {
								if (peg16 == black) {
									p16stateclicked = false;
									p16.setImageResource(R.drawable.final_blank_peg);
									p7.setImageResource(R.drawable.final_black_peg);
									peg16 = blank;
									peg7 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p7stateclicked = true;
					if ((peg6 == black) || (peg6 == brown)) {
						if (peg5 == blank) {
							p5.setImageResource(R.drawable.final_highlight_peg);
							peg5 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg11 == black) || (peg11 == brown)) {
						if (peg16 == blank) {
							p16.setImageResource(R.drawable.final_highlight_peg);
							peg16 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p8onClick() {
		if (unlocked) {
			if (!(peg8 == blank)) {
				started++;
				if (peg8 == highlight) {
					if (p6stateclicked) {
						if (peg6 == brown) {
							p6stateclicked = false;
							p6.setImageResource(R.drawable.final_blank_peg);
							p8.setImageResource(R.drawable.final_brown_peg);
							peg6 = blank;
							peg8 = brown;
							_Unhighlight();
						}
						else {
							if (peg6 == black) {
								p6stateclicked = false;
								p6.setImageResource(R.drawable.final_blank_peg);
								p8.setImageResource(R.drawable.final_black_peg);
								peg6 = blank;
								peg8 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p17stateclicked) {
							if (peg17 == brown) {
								p17stateclicked = false;
								p17.setImageResource(R.drawable.final_blank_peg);
								p8.setImageResource(R.drawable.final_brown_peg);
								peg17 = blank;
								peg8 = brown;
								_Unhighlight();
							}
							else {
								if (peg17 == black) {
									p17stateclicked = false;
									p17.setImageResource(R.drawable.final_blank_peg);
									p8.setImageResource(R.drawable.final_black_peg);
									peg17 = blank;
									peg8 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p8stateclicked = true;
					if ((peg7 == black) || (peg7 == brown)) {
						if (peg6 == blank) {
							p6.setImageResource(R.drawable.final_highlight_peg);
							peg6 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg12 == black) || (peg12 == brown)) {
						if (peg17 == blank) {
							p17.setImageResource(R.drawable.final_highlight_peg);
							peg17 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p9onClick() {
		if (unlocked) {
			if (!(peg9 == blank)) {
				started++;
				if (peg9 == highlight) {
					if (p1stateclicked) {
						if (peg1 == brown) {
							p1stateclicked = false;
							p1.setImageResource(R.drawable.final_blank_peg);
							p9.setImageResource(R.drawable.final_brown_peg);
							peg1 = blank;
							peg9 = brown;
							_Unhighlight();
						}
						else {
							if (peg1 == black) {
								p1stateclicked = false;
								p1.setImageResource(R.drawable.final_blank_peg);
								p9.setImageResource(R.drawable.final_black_peg);
								peg1 = blank;
								peg9 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p11stateclicked) {
							if (peg11 == brown) {
								p11stateclicked = false;
								p11.setImageResource(R.drawable.final_blank_peg);
								p9.setImageResource(R.drawable.final_brown_peg);
								peg11 = blank;
								peg9 = brown;
								_Unhighlight();
							}
							else {
								if (peg11 == black) {
									p11stateclicked = false;
									p11.setImageResource(R.drawable.final_blank_peg);
									p9.setImageResource(R.drawable.final_black_peg);
									peg11 = blank;
									peg9 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p9stateclicked = true;
					if ((peg5 == black) || (peg5 == brown)) {
						if (peg1 == blank) {
							p1.setImageResource(R.drawable.final_highlight_peg);
							peg1 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg10 == black) || (peg10 == brown)) {
						if (peg11 == blank) {
							p11.setImageResource(R.drawable.final_highlight_peg);
							peg11 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p10onClick() {
		if (unlocked) {
			if (!(peg10 == blank)) {
				started++;
				if (peg10 == highlight) {
					if (p2stateclicked) {
						if (peg2 == brown) {
							p2stateclicked = false;
							p2.setImageResource(R.drawable.final_blank_peg);
							p10.setImageResource(R.drawable.final_brown_peg);
							peg2 = blank;
							peg10 = brown;
							_Unhighlight();
						}
						else {
							if (peg2 == black) {
								p2stateclicked = false;
								p2.setImageResource(R.drawable.final_blank_peg);
								p10.setImageResource(R.drawable.final_black_peg);
								peg2 = blank;
								peg10 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p12stateclicked) {
							if (peg12 == brown) {
								p12stateclicked = false;
								p12.setImageResource(R.drawable.final_blank_peg);
								p10.setImageResource(R.drawable.final_brown_peg);
								peg12 = blank;
								peg10 = brown;
								_Unhighlight();
							}
							else {
								if (peg12 == black) {
									p12stateclicked = false;
									p12.setImageResource(R.drawable.final_blank_peg);
									p10.setImageResource(R.drawable.final_black_peg);
									peg12 = blank;
									peg10 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p10stateclicked = true;
					if ((peg6 == black) || (peg6 == brown)) {
						if (peg2 == blank) {
							p2.setImageResource(R.drawable.final_highlight_peg);
							peg2 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg11 == black) || (peg11 == brown)) {
						if (peg12 == blank) {
							p12.setImageResource(R.drawable.final_highlight_peg);
							peg12 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p11onClick() {
		if (unlocked) {
			if (!(peg11 == blank)) {
				started++;
				if (peg11 == highlight) {
					if (p3stateclicked) {
						if (peg3 == brown) {
							p3stateclicked = false;
							p3.setImageResource(R.drawable.final_blank_peg);
							p11.setImageResource(R.drawable.final_brown_peg);
							peg3 = blank;
							peg11 = brown;
							_Unhighlight();
						}
						else {
							if (peg3 == black) {
								p3stateclicked = false;
								p3.setImageResource(R.drawable.final_blank_peg);
								p11.setImageResource(R.drawable.final_black_peg);
								peg3 = blank;
								peg11 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p9stateclicked) {
							if (peg9 == brown) {
								p9stateclicked = false;
								p9.setImageResource(R.drawable.final_blank_peg);
								p11.setImageResource(R.drawable.final_brown_peg);
								peg9 = blank;
								peg11 = brown;
								_Unhighlight();
							}
							else {
								if (peg9 == black) {
									p9stateclicked = false;
									p9.setImageResource(R.drawable.final_blank_peg);
									p11.setImageResource(R.drawable.final_black_peg);
									peg9 = blank;
									peg11 = black;
									_Unhighlight();
								}
							}
						}
						else {
							if (p13stateclicked) {
								if (peg13 == brown) {
									p13stateclicked = false;
									p13.setImageResource(R.drawable.final_blank_peg);
									p11.setImageResource(R.drawable.final_brown_peg);
									peg13 = blank;
									peg11 = brown;
									_Unhighlight();
								}
								else {
									if (peg13 == black) {
										p13stateclicked = false;
										p13.setImageResource(R.drawable.final_blank_peg);
										p11.setImageResource(R.drawable.final_black_peg);
										peg13 = blank;
										peg11 = black;
										_Unhighlight();
									}
								}
							}
							else {
								if (p21stateclicked) {
									if (peg21 == brown) {
										p21stateclicked = false;
										p21.setImageResource(R.drawable.final_blank_peg);
										p11.setImageResource(R.drawable.final_brown_peg);
										peg21 = blank;
										peg11 = brown;
										_Unhighlight();
									}
									else {
										if (peg21 == black) {
											p21stateclicked = false;
											p21.setImageResource(R.drawable.final_blank_peg);
											p11.setImageResource(R.drawable.final_black_peg);
											peg21 = blank;
											peg11 = black;
											_Unhighlight();
										}
									}
								}
							}
						}
					}
				}
				else {
					p11stateclicked = true;
					if ((peg7 == black) || (peg7 == brown)) {
						if (peg3 == blank) {
							p3.setImageResource(R.drawable.final_highlight_peg);
							peg3 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg10 == black) || (peg10 == brown)) {
						if (peg9 == blank) {
							p9.setImageResource(R.drawable.final_highlight_peg);
							peg9 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg12 == black) || (peg12 == brown)) {
						if (peg13 == blank) {
							p13.setImageResource(R.drawable.final_highlight_peg);
							peg13 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg16 == black) || (peg16 == brown)) {
						if (peg21 == blank) {
							p21.setImageResource(R.drawable.final_highlight_peg);
							peg21 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p12onClick() {
		if (unlocked) {
			if (!(peg12 == blank)) {
				started++;
				if (peg12 == highlight) {
					if (p4stateclicked) {
						if (peg4 == brown) {
							p4stateclicked = false;
							p4.setImageResource(R.drawable.final_blank_peg);
							p12.setImageResource(R.drawable.final_brown_peg);
							peg4 = blank;
							peg12 = brown;
							_Unhighlight();
						}
						else {
							if (peg4 == black) {
								p4stateclicked = false;
								p4.setImageResource(R.drawable.final_blank_peg);
								p12.setImageResource(R.drawable.final_black_peg);
								peg4 = blank;
								peg12 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p10stateclicked) {
							if (peg10 == brown) {
								p10stateclicked = false;
								p10.setImageResource(R.drawable.final_blank_peg);
								p12.setImageResource(R.drawable.final_brown_peg);
								peg10 = blank;
								peg12 = brown;
								_Unhighlight();
							}
							else {
								if (peg10 == black) {
									p10stateclicked = false;
									p10.setImageResource(R.drawable.final_blank_peg);
									p12.setImageResource(R.drawable.final_black_peg);
									peg10 = blank;
									peg12 = black;
									_Unhighlight();
								}
							}
						}
						else {
							if (p22stateclicked) {
								if (peg22 == brown) {
									p22stateclicked = false;
									p22.setImageResource(R.drawable.final_blank_peg);
									p12.setImageResource(R.drawable.final_brown_peg);
									peg22 = blank;
									peg12 = brown;
									_Unhighlight();
								}
								else {
									if (peg22 == black) {
										p22stateclicked = false;
										p22.setImageResource(R.drawable.final_blank_peg);
										p12.setImageResource(R.drawable.final_black_peg);
										peg22 = blank;
										peg12 = black;
										_Unhighlight();
									}
								}
							}
						}
					}
				}
				else {
					p12stateclicked = true;
					if ((peg8 == black) || (peg8 == brown)) {
						if (peg4 == blank) {
							p4.setImageResource(R.drawable.final_highlight_peg);
							peg4 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg11 == black) || (peg11 == brown)) {
						if (peg10 == blank) {
							p10.setImageResource(R.drawable.final_highlight_peg);
							peg10 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg17 == black) || (peg17 == brown)) {
						if (peg22 == blank) {
							p22.setImageResource(R.drawable.final_highlight_peg);
							peg22 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p13onClick() {
		if (unlocked) {
			if (!(peg13 == blank)) {
				started++;
				if (peg13 == highlight) {
					if (p11stateclicked) {
						if (peg11 == brown) {
							p11stateclicked = false;
							p11.setImageResource(R.drawable.final_blank_peg);
							p13.setImageResource(R.drawable.final_brown_peg);
							peg11 = blank;
							peg13 = brown;
							_Unhighlight();
						}
						else {
							if (peg11 == black) {
								p11stateclicked = false;
								p11.setImageResource(R.drawable.final_blank_peg);
								p13.setImageResource(R.drawable.final_black_peg);
								peg11 = blank;
								peg13 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p23stateclicked) {
							if (peg23 == brown) {
								p23stateclicked = false;
								p23.setImageResource(R.drawable.final_blank_peg);
								p13.setImageResource(R.drawable.final_brown_peg);
								peg23 = blank;
								peg13 = brown;
								_Unhighlight();
							}
							else {
								if (peg23 == black) {
									p23stateclicked = false;
									p23.setImageResource(R.drawable.final_blank_peg);
									p13.setImageResource(R.drawable.final_black_peg);
									peg23 = blank;
									peg13 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p13stateclicked = true;
					if ((peg12 == black) || (peg12 == brown)) {
						if (peg11 == blank) {
							p11.setImageResource(R.drawable.final_highlight_peg);
							peg11 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg18 == black) || (peg18 == brown)) {
						if (peg23 == blank) {
							p23.setImageResource(R.drawable.final_highlight_peg);
							peg23 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p14onClick() {
		if (unlocked) {
			if (!(peg14 == blank)) {
				started++;
				if (peg14 == highlight) {
					if (p5stateclicked) {
						if (peg5 == brown) {
							p5stateclicked = false;
							p5.setImageResource(R.drawable.final_blank_peg);
							p14.setImageResource(R.drawable.final_brown_peg);
							peg5 = blank;
							peg14 = brown;
							_Unhighlight();
						}
						else {
							if (peg5 == black) {
								p5stateclicked = false;
								p5.setImageResource(R.drawable.final_blank_peg);
								p14.setImageResource(R.drawable.final_black_peg);
								peg5 = blank;
								peg14 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p16stateclicked) {
							if (peg16 == brown) {
								p16stateclicked = false;
								p16.setImageResource(R.drawable.final_blank_peg);
								p14.setImageResource(R.drawable.final_brown_peg);
								peg16 = blank;
								peg14 = brown;
								_Unhighlight();
							}
							else {
								if (peg16 == black) {
									p16stateclicked = false;
									p16.setImageResource(R.drawable.final_blank_peg);
									p14.setImageResource(R.drawable.final_black_peg);
									peg16 = blank;
									peg14 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p14stateclicked = true;
					if ((peg9 == black) || (peg9 == brown)) {
						if (peg5 == blank) {
							p5.setImageResource(R.drawable.final_highlight_peg);
							peg5 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg15 == black) || (peg15 == brown)) {
						if (peg16 == blank) {
							p16.setImageResource(R.drawable.final_highlight_peg);
							peg16 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p15onClick() {
		if (unlocked) {
			if (!(peg15 == blank)) {
				started++;
				if (peg15 == highlight) {
					if (p6stateclicked) {
						if (peg6 == brown) {
							p6stateclicked = false;
							p6.setImageResource(R.drawable.final_blank_peg);
							p15.setImageResource(R.drawable.final_brown_peg);
							peg6 = blank;
							peg15 = brown;
							_Unhighlight();
						}
						else {
							if (peg6 == black) {
								p6stateclicked = false;
								p6.setImageResource(R.drawable.final_blank_peg);
								p15.setImageResource(R.drawable.final_black_peg);
								peg6 = blank;
								peg15 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p17stateclicked) {
							if (peg17 == brown) {
								p17stateclicked = false;
								p17.setImageResource(R.drawable.final_blank_peg);
								p15.setImageResource(R.drawable.final_brown_peg);
								peg17 = blank;
								peg15 = brown;
								_Unhighlight();
							}
							else {
								if (peg17 == black) {
									p17stateclicked = false;
									p17.setImageResource(R.drawable.final_blank_peg);
									p15.setImageResource(R.drawable.final_black_peg);
									peg17 = blank;
									peg15 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p15stateclicked = true;
					if ((peg10 == black) || (peg10 == brown)) {
						if (peg6 == blank) {
							p6.setImageResource(R.drawable.final_highlight_peg);
							peg6 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg16 == black) || (peg16 == brown)) {
						if (peg17 == blank) {
							p17.setImageResource(R.drawable.final_highlight_peg);
							peg17 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p16onClick() {
		if (unlocked) {
			if (!(peg16 == blank)) {
				started++;
				if (peg16 == highlight) {
					if (p7stateclicked) {
						if (peg7 == brown) {
							p7stateclicked = false;
							p7.setImageResource(R.drawable.final_blank_peg);
							p16.setImageResource(R.drawable.final_brown_peg);
							peg7 = blank;
							peg16 = brown;
							_Unhighlight();
						}
						else {
							if (peg7 == black) {
								p7stateclicked = false;
								p7.setImageResource(R.drawable.final_blank_peg);
								p16.setImageResource(R.drawable.final_black_peg);
								peg7 = blank;
								peg16 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p14stateclicked) {
							if (peg14 == brown) {
								p14stateclicked = false;
								p14.setImageResource(R.drawable.final_blank_peg);
								p16.setImageResource(R.drawable.final_brown_peg);
								peg14 = blank;
								peg16 = brown;
								_Unhighlight();
							}
							else {
								if (peg14 == black) {
									p14stateclicked = false;
									p14.setImageResource(R.drawable.final_blank_peg);
									p16.setImageResource(R.drawable.final_black_peg);
									peg14 = blank;
									peg16 = black;
									_Unhighlight();
								}
							}
						}
						else {
							if (p18stateclicked) {
								if (peg18 == brown) {
									p18stateclicked = false;
									p18.setImageResource(R.drawable.final_blank_peg);
									p16.setImageResource(R.drawable.final_brown_peg);
									peg18 = blank;
									peg16 = brown;
									_Unhighlight();
								}
								else {
									if (peg18 == black) {
										p18stateclicked = false;
										p18.setImageResource(R.drawable.final_blank_peg);
										p16.setImageResource(R.drawable.final_black_peg);
										peg18 = blank;
										peg16 = black;
										_Unhighlight();
									}
								}
							}
						}
					}
				}
				else {
					p16stateclicked = true;
					if ((peg11 == black) || (peg11 == brown)) {
						if (peg7 == blank) {
							p7.setImageResource(R.drawable.final_highlight_peg);
							peg7 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg15 == black) || (peg15 == brown)) {
						if (peg14 == blank) {
							p14.setImageResource(R.drawable.final_highlight_peg);
							peg14 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg17 == black) || (peg17 == brown)) {
						if (peg18 == blank) {
							p18.setImageResource(R.drawable.final_highlight_peg);
							peg18 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p17onClick() {
		if (unlocked) {
			if (!(peg17 == blank)) {
				started++;
				if (peg17 == highlight) {
					if (p8stateclicked) {
						if (peg8 == brown) {
							p8stateclicked = false;
							p8.setImageResource(R.drawable.final_blank_peg);
							p17.setImageResource(R.drawable.final_brown_peg);
							peg8 = blank;
							peg17 = brown;
							_Unhighlight();
						}
						else {
							if (peg8 == black) {
								p8stateclicked = false;
								p8.setImageResource(R.drawable.final_blank_peg);
								p17.setImageResource(R.drawable.final_black_peg);
								peg8 = blank;
								peg17 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p15stateclicked) {
							if (peg15 == brown) {
								p15stateclicked = false;
								p15.setImageResource(R.drawable.final_blank_peg);
								p17.setImageResource(R.drawable.final_brown_peg);
								peg15 = blank;
								peg17 = brown;
								_Unhighlight();
							}
							else {
								if (peg15 == black) {
									p15stateclicked = false;
									p15.setImageResource(R.drawable.final_blank_peg);
									p17.setImageResource(R.drawable.final_black_peg);
									peg15 = blank;
									peg17 = black;
									_Unhighlight();
								}
							}
						}
						else {
							if (p19stateclicked) {
								if (peg19 == brown) {
									p19stateclicked = false;
									p19.setImageResource(R.drawable.final_blank_peg);
									p17.setImageResource(R.drawable.final_brown_peg);
									peg19 = blank;
									peg17 = brown;
									_Unhighlight();
								}
								else {
									if (peg19 == black) {
										p19stateclicked = false;
										p19.setImageResource(R.drawable.final_blank_peg);
										p17.setImageResource(R.drawable.final_black_peg);
										peg19 = blank;
										peg17 = black;
										_Unhighlight();
									}
								}
							}
							else {
								if (p26stateclicked) {
									if (peg26 == brown) {
										p26stateclicked = false;
										p26.setImageResource(R.drawable.final_blank_peg);
										p17.setImageResource(R.drawable.final_brown_peg);
										peg26 = blank;
										peg17 = brown;
										_Unhighlight();
									}
									else {
										if (peg26 == black) {
											p26stateclicked = false;
											p26.setImageResource(R.drawable.final_blank_peg);
											p17.setImageResource(R.drawable.final_black_peg);
											peg26 = blank;
											peg17 = black;
											_Unhighlight();
										}
									}
								}
							}
						}
					}
				}
				else {
					p17stateclicked = true;
					if ((peg12 == black) || (peg12 == brown)) {
						if (peg8 == blank) {
							p8.setImageResource(R.drawable.final_highlight_peg);
							peg8 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg16 == black) || (peg16 == brown)) {
						if (peg15 == blank) {
							p15.setImageResource(R.drawable.final_highlight_peg);
							peg15 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg18 == black) || (peg18 == brown)) {
						if (peg19 == blank) {
							p19.setImageResource(R.drawable.final_highlight_peg);
							peg19 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg22 == black) || (peg22 == brown)) {
						if (peg26 == blank) {
							p26.setImageResource(R.drawable.final_highlight_peg);
							peg26 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p18onClick() {
		if (unlocked) {
			if (!(peg18 == blank)) {
				started++;
				if (peg18 == highlight) {
					if (p16stateclicked) {
						if (peg16 == brown) {
							p16stateclicked = false;
							p16.setImageResource(R.drawable.final_blank_peg);
							p18.setImageResource(R.drawable.final_brown_peg);
							peg16 = blank;
							peg18 = brown;
							_Unhighlight();
						}
						else {
							if (peg16 == black) {
								p16stateclicked = false;
								p16.setImageResource(R.drawable.final_blank_peg);
								p18.setImageResource(R.drawable.final_black_peg);
								peg16 = blank;
								peg18 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p20stateclicked) {
							if (peg20 == brown) {
								p20stateclicked = false;
								p20.setImageResource(R.drawable.final_blank_peg);
								p18.setImageResource(R.drawable.final_brown_peg);
								peg20 = blank;
								peg18 = brown;
								_Unhighlight();
							}
							else {
								if (peg20 == black) {
									p20stateclicked = false;
									p20.setImageResource(R.drawable.final_blank_peg);
									p18.setImageResource(R.drawable.final_black_peg);
									peg20 = blank;
									peg18 = black;
									_Unhighlight();
								}
							}
						}
						else {
							if (p27stateclicked) {
								if (peg27 == brown) {
									p27stateclicked = false;
									p27.setImageResource(R.drawable.final_blank_peg);
									p18.setImageResource(R.drawable.final_brown_peg);
									peg27 = blank;
									peg18 = brown;
									_Unhighlight();
								}
								else {
									if (peg27 == black) {
										p27stateclicked = false;
										p27.setImageResource(R.drawable.final_blank_peg);
										p18.setImageResource(R.drawable.final_black_peg);
										peg27 = blank;
										peg18 = black;
										_Unhighlight();
									}
								}
							}
						}
					}
				}
				else {
					p18stateclicked = true;
					if ((peg17 == black) || (peg17 == brown)) {
						if (peg16 == blank) {
							p16.setImageResource(R.drawable.final_highlight_peg);
							peg16 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg19 == black) || (peg19 == brown)) {
						if (peg20 == blank) {
							p20.setImageResource(R.drawable.final_highlight_peg);
							peg20 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg23 == black) || (peg23 == brown)) {
						if (peg27 == blank) {
							p27.setImageResource(R.drawable.final_highlight_peg);
							peg27 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p19onClick() {
		if (unlocked) {
			if (!(peg19 == blank)) {
				started++;
				if (peg19 == highlight) {
					if (p17stateclicked) {
						if (peg17 == brown) {
							p17stateclicked = false;
							p17.setImageResource(R.drawable.final_blank_peg);
							p19.setImageResource(R.drawable.final_brown_peg);
							peg17 = blank;
							peg19 = brown;
							_Unhighlight();
						}
						else {
							if (peg17 == black) {
								p17stateclicked = false;
								p17.setImageResource(R.drawable.final_blank_peg);
								p19.setImageResource(R.drawable.final_black_peg);
								peg17 = blank;
								peg19 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p28stateclicked) {
							if (peg28 == brown) {
								p28stateclicked = false;
								p28.setImageResource(R.drawable.final_blank_peg);
								p19.setImageResource(R.drawable.final_brown_peg);
								peg28 = blank;
								peg19 = brown;
								_Unhighlight();
							}
							else {
								if (peg28 == black) {
									p28stateclicked = false;
									p28.setImageResource(R.drawable.final_blank_peg);
									p19.setImageResource(R.drawable.final_black_peg);
									peg28 = blank;
									peg19 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p19stateclicked = true;
					if ((peg18 == black) || (peg18 == brown)) {
						if (peg17 == blank) {
							p17.setImageResource(R.drawable.final_highlight_peg);
							peg17 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg24 == black) || (peg24 == brown)) {
						if (peg28 == blank) {
							p28.setImageResource(R.drawable.final_highlight_peg);
							peg28 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p20onClick() {
		if (unlocked) {
			if (!(peg20 == blank)) {
				started++;
				if (peg20 == highlight) {
					if (p18stateclicked) {
						if (peg18 == brown) {
							p18stateclicked = false;
							p18.setImageResource(R.drawable.final_blank_peg);
							p20.setImageResource(R.drawable.final_brown_peg);
							peg18 = blank;
							peg20 = brown;
							_Unhighlight();
						}
						else {
							if (peg18 == black) {
								p18stateclicked = false;
								p18.setImageResource(R.drawable.final_blank_peg);
								p20.setImageResource(R.drawable.final_black_peg);
								peg18 = blank;
								peg20 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p29stateclicked) {
							if (peg29 == brown) {
								p29stateclicked = false;
								p29.setImageResource(R.drawable.final_blank_peg);
								p20.setImageResource(R.drawable.final_brown_peg);
								peg29 = blank;
								peg20 = brown;
								_Unhighlight();
							}
							else {
								if (peg29 == black) {
									p29stateclicked = false;
									p29.setImageResource(R.drawable.final_blank_peg);
									p20.setImageResource(R.drawable.final_black_peg);
									peg29 = blank;
									peg20 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p20stateclicked = true;
					if ((peg19 == black) || (peg19 == brown)) {
						if (peg18 == blank) {
							p18.setImageResource(R.drawable.final_highlight_peg);
							peg18 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg25 == black) || (peg25 == brown)) {
						if (peg29 == blank) {
							p29.setImageResource(R.drawable.final_highlight_peg);
							peg29 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p21onClick() {
		if (unlocked) {
			if (!(peg21 == blank)) {
				started++;
				if (peg21 == highlight) {
					if (p11stateclicked) {
						if (peg11 == brown) {
							p11stateclicked = false;
							p11.setImageResource(R.drawable.final_blank_peg);
							p21.setImageResource(R.drawable.final_brown_peg);
							peg11 = blank;
							peg21 = brown;
							_Unhighlight();
						}
						else {
							if (peg11 == black) {
								p11stateclicked = false;
								p11.setImageResource(R.drawable.final_blank_peg);
								p21.setImageResource(R.drawable.final_black_peg);
								peg11 = blank;
								peg21 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p23stateclicked) {
							if (peg23 == brown) {
								p23stateclicked = false;
								p23.setImageResource(R.drawable.final_blank_peg);
								p21.setImageResource(R.drawable.final_brown_peg);
								peg23 = blank;
								peg21 = brown;
								_Unhighlight();
							}
							else {
								if (peg23 == black) {
									p23stateclicked = false;
									p23.setImageResource(R.drawable.final_blank_peg);
									p21.setImageResource(R.drawable.final_black_peg);
									peg23 = blank;
									peg21 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p21stateclicked = true;
					if ((peg16 == black) || (peg16 == brown)) {
						if (peg11 == blank) {
							p11.setImageResource(R.drawable.final_highlight_peg);
							peg11 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg22 == black) || (peg22 == brown)) {
						if (peg23 == blank) {
							p23.setImageResource(R.drawable.final_highlight_peg);
							peg23 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p22onClick() {
		if (unlocked) {
			if (!(peg22 == blank)) {
				started++;
				if (peg22 == highlight) {
					if (p12stateclicked) {
						if (peg12 == brown) {
							p12stateclicked = false;
							p12.setImageResource(R.drawable.final_blank_peg);
							p22.setImageResource(R.drawable.final_brown_peg);
							peg12 = blank;
							peg22 = brown;
							_Unhighlight();
						}
						else {
							if (peg12 == black) {
								p12stateclicked = false;
								p12.setImageResource(R.drawable.final_blank_peg);
								p22.setImageResource(R.drawable.final_black_peg);
								peg12 = blank;
								peg22 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p24stateclicked) {
							if (peg24 == brown) {
								p24stateclicked = false;
								p24.setImageResource(R.drawable.final_blank_peg);
								p22.setImageResource(R.drawable.final_brown_peg);
								peg24 = blank;
								peg22 = brown;
								_Unhighlight();
							}
							else {
								if (peg24 == black) {
									p24stateclicked = false;
									p24.setImageResource(R.drawable.final_blank_peg);
									p22.setImageResource(R.drawable.final_black_peg);
									peg24 = blank;
									peg22 = black;
									_Unhighlight();
								}
							}
						}
						else {
							if (p30stateclicked) {
								if (peg30 == brown) {
									p30stateclicked = false;
									p30.setImageResource(R.drawable.final_blank_peg);
									p22.setImageResource(R.drawable.final_brown_peg);
									peg30 = blank;
									peg22 = brown;
									_Unhighlight();
								}
								else {
									if (peg30 == black) {
										p30stateclicked = false;
										p30.setImageResource(R.drawable.final_blank_peg);
										p22.setImageResource(R.drawable.final_black_peg);
										peg30 = blank;
										peg22 = black;
										_Unhighlight();
									}
								}
							}
						}
					}
				}
				else {
					p22stateclicked = true;
					if ((peg17 == black) || (peg17 == brown)) {
						if (peg12 == blank) {
							p12.setImageResource(R.drawable.final_highlight_peg);
							peg12 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg23 == black) || (peg23 == brown)) {
						if (peg24 == blank) {
							p24.setImageResource(R.drawable.final_highlight_peg);
							peg24 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg26 == black) || (peg26 == brown)) {
						if (peg30 == blank) {
							p30.setImageResource(R.drawable.final_highlight_peg);
							peg30 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p23onClick() {
		if (unlocked) {
			if (!(peg23 == blank)) {
				if (peg23 == highlight) {
					if (p13stateclicked) {
						if (peg13 == brown) {
							p13stateclicked = false;
							p13.setImageResource(R.drawable.final_blank_peg);
							p23.setImageResource(R.drawable.final_brown_peg);
							peg13 = blank;
							peg23 = brown;
							_Unhighlight();
						}
						else {
							if (peg13 == black) {
								p13stateclicked = false;
								p13.setImageResource(R.drawable.final_blank_peg);
								p23.setImageResource(R.drawable.final_black_peg);
								peg13 = blank;
								peg23 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p21stateclicked) {
							if (peg21 == brown) {
								p21stateclicked = false;
								p21.setImageResource(R.drawable.final_blank_peg);
								p23.setImageResource(R.drawable.final_brown_peg);
								peg21 = blank;
								peg23 = brown;
								_Unhighlight();
							}
							else {
								if (peg21 == black) {
									p21stateclicked = false;
									p21.setImageResource(R.drawable.final_blank_peg);
									p23.setImageResource(R.drawable.final_black_peg);
									peg21 = blank;
									peg23 = black;
									_Unhighlight();
								}
							}
						}
						else {
							if (p25stateclicked) {
								if (peg25 == brown) {
									p25stateclicked = false;
									p25.setImageResource(R.drawable.final_blank_peg);
									p23.setImageResource(R.drawable.final_brown_peg);
									peg25 = blank;
									peg23 = brown;
									_Unhighlight();
								}
								else {
									if (peg25 == black) {
										p25stateclicked = false;
										p25.setImageResource(R.drawable.final_blank_peg);
										p23.setImageResource(R.drawable.final_black_peg);
										peg25 = blank;
										peg23 = black;
										_Unhighlight();
									}
								}
							}
							else {
								if (p31stateclicked) {
									if (peg31 == brown) {
										p31stateclicked = false;
										p31.setImageResource(R.drawable.final_blank_peg);
										p23.setImageResource(R.drawable.final_brown_peg);
										peg31 = blank;
										peg23 = brown;
										_Unhighlight();
									}
									else {
										if (peg31 == black) {
											p31stateclicked = false;
											p31.setImageResource(R.drawable.final_blank_peg);
											p23.setImageResource(R.drawable.final_black_peg);
											peg31 = blank;
											peg23 = black;
											_Unhighlight();
										}
									}
								}
							}
						}
					}
				}
				else {
					p23stateclicked = true;
					if ((peg18 == black) || (peg18 == brown)) {
						if (peg13 == blank) {
							p13.setImageResource(R.drawable.final_highlight_peg);
							peg13 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg22 == black) || (peg22 == brown)) {
						if (peg21 == blank) {
							p21.setImageResource(R.drawable.final_highlight_peg);
							peg21 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg24 == black) || (peg24 == brown)) {
						if (peg25 == blank) {
							p25.setImageResource(R.drawable.final_highlight_peg);
							peg25 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg27 == black) || (peg27 == brown)) {
						if (peg31 == blank) {
							p31.setImageResource(R.drawable.final_highlight_peg);
							peg31 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p24onClick() {
		if (unlocked) {
			if (!(peg24 == blank)) {
				if (peg24 == highlight) {
					if (p32stateclicked) {
						if (peg32 == brown) {
							p32stateclicked = false;
							p32.setImageResource(R.drawable.final_blank_peg);
							p24.setImageResource(R.drawable.final_brown_peg);
							peg32 = blank;
							peg24 = brown;
							_Unhighlight();
						}
						else {
							if (peg32 == black) {
								p32stateclicked = false;
								p32.setImageResource(R.drawable.final_blank_peg);
								p24.setImageResource(R.drawable.final_black_peg);
								peg32 = blank;
								peg24 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p22stateclicked) {
							if (peg22 == brown) {
								p22stateclicked = false;
								p22.setImageResource(R.drawable.final_blank_peg);
								p24.setImageResource(R.drawable.final_brown_peg);
								peg22 = blank;
								peg24 = brown;
								_Unhighlight();
							}
							else {
								if (peg22 == black) {
									p22stateclicked = false;
									p22.setImageResource(R.drawable.final_blank_peg);
									p24.setImageResource(R.drawable.final_black_peg);
									peg22 = blank;
									peg24 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p24stateclicked = true;
					if ((peg23 == black) || (peg23 == brown)) {
						if (peg22 == blank) {
							p22.setImageResource(R.drawable.final_highlight_peg);
							peg22 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg28 == black) || (peg28 == brown)) {
						if (peg32 == blank) {
							p32.setImageResource(R.drawable.final_highlight_peg);
							peg32 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p25onClick() {
		if (unlocked) {
			if (!(peg25 == blank)) {
				if (peg25 == highlight) {
					if (p23stateclicked) {
						if (peg23 == brown) {
							p23stateclicked = false;
							p23.setImageResource(R.drawable.final_blank_peg);
							p25.setImageResource(R.drawable.final_brown_peg);
							peg23 = blank;
							peg25 = brown;
							_Unhighlight();
						}
						else {
							if (peg23 == black) {
								p23stateclicked = false;
								p23.setImageResource(R.drawable.final_blank_peg);
								p25.setImageResource(R.drawable.final_black_peg);
								peg23 = blank;
								peg25 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p33stateclicked) {
							if (peg33 == brown) {
								p33stateclicked = false;
								p33.setImageResource(R.drawable.final_blank_peg);
								p25.setImageResource(R.drawable.final_brown_peg);
								peg33 = blank;
								peg25 = brown;
								_Unhighlight();
							}
							else {
								if (peg33 == black) {
									p33stateclicked = false;
									p33.setImageResource(R.drawable.final_blank_peg);
									p25.setImageResource(R.drawable.final_black_peg);
									peg33 = blank;
									peg25 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p25stateclicked = true;
					if ((peg24 == black) || (peg24 == brown)) {
						if (peg23 == blank) {
							p23.setImageResource(R.drawable.final_highlight_peg);
							peg23 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg29 == black) || (peg29 == brown)) {
						if (peg33 == blank) {
							p33.setImageResource(R.drawable.final_highlight_peg);
							peg33 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p26onClick() {
		if (unlocked) {
			if (!(peg26 == blank)) {
				if (peg26 == highlight) {
					if (p17stateclicked) {
						if (peg17 == brown) {
							p17stateclicked = false;
							p17.setImageResource(R.drawable.final_blank_peg);
							p26.setImageResource(R.drawable.final_brown_peg);
							peg17 = blank;
							peg26 = brown;
							_Unhighlight();
						}
						else {
							if (peg17 == black) {
								p17stateclicked = false;
								p17.setImageResource(R.drawable.final_blank_peg);
								p26.setImageResource(R.drawable.final_black_peg);
								peg17 = blank;
								peg26 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p28stateclicked) {
							if (peg28 == brown) {
								p28stateclicked = false;
								p28.setImageResource(R.drawable.final_blank_peg);
								p26.setImageResource(R.drawable.final_brown_peg);
								peg28 = blank;
								peg26 = brown;
								_Unhighlight();
							}
							else {
								if (peg28 == black) {
									p28stateclicked = false;
									p28.setImageResource(R.drawable.final_blank_peg);
									p26.setImageResource(R.drawable.final_black_peg);
									peg28 = blank;
									peg26 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p26stateclicked = true;
					if ((peg22 == black) || (peg22 == brown)) {
						if (peg17 == blank) {
							p17.setImageResource(R.drawable.final_highlight_peg);
							peg17 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg27 == black) || (peg27 == brown)) {
						if (peg28 == blank) {
							p28.setImageResource(R.drawable.final_highlight_peg);
							peg28 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p27onClick() {
		if (unlocked) {
			if (!(peg27 == blank)) {
				if (peg27 == highlight) {
					if (p18stateclicked) {
						if (peg18 == brown) {
							p18stateclicked = false;
							p18.setImageResource(R.drawable.final_blank_peg);
							p27.setImageResource(R.drawable.final_brown_peg);
							peg18 = blank;
							peg27 = brown;
							_Unhighlight();
						}
						else {
							if (peg18 == black) {
								p18stateclicked = false;
								p18.setImageResource(R.drawable.final_blank_peg);
								p27.setImageResource(R.drawable.final_black_peg);
								peg18 = blank;
								peg27 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p29stateclicked) {
							if (peg29 == brown) {
								p29stateclicked = false;
								p29.setImageResource(R.drawable.final_blank_peg);
								p27.setImageResource(R.drawable.final_brown_peg);
								peg29 = blank;
								peg27 = brown;
								_Unhighlight();
							}
							else {
								if (peg29 == black) {
									p29stateclicked = false;
									p29.setImageResource(R.drawable.final_blank_peg);
									p27.setImageResource(R.drawable.final_black_peg);
									peg29 = blank;
									peg27 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p27stateclicked = true;
					if ((peg23 == black) || (peg23 == brown)) {
						if (peg18 == blank) {
							p18.setImageResource(R.drawable.final_highlight_peg);
							peg18 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg28 == black) || (peg28 == brown)) {
						if (peg29 == blank) {
							p29.setImageResource(R.drawable.final_highlight_peg);
							peg29 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p28onClick() {
		if (unlocked) {
			if (!(peg28 == blank)) {
				if (peg28 == highlight) {
					if (p19stateclicked) {
						if (peg19 == brown) {
							p19stateclicked = false;
							p19.setImageResource(R.drawable.final_blank_peg);
							p28.setImageResource(R.drawable.final_brown_peg);
							peg19 = blank;
							peg28 = brown;
							_Unhighlight();
						}
						else {
							if (peg19 == black) {
								p19stateclicked = false;
								p19.setImageResource(R.drawable.final_blank_peg);
								p28.setImageResource(R.drawable.final_black_peg);
								peg19 = blank;
								peg28 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p26stateclicked) {
							if (peg26 == brown) {
								p26stateclicked = false;
								p26.setImageResource(R.drawable.final_blank_peg);
								p28.setImageResource(R.drawable.final_brown_peg);
								peg26 = blank;
								peg28 = brown;
								_Unhighlight();
							}
							else {
								if (peg26 == black) {
									p26stateclicked = false;
									p26.setImageResource(R.drawable.final_blank_peg);
									p28.setImageResource(R.drawable.final_black_peg);
									peg26 = blank;
									peg28 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p28stateclicked = true;
					if ((peg24 == black) || (peg24 == brown)) {
						if (peg19 == blank) {
							p19.setImageResource(R.drawable.final_highlight_peg);
							peg19 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg27 == black) || (peg27 == brown)) {
						if (peg26 == blank) {
							p26.setImageResource(R.drawable.final_highlight_peg);
							peg26 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p29onClick() {
		if (unlocked) {
			if (!(peg29 == blank)) {
				if (peg29 == highlight) {
					if (p20stateclicked) {
						if (peg20 == brown) {
							p20stateclicked = false;
							p20.setImageResource(R.drawable.final_blank_peg);
							p29.setImageResource(R.drawable.final_brown_peg);
							peg20 = blank;
							peg29 = brown;
							_Unhighlight();
						}
						else {
							if (peg20 == black) {
								p3stateclicked = false;
								p20.setImageResource(R.drawable.final_blank_peg);
								p29.setImageResource(R.drawable.final_black_peg);
								peg20 = blank;
								peg29 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p27stateclicked) {
							if (peg27 == brown) {
								p27stateclicked = false;
								p27.setImageResource(R.drawable.final_blank_peg);
								p29.setImageResource(R.drawable.final_brown_peg);
								peg27 = blank;
								peg29 = brown;
								_Unhighlight();
							}
							else {
								if (peg27 == black) {
									p27stateclicked = false;
									p27.setImageResource(R.drawable.final_blank_peg);
									p29.setImageResource(R.drawable.final_black_peg);
									peg27 = blank;
									peg29 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p29stateclicked = true;
					if ((peg25 == black) || (peg25 == brown)) {
						if (peg20 == blank) {
							p20.setImageResource(R.drawable.final_highlight_peg);
							peg20 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg28 == black) || (peg28 == brown)) {
						if (peg27 == blank) {
							p27.setImageResource(R.drawable.final_highlight_peg);
							peg27 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p30onClick() {
		if (unlocked) {
			if (!(peg30 == blank)) {
				if (peg30 == highlight) {
					if (p22stateclicked) {
						if (peg22 == brown) {
							p22stateclicked = false;
							p22.setImageResource(R.drawable.final_blank_peg);
							p30.setImageResource(R.drawable.final_brown_peg);
							peg22 = blank;
							peg30 = brown;
							_Unhighlight();
						}
						else {
							if (peg22 == black) {
								p22stateclicked = false;
								p22.setImageResource(R.drawable.final_blank_peg);
								p30.setImageResource(R.drawable.final_black_peg);
								peg22 = blank;
								peg30 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p32stateclicked) {
							if (peg32 == brown) {
								p32stateclicked = false;
								p32.setImageResource(R.drawable.final_blank_peg);
								p30.setImageResource(R.drawable.final_brown_peg);
								peg32 = blank;
								peg30 = brown;
								_Unhighlight();
							}
							else {
								if (peg32 == black) {
									p32stateclicked = false;
									p32.setImageResource(R.drawable.final_blank_peg);
									p30.setImageResource(R.drawable.final_black_peg);
									peg32 = blank;
									peg30 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p30stateclicked = true;
					if ((peg26 == black) || (peg26 == brown)) {
						if (peg22 == blank) {
							p22.setImageResource(R.drawable.final_highlight_peg);
							peg22 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg31 == black) || (peg31 == brown)) {
						if (peg32 == blank) {
							p32.setImageResource(R.drawable.final_highlight_peg);
							peg32 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p31onClick() {
		if (unlocked) {
			if (!(peg31 == blank)) {
				if (peg31 == highlight) {
					if (p23stateclicked) {
						if (peg23 == brown) {
							p23stateclicked = false;
							p23.setImageResource(R.drawable.final_blank_peg);
							p31.setImageResource(R.drawable.final_brown_peg);
							peg23 = blank;
							peg31 = brown;
							_Unhighlight();
						}
						else {
							if (peg23 == black) {
								p23stateclicked = false;
								p23.setImageResource(R.drawable.final_blank_peg);
								p31.setImageResource(R.drawable.final_black_peg);
								peg23 = blank;
								peg31 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p33stateclicked) {
							if (peg33 == brown) {
								p33stateclicked = false;
								p33.setImageResource(R.drawable.final_blank_peg);
								p31.setImageResource(R.drawable.final_brown_peg);
								peg33 = blank;
								peg31 = brown;
								_Unhighlight();
							}
							else {
								if (peg33 == black) {
									p33stateclicked = false;
									p33.setImageResource(R.drawable.final_blank_peg);
									p31.setImageResource(R.drawable.final_black_peg);
									peg33 = blank;
									peg31 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p31stateclicked = true;
					if ((peg27 == black) || (peg27 == brown)) {
						if (peg23 == blank) {
							p23.setImageResource(R.drawable.final_highlight_peg);
							peg23 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg32 == black) || (peg32 == brown)) {
						if (peg33 == blank) {
							p33.setImageResource(R.drawable.final_highlight_peg);
							peg33 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p32onClick() {
		if (unlocked) {
			if (!(peg32 == blank)) {
				if (peg32 == highlight) {
					if (p24stateclicked) {
						if (peg24 == brown) {
							p24stateclicked = false;
							p24.setImageResource(R.drawable.final_blank_peg);
							p32.setImageResource(R.drawable.final_brown_peg);
							peg24 = blank;
							peg32 = brown;
							_Unhighlight();
						}
						else {
							if (peg24 == black) {
								p24stateclicked = false;
								p24.setImageResource(R.drawable.final_blank_peg);
								p32.setImageResource(R.drawable.final_black_peg);
								peg24 = blank;
								peg32 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p30stateclicked) {
							if (peg30 == brown) {
								p30stateclicked = false;
								p30.setImageResource(R.drawable.final_blank_peg);
								p32.setImageResource(R.drawable.final_brown_peg);
								peg30 = blank;
								peg32 = brown;
								_Unhighlight();
							}
							else {
								if (peg30 == black) {
									p30stateclicked = false;
									p30.setImageResource(R.drawable.final_blank_peg);
									p32.setImageResource(R.drawable.final_black_peg);
									peg30 = blank;
									peg32 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p32stateclicked = true;
					if ((peg28 == black) || (peg28 == brown)) {
						if (peg24 == blank) {
							p24.setImageResource(R.drawable.final_highlight_peg);
							peg24 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg31 == black) || (peg31 == brown)) {
						if (peg30 == blank) {
							p30.setImageResource(R.drawable.final_highlight_peg);
							peg30 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _p33onClick() {
		if (unlocked) {
			if (!(peg33 == blank)) {
				if (peg33 == highlight) {
					if (p25stateclicked) {
						if (peg25 == brown) {
							p33stateclicked = false;
							p25.setImageResource(R.drawable.final_blank_peg);
							p33.setImageResource(R.drawable.final_brown_peg);
							peg25 = blank;
							peg33 = brown;
							_Unhighlight();
						}
						else {
							if (peg25 == black) {
								p33stateclicked = false;
								p25.setImageResource(R.drawable.final_blank_peg);
								p33.setImageResource(R.drawable.final_black_peg);
								peg25 = blank;
								peg33 = black;
								_Unhighlight();
							}
						}
					}
					else {
						if (p31stateclicked) {
							if (peg31 == brown) {
								p31stateclicked = false;
								p31.setImageResource(R.drawable.final_blank_peg);
								p33.setImageResource(R.drawable.final_brown_peg);
								peg31 = blank;
								peg33 = brown;
								_Unhighlight();
							}
							else {
								if (peg31 == black) {
									p31stateclicked = false;
									p31.setImageResource(R.drawable.final_blank_peg);
									p33.setImageResource(R.drawable.final_black_peg);
									peg31 = blank;
									peg33 = black;
									_Unhighlight();
								}
							}
						}
					}
				}
				else {
					p33stateclicked = true;
					if ((peg29 == black) || (peg29 == brown)) {
						if (peg25 == blank) {
							p25.setImageResource(R.drawable.final_highlight_peg);
							peg25 = highlight;
							_tickSoundPool();
						}
					}
					if ((peg32 == black) || (peg32 == brown)) {
						if (peg31 == blank) {
							p31.setImageResource(R.drawable.final_highlight_peg);
							peg31 = highlight;
							_tickSoundPool();
						}
					}
				}
			}
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), getString(R.string.locked_board));
		}
	}
	
	
	public void _setImage_highlight(final ImageView _peg) {
		_peg.setImageResource(R.drawable.final_highlight_peg);
	}
	
	
	public void _setImage_blank(final ImageView _peg) {
		_peg.setImageResource(R.drawable.final_blank_peg);
	}
	
	
	public void _setImage_black(final ImageView _peg) {
		_peg.setImageResource(R.drawable.final_black_peg);
	}
	
	
	public void _setImage_brown(final ImageView _peg) {
		_peg.setImageResource(R.drawable.final_brown_peg);
	}
	
	
	public void _tickSoundPool() {
		tickPlay = sfx.play((int)(tick), 1.0f, 1.0f, 1, (int)(0), 1.0f);
	}
	
	
	public void _tockSoundPool() {
		tockPlay = sfx.play((int)(tock), 1.0f, 1.0f, 1, (int)(0), 1.0f);
	}
	
	
	public void _imageControl___(final ImageView _pegBrown, final double _pegNumBrown, final ImageView _pegBlack, final double _pegNumBlack, final ImageView _pegHighlight, final double _pegNumHighlight, final ImageView _pegBlank, final double _pegNumBlank) {

	}
	
	
	public void _width_height_(final double _N) {
		//int nn = Math.floor(SketchwareUtil.getDisplayWidthPixels(getApplicationContext())/7);
		int nn = (int) width_height;
		int wh = (int) SketchwareUtil.getDisplayWidthPixels(getApplicationContext());
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(nn, nn);
		p1.setLayoutParams(layoutParams);
		p2.setLayoutParams(layoutParams);
		p3.setLayoutParams(layoutParams);
		p4.setLayoutParams(layoutParams);
		p5.setLayoutParams(layoutParams);
		p6.setLayoutParams(layoutParams);
		p7.setLayoutParams(layoutParams);
		p8.setLayoutParams(layoutParams);
		p9.setLayoutParams(layoutParams);
		p10.setLayoutParams(layoutParams);
		p11.setLayoutParams(layoutParams);
		p12.setLayoutParams(layoutParams);
		p13.setLayoutParams(layoutParams);
		p14.setLayoutParams(layoutParams);
		p15.setLayoutParams(layoutParams);
		p16.setLayoutParams(layoutParams);
		p17.setLayoutParams(layoutParams);
		p18.setLayoutParams(layoutParams);
		p19.setLayoutParams(layoutParams);
		p20.setLayoutParams(layoutParams);
		p21.setLayoutParams(layoutParams);
		p22.setLayoutParams(layoutParams);
		p23.setLayoutParams(layoutParams);
		p24.setLayoutParams(layoutParams);
		p25.setLayoutParams(layoutParams);
		p26.setLayoutParams(layoutParams);
		p27.setLayoutParams(layoutParams);
		p28.setLayoutParams(layoutParams);
		p29.setLayoutParams(layoutParams);
		p30.setLayoutParams(layoutParams);
		p31.setLayoutParams(layoutParams);
		p32.setLayoutParams(layoutParams);
		p33.setLayoutParams(layoutParams);
		LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(wh, nn);
		line1.setLayoutParams(layoutParams2);
		line2.setLayoutParams(layoutParams2);
		line3.setLayoutParams(layoutParams2);
		line4.setLayoutParams(layoutParams2);
		line5.setLayoutParams(layoutParams2);
		line6.setLayoutParams(layoutParams2);
		line7.setLayoutParams(layoutParams2);
	}
	
	
	public void _restart_anim() {
		
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
