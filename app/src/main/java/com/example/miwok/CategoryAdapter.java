package com.example.miwok;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "NUMBERS", "COLORS", "FAMILY MEMBERS","PHRASES" };
    private Context context;
    public CategoryAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                NumbersFragment number = new NumbersFragment();
                return number;
            case 1:
                ColorsFragment color = new ColorsFragment();
                return color;
            case 2:
                FamilyMembersFragment contact = new FamilyMembersFragment();
                return contact;
            case 3:
                PhrasesFragment phrases =new PhrasesFragment();
                return phrases;
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
