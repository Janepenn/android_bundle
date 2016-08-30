package com.example.android_bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AnotherActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.another);
		TextView tv=(TextView)this.findViewById(R.id.tv05);
		Button bt=(Button)this.findViewById(R.id.bt02);
		Bundle bundle=this.getIntent().getExtras();
		String xm=bundle.getString("xm");
		String ah=bundle.getString("ah");
		String tc=bundle.getString("tc");
		StringBuilder sb=new StringBuilder();
		sb.append("����д������Ϊ��"+xm+"\n");
		sb.append("����д�İ���Ϊ��"+ah+"\n");
		sb.append("����д���س�Ϊ:"+tc+"\n");
		tv.setText(sb.toString().trim());
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Intent intent=new Intent(AnotherActivity.this,MainActivity.class);
				startActivity(intent);
				AnotherActivity.this.finish();
			}
		});
	}
	

}
