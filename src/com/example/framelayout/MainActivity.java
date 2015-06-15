package com.example.framelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;



public class MainActivity extends Activity
{

	 ImageView im1,im2;
		

		@Override
		protected void onCreate(Bundle savedInstanceState) 
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			im1=(ImageView)findViewById(R.id.imageView1);
			im2=(ImageView)findViewById(R.id.imageView2);
			
			im1.setOnClickListener(new OnClickListener()
			{
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					im2.setVisibility(View.VISIBLE);
					v.setVisibility(View.GONE);
				}
			});
			
			im2.setOnClickListener(new OnClickListener() 
			{
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					im2.setVisibility(View.VISIBLE);
					v.setVisibility(View.GONE);
					
				}
			});
			         
			
		}
		@Override
		public boolean onCreateOptionsMenu(Menu menu)
		{
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
}