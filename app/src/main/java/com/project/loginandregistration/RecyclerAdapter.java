package com.project.loginandregistration;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class RecyclerAdapter extends ExpandableRecyclerViewAdapter<FloorNumberHolder, PersonViewHolder> {
    private Activity activity;

    public RecyclerAdapter(Activity activity, List<? extends ExpandableGroup> groups) {
        super(groups);
        this.activity = activity;
    }

    @Override
    public FloorNumberHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.group_view_holder, parent, false);

        return new FloorNumberHolder(view);
    }

    @Override
    public PersonViewHolder onCreateChildViewHolder(ViewGroup parent, final int viewType) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.child_view_holder, parent, false);

        return new PersonViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(PersonViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        PersonNames personNames = ((Floor) group).getItems().get(childIndex);
        holder.onBind(personNames,group);
    }

    @Override
    public void onBindGroupViewHolder(FloorNumberHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGroupName(group);
    }
}
