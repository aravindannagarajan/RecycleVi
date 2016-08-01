package com.example.messagefile;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Belal on 9/22/2015.
 */

public class CustomList extends ArrayAdapter<String> {
    private String[] CLIENT_ID;
    private String[] API_URL;
    private String[] Title;
    private String[] SelectedSection;
    private String[]IMAGE_FILE_PATH;

    private Activity HIDCs;

    public CustomList(Activity HIDCs, String[] CLIENT_ID, String[] API_URL, String[] Title,String[] SelectedSection,String[] IMAGE_FILE_PATH) {
        super(HIDCs, R.layout.cust, CLIENT_ID);
        this.HIDCs = HIDCs;
        this.CLIENT_ID =CLIENT_ID;
        this.API_URL =API_URL;
        this.Title = Title;
        this.SelectedSection = SelectedSection;
        this.IMAGE_FILE_PATH =IMAGE_FILE_PATH;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = HIDCs.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.cust, null, true);
        TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewEmail = (TextView) listViewItem.findViewById(R.id.textViewEmail);
        TextView textViewGen = (TextView) listViewItem.findViewById(R.id.textViewgen);
        TextView textViewmo = (TextView) listViewItem.findViewById(R.id.textViewm);

        textViewId.setText(CLIENT_ID[position]);
        textViewName.setText(API_URL[position]);
        textViewEmail.setText(Title[position]);
        textViewGen.setText(SelectedSection[position]);
        textViewmo.setText(IMAGE_FILE_PATH[position]);
        return listViewItem;
    }
}