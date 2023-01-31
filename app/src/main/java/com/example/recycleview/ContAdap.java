package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContAdap extends RecyclerView.Adapter<ContAdap.ViewHolder> {

    private Context context;
    public ContAdap(Context context){
       this.context=context;
    }
    private ArrayList <Contact> con=new ArrayList<>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.concat_list,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
    holder.tv1.setText(con.get(position).getName());
    holder.tv2.setText(con.get(position).getEmail());
    holder.parent.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(context, con.get(position).getName() +" Selected", Toast.LENGTH_SHORT).show();;
        }
    });
        Glide.with(context)
                .asBitmap()
                .load(con.get(position).getIma())
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return con.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1,tv2;
        private CardView parent;
        private ImageView img ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.tv1);
            tv2=itemView.findViewById(R.id.tv2);
            img=itemView.findViewById(R.id.img);
            parent=itemView.findViewById(R.id.parent);
        }
    }

    public void setCon(ArrayList<Contact> con) {
        this.con = con;
        notifyDataSetChanged();
    }
}
