package com.ensah.androidprojet.NousPartageons;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ensah.androidprojet.NousPartageons.Fragment.ChatsFragment;
import com.ensah.androidprojet.NousPartageons.Fragment.AmisFragment;
import com.ensah.androidprojet.NousPartageons.Fragment.RequestsFragment;


class SectionsPagerAdapter extends FragmentPagerAdapter{


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

            case 1:
                ChatsFragment chatsFragment = new ChatsFragment();
                return  chatsFragment;

            case 2:
                AmisFragment amisFragment = new AmisFragment();
                return amisFragment;

            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){

        switch (position) {
            case 0:
                return "INVITATIONS";

            case 1:
                return "MESSAGES";

            case 2:
                return "AMIS";

            default:
                return null;
        }

    }

}
