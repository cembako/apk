package com.cembako.cembako;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class SembakoFragment extends Fragment {
    @InjectView(R.id.spinner) Spinner spinner;

    public SembakoFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sembako, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String[] category= { "Beras","Cabai" ,"Jahe"};
        ArrayAdapter adapter = new ArrayAdapter(this.getActivity(),android.R.layout.simple_spinner_item, category);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
