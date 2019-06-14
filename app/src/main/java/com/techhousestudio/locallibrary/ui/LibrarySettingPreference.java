package com.techhousestudio.locallibrary.ui;

import android.os.Bundle;

import androidx.preference.ListPreference;
import androidx.preference.PreferenceFragmentCompat;

import com.techhousestudio.locallibrary.R;

public class LibrarySettingPreference extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.library_setting, rootKey);
        ListPreference fontsize=findPreference("textSize");
        fontsize.setSummaryProvider(ListPreference.SimpleSummaryProvider.getInstance());

    }
}
