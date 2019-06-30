package com.techhousestudio.locallibrary.ui;

import android.os.Bundle;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import com.techhousestudio.locallibrary.R;

public class LibrarySettingPreference extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.library_setting, rootKey);

        ListPreference fontsize=findPreference("textSize");
        fontsize.setSummaryProvider(ListPreference.SimpleSummaryProvider.getInstance());
        Preference exit=findPreference("exit");
//        exit.setSummaryProvider(ListPreference.SimpleSummaryProvider.getInstance());
        exit.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

            getActivity().finish();
                return true;
            }
        });

    }
}
