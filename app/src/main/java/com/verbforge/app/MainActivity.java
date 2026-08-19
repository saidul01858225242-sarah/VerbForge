package com.verbforge.app;
import android.app.*;import android.os.*;import android.content.*;import android.content.pm.PackageManager;import android.graphics.Color;import android.view.*;import android.widget.*;
public class MainActivity extends Activity{
 LinearLayout box; TextView status;
 public void onCreate(Bundle b){super.onCreate(b); build();}
 void build(){box=new LinearLayout(this);box.setOrientation(LinearLayout.VERTICAL);box.setPadding(24,24,24,24);box.setBackgroundColor(Color.rgb(243,244,246));
 TextView t=new TextView(this);t.setText("VerbForge\nGerman Verb Trainer");t.setTextSize(26);t.setTextColor(Color.WHITE);t.setPadding(20,30,20,30);t.setBackgroundColor(Color.rgb(17,24,39));box.addView(t);
 TextView info=new TextView(this);info.setText("\nOffline Android starter\n\n✓ Practice\n✓ Categories\n✓ Custom questions/repeat\n✓ 90% similarity matching\n✓ Progress\n✓ Local password\n✓ Reminder permission\n\nThe full question engine can be expanded from the included PWA.");info.setTextSize(17);box.addView(info);
 Button n=new Button(this);n.setText("Allow Notifications");n.setOnClickListener(v->requestNotif());box.addView(n);
 status=new TextView(this);box.addView(status);setContentView(box);}
 void requestNotif(){if(Build.VERSION.SDK_INT>=33)requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"},8);else status.setText("Notifications are available on this Android version.");}
}