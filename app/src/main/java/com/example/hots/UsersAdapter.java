package com.example.hots;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import jp.wasabeef.picasso.transformations.BlurTransformation;
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;

public class UsersAdapter extends ArrayAdapter<Persos> {

    public UsersAdapter(Context context, ArrayList<Persos> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Persos perso = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvRole);
        ImageView itemBg = (ImageView) convertView.findViewById(R.id.itemBg);
        ImageView role = (ImageView) convertView.findViewById(R.id.role);
        ImageView univers = (ImageView) convertView.findViewById(R.id.univers);
        TextView charUnivers = (TextView) convertView.findViewById(R.id.charUnivers);
        // Populate the data into the template view using the data object
        tvName.setText(perso.getNom());
        Picasso.get().load(perso.getRole0()).into(role);
        Picasso.get().load(perso.getUnivers0()).into(univers);
        tvHome.setText(perso.getRole());
        Picasso.get().load(perso.getNom0()).fit().centerCrop().transform(new BlurTransformation(getContext(),25,1)).into(itemBg);
        charUnivers.setText(perso.getUnivers());
        // Return the completed view to render on screen
        return convertView;
    }
}
