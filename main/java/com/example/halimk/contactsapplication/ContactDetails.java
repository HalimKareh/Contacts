package com.example.halimk.contactsapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HalimK on 1/1/2017.
 */

public class ContactDetails extends Activity{

    Contact ContactDetails;
    private String mContactName, mContactNumber, mContactEmail;
    private int mContactImage;
    TextView details_name, details_number, details_email;
    ImageView details_image;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_details);

        details_image = (ImageView) findViewById(R.id.details_image);

        backButton = (Button) findViewById(R.id.backButton);

        details_name = (TextView) findViewById(R.id.details_name);
        details_email = (TextView) findViewById(R.id.details_email);
        details_number = (TextView) findViewById(R.id.details_number);

        Intent intent9 = new Intent();
        intent9 = getIntent();
        ContactDetails = (Contact) intent9.getSerializableExtra("details");

        mContactImage = ContactDetails.getImgId();
        mContactNumber = ContactDetails.getNumber();
        mContactName = ContactDetails.getName();
        mContactEmail = ContactDetails.getEmail();


        details_name.setText(mContactName);


        details_number.setText(mContactNumber);
        details_email.setText(mContactEmail);
        details_image.setImageResource(mContactImage);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

