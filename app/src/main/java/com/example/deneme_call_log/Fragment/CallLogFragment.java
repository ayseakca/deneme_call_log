package com.example.deneme_call_log.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.deneme_call_log.Adepter.CallLogAdapter;
import com.example.deneme_call_log.Model.Calls;
import com.example.deneme_call_log.R;

import java.util.List;

public class CallLogFragment extends Fragment {
    View generalView;
    TextView txtPhoneNumber,txtCallType,txtCallDate,txtCallDuration, txtCallLocation;
    RecyclerView rvCallList;
   // RelativeLayout relAddMedicine;//biz ekleme olayını içerden okuyup yapacağız
    private Calls calls;
    private List<Calls> callsList;
    private CallLogAdapter callLogAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        generalView = rootView;
        txtPhoneNumber = generalView.findViewById(R.id.txtPhoneNumber);
        txtCallType = generalView.findViewById(R.id.txtCallType);
        txtCallDate = generalView.findViewById(R.id.txtCallDate);
        txtCallDuration = generalView.findViewById(R.id.txtCallDuration);
        txtCallLocation = generalView.findViewById(R.id.txtCallLocation);
        rvCallList= generalView.findViewById(R.id.rvCallList);
        /*relAddMedicine = generalView.findViewById(R.id.relAddMedicine);


        relAddMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMedicine();
            }
        });*/

        container.removeAllViews();
        return rootView;
    }
}

