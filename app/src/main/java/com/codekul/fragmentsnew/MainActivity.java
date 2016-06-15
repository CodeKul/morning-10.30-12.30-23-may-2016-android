package com.codekul.fragmentsnew;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*runFragmentTransaction(R.id.frameThirdFragments,
                AnimationFragment.getInstance("MeLayer"));*/

    }

    public final void runFragmentTransaction(int container,
                                              Fragment fragment){
        FragmentManager manager =
                getSupportFragmentManager();

        FragmentTransaction txn =
                manager.beginTransaction();

        txn.replace(container, fragment);
        txn.commit();
    }
}
