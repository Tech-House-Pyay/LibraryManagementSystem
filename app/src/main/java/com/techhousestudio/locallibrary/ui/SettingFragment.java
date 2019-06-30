package com.techhousestudio.locallibrary.ui;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.PreferenceManager;

import com.techhousestudio.locallibrary.R;

public class SettingFragment extends Fragment implements SharedPreferences.OnSharedPreferenceChangeListener{
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getFragmentManager().beginTransaction().replace(R.id.frag_setting, new LibrarySettingPreference())
                .commit();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(view.getContext());
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);

    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {
        String size=sharedPreferences.getString("textSize", "Not Found");
        int themeID = R.style.FontSizeMedium;
        if (size == "Small") {
            themeID = R.style.FontSizeSmall;
        }
        else if(size == "Medium")
        {
            themeID=R.style.FontSizeMedium;
        }
        else if (size == "Large") {
            themeID = R.style.FontSizeLarge;
        }

        // Set the theme for the activity.
       // setTheme(themeID);

    }

}
