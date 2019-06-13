package com.techhousestudio.locallibrary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.techhousestudio.locallibrary.adapters.ViewPagerAdapter;
import com.techhousestudio.locallibrary.ui.BooksFragment;
import com.techhousestudio.locallibrary.ui.CategoryFragment;
import com.techhousestudio.locallibrary.ui.SettingFragment;


public class MainActivity extends AppCompatActivity {
    // widget
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        setupViewPager(mainViewPager);
        tabLayout.setupWithViewPager(mainViewPager);
        setupTabIcons();

    }

    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("BOOKS");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_action_book, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("CATEGORY");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_action_group, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("SETTING");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_action_setting, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new BooksFragment(), "BOOKS");
        adapter.addFrag(new CategoryFragment(), "CATEGORY");
        adapter.addFrag(new SettingFragment(), "SETTING");
        viewPager.setAdapter(adapter);
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_action_book);
        tabLayout = findViewById(R.id.tabs);
        mainViewPager = findViewById(R.id.mainViewPager);
    }
}
