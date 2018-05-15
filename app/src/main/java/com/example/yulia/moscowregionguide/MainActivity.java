package com.example.yulia.moscowregionguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.viewpager);

        CategoryAdapter categoryAdapter = new CategoryAdapter(getSupportFragmentManager(), this);

        viewPager.setAdapter(categoryAdapter);


        TabLayout tabLayout = findViewById(R.id.sliding_tabs);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setBackgroundResource(R.color.colorAccent);
        tabLayout.setSelectedTabIndicatorColor(getColor(R.color.colorPrimary));



    }
}
