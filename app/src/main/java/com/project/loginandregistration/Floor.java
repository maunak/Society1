package com.project.loginandregistration;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Floor extends ExpandableGroup<PersonNames> {

    public Floor(String title, List<PersonNames> items) {
        super(title, items);
    }
}
