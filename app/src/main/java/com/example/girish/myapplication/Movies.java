package com.example.girish.myapplication;

/**
 * Created by Girish on 26-01-2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.TextView;

public class Movies extends Fragment {
    Activity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        activity = this.getActivity();
        View mov = inflater.inflate(R.layout.movie_frag, container, false);
        ((TextView)mov.findViewById(R.id.textView)).setText("Movies List");
        return mov;
    }
    public void button (View view) {
        ImageButton button = (ImageButton) activity.findViewById(R.id.button);
        //Toast.makeText(getApplicationContext(), "Button selected", Toast.LENGTH_LONG).show();
    }
}
