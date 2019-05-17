package com.example.deneme_call_log.Adepter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.deneme_call_log.R;


public class CallLogAdapter extends RecyclerView.Adapter<CallLogAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView txtPhoneNumber,txtCallType,txtCallDate,txtCallDuration, txtCallLocation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPhoneNumber = itemView.findViewById(R.id.txtPhoneNumber);
            txtCallType = itemView.findViewById(R.id.txtCallType);
            txtCallDate = itemView.findViewById(R.id.txtCallDate);
            txtCallDuration = itemView.findViewById(R.id.txtCallDuration);
            txtCallLocation = itemView.findViewById(R.id.txtCallLocation);

            itemView.setTag(itemView);
            itemView.setOnClickListener(this);

        }



        @Override
        public void onClick(View v) {

        }


    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_medicine, viewGroup, false);
//        ViewHolder myViewHolder = new ViewHolder(view);
        //buraya şu çektiklerinizi çek

     //   return myViewHolder;
        return null;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
