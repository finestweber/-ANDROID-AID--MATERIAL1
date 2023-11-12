package com.finestweber.material1;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.SearchView.*;
import android.view.View.*;
import android.view.*;
import java.util.zip.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Button btn;
	    btn = findViewById(R.id.botaoEntrar);
		btn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent in = new Intent(getApplicationContext(),home.class);
					startActivity(in);
				}
			});
    }
}
