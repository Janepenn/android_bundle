package com.example.android_bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText xmet=(EditText)this.findViewById(R.id.et01);
		final EditText ahet=(EditText)this.findViewById(R.id.et02);
		final EditText tcet=(EditText)this.findViewById(R.id.et03);
		Button bt=(Button)this.findViewById(R.id.bt01);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				String xm=xmet.getText().toString().trim();
				String ah=ahet.getText().toString().trim();
				String tc=tcet.getText().toString().trim();
				Intent intent=new Intent();
				intent.setClass(MainActivity.this, AnotherActivity.class);
				Bundle bundle=new Bundle();
				bundle.putString("xm", xm);
				bundle.putString("ah", ah);
				bundle.putString("tc", tc);
				intent.putExtras(bundle);
				startActivity(intent);
				MainActivity.this.finish();
			}
		});
	}

	
}
