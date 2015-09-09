package com.jahirfiquitiva.paperboard.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.studiosrevtech.alium.R;

/**
 * Created by Hector on 9/8/2015.
 */
public class SocialFragment extends Fragment {


    private static final String GOOGLE_PLUS = "https://plus.google.com/113380931547615323871/posts",
                                FACEBOOK="https://www.facebook.com/studiosrevtech?ref=hl",
                                GOOGLE_COMMUNITY="https://plus.google.com/communities/100467679515919042381";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.social_fragment, container, false);

        ActionBar toolbar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (toolbar != null) {
            toolbar.setTitle(R.string.section_seven);
        }


        TextView designerdesc = (TextView) root.findViewById(R.id.dev_card_content);
        designerdesc.setText(Html.fromHtml(getString(R.string.iconpack_designer_desc)));


        LinearLayout googlePlus =((LinearLayout) root.findViewById(R.id.google_plus));
        googlePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse(GOOGLE_PLUS));
                startActivity(gplus);
            }
        });


        LinearLayout facebook = ((LinearLayout) root.findViewById(R.id.facebook));
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookk = new Intent(Intent.ACTION_VIEW, Uri.parse(FACEBOOK));
                startActivity(facebookk);
            }
        });

        LinearLayout community = ((LinearLayout) root.findViewById(R.id.google_community));
        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gcommunity = new Intent(Intent.ACTION_VIEW, Uri.parse(GOOGLE_COMMUNITY));
                startActivity(gcommunity);
            }
        });


        LinearLayout gmail= ((LinearLayout) root.findViewById(R.id.gemail));
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + getResources().getString(R.string.email_id)));
                intent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.email_subject));
                startActivity(Intent.createChooser(intent, (getResources().getString(R.string.send_title))));
            }
        });




        return root;

    }

}
