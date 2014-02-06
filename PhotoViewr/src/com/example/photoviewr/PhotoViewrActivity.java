package com.example.photoviewr;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class PhotoViewrActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//「findViewById」メソッドを使用してImageViewを取り出す
		ImageView imageView = (ImageView)findViewById(R.id.imageView1);
		//リソースからビットマップを取り出す
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.donut_2009);
		//作成したBitmapをImageViewに設定
		imageView.setImageBitmap(bitmap);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.photo_viewr, menu);
		return true;
	}

}
