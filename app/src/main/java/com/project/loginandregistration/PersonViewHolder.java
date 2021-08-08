package com.project.loginandregistration;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class PersonViewHolder extends ChildViewHolder {
    private final TextView phoneName;

    public PersonViewHolder(View itemView) {
        super(itemView);

        phoneName = itemView.findViewById(R.id.phone_name);
    }

    public void onBind(PersonNames personNames, ExpandableGroup group) {
        phoneName.setText(personNames.getName());
    }
}