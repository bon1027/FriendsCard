package com.bon.friendscard.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bon.friendscard.R;

/**
 * メイン画面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFriendList();
    }

    private void setFriendList() {

    }
}
