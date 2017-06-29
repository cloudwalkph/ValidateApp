package com.cloudwalkdigital.validateapp.validatetype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

import com.cloudwalkdigital.validateapp.R;
import com.cloudwalkdigital.validateapp.users.UserSelectionActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ValidateTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_type);

        ButterKnife.bind(this);
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
        Intent intent = new Intent(ValidateTypeActivity.this, UserSelectionActivity.class);
        startActivity(intent);
    }
}
