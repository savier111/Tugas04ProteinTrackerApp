package com.example.proteintrackerappp;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.MenuItem;

public class SettingActivity extends PreferenceFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_setting_protein_tracker); 
        setHasOptionMenu(true);
    }

    private void setHasOptionMenu(boolean b) {
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            startActivity(new Intent(getActivity(),
                    SettingActivity.class));
            return true;
        }
    return super.onOptionsItemSelected(item);
    }
}
