package com.kumalalatif.foodfood;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 09/10/2017.
 */

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MAView> {
    private Context context;
    private List<Makanan> makananList;

    public MakananAdapter(Context context, List<Makanan> makananList) {
        this.context = context;
        this.makananList = makananList;
    }

    @Override
    public MAView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_layout_row_data,parent,false);
        return new MAView(view);
    }

    @Override
    public void onBindViewHolder(MAView holder, int position) {
        final Makanan data=makananList.get(position);
        holder.judul.setText(data.getJudul());
        holder.gambar.setImageResource(data.getGambar());
        holder.deskripsi.setText(data.getDeskripsi());
        holder.cv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DetailActivity.class);
                intent.putExtra("resep.judul",data.getJudul());
                intent.putExtra("resep.gambar",data.getGambar());
                intent.putExtra("resep.pembuatan",data.getPembuatan());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }

    public class MAView extends RecyclerView.ViewHolder {
        public TextView judul,deskripsi;
        public ImageView gambar;
        public CardView cv;

        public MAView(View itemView) {
            super(itemView);
            judul=(TextView)itemView.findViewById(R.id.judul);
            deskripsi=(TextView)itemView.findViewById(R.id.deskripsi);
            gambar=(ImageView) itemView.findViewById(R.id.gambar);
            cv=(CardView)itemView.findViewById(R.id.cv_main);
        }
    }
}
