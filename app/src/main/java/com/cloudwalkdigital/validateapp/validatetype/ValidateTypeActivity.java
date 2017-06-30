package com.cloudwalkdigital.validateapp.validatetype;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.Toast;

import com.cloudwalkdigital.validateapp.R;
import com.cloudwalkdigital.validateapp.users.UserSelectionActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ValidateTypeActivity extends AppCompatActivity {

    @BindView(R.id.pre_event_image) ImageView ivPreEvent;
    @BindView(R.id.event_proper_image) ImageView ivEventProper;
    @BindView(R.id.post_event_image) ImageView ivPostEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_type);

        ButterKnife.bind(this);
        // setLocked(ivPostEvent); //sample of grayscale
    }

    // transform image to grayscale
    public static void setLocked(ImageView v)
    {
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);  //0 means grayscale
        ColorMatrixColorFilter cf = new ColorMatrixColorFilter(matrix);
        v.setColorFilter(cf);
        v.setImageAlpha(128);
    }

    // reset grayscale to colored
    public static void setUnlocked(ImageView v)
    {
        v.setColorFilter(null);
        v.setImageAlpha(255);
    }

    @OnClick(R.id.pre_event)
    public void preEvent(CardView cardView) {

        Intent intent = new Intent(ValidateTypeActivity.this, UserSelectionActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.event_proper)
    public void eventProper(CardView cardView) {

        Intent intent = new Intent(ValidateTypeActivity.this, UserSelectionActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.post_event)
    public void postEvent(CardView cardView) {

        Context context = getApplicationContext();
        Toast.makeText( context, "No active projects in post event", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(ValidateTypeActivity.this, UserSelectionActivity.class);
//        startActivity(intent);
    }
}
