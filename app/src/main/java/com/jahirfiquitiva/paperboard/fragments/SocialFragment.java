package com.jahirfiquitiva.paperboard.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.studiosrevtech.alium.R;

/**
 * Created by Hector on 9/8/2015.
 */
public class SocialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.social_fragment, container, false);

        ActionBar toolbar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (toolbar != null) {
            toolbar.setTitle(R.string.section_seven);
        }


        TextView designerdesc = (TextView) root.findViewById(R.id.dev_card_content);
        designerdesc.setText(Html.fromHtml(getString(R.string.iconpack_designer_desc)));


        return root;

    }

}
