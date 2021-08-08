package com.project.loginandregistration;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class FloorNumberHolder extends GroupViewHolder {
    private final TextView floorNumber;
    private final View view;

    public FloorNumberHolder(View itemView) {
        super(itemView);

        floorNumber = itemView.findViewById(R.id.mobile_os);
        view   = itemView.findViewById(R.id.view_header);
    }

    @Override
    public void expand() {
        view.setBackgroundResource(R.drawable.bg_item_white_half_bottom);
        floorNumber.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_btn_expand, 0); //down_arrow
        Log.i("Adapter", "expand");
    }

    @Override
    public void collapse() {
        view.setBackgroundResource(R.color.white);
        floorNumber.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_btn_collapse, 0); //up_arrow
        Log.i("Adapter", "collapse");
    }

    public void setGroupName(ExpandableGroup group) {
        floorNumber.setText(group.getTitle());
    }
}
