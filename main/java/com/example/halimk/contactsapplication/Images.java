package com.example.halimk.contactsapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by HalimK on 1/1/2017.
 */

public class Images extends Activity {
    private int [] mImages={R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,
            R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,
            R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar,
            R.drawable.default_avatar,R.drawable.default_avatar,R.drawable.default_avatar

    };

    AdapterImages adapterImages;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.images);

        gridView=(GridView)findViewById(R.id.gridview);

        adapterImages=new AdapterImages(mImages,this);

        gridView.setAdapter(adapterImages);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Images.this, position + "", Toast.LENGTH_SHORT).show();

                Intent intent3 = new Intent();
                intent3.putExtra("img",mImages[position]);
                setResult(1,intent3);
                finish();
            }
        });
    }
}
