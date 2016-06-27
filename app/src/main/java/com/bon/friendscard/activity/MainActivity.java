package com.bon.friendscard.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bon.friendscard.R;

/**
 * メイン画面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton addFriendsButton = (FloatingActionButton) findViewById(R.id.add_friends_button);
        if (addFriendsButton != null) {
            addFriendsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // 友だち追加画面
                    startActivity(FriendAddActivity.createIntent(MainActivity.this));
                }
            });
        }

        setFriendList();
    }

    private void setFriendList() {

    }
}
