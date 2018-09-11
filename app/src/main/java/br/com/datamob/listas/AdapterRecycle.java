package br.com.datamob.listas;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRecycle extends RecyclerView.Adapter<AdapterRecycle.Holder>
{
    private int resource;
    private List<Model> list;

    public AdapterRecycle(int resource, List<Model> list)
    {
        this.resource = resource;
        this.list = list;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new Holder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, int position)
    {
        Model item = getItem(position);
        holder.ivImagem.setImageResource(item.getImagem());
        holder.tvTitulo.setText(position + " " + item.getTitulo());
        holder.tvDescricao.setText(item.getDescricao());
        holder.view.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                list.remove(holder.getAdapterPosition());
                AdapterRecycle.this.notifyItemRemoved(holder.getAdapterPosition());
            }
        });
        if(position%4 == 0)
            holder.view.setBackgroundResource(R.color.white);
        else if(position%4 == 1)
            holder.view.setBackgroundResource(R.color.grey);
        else if(position%4 == 2)
            holder.view.setBackgroundResource(R.color.aquablue);
        else if(position%4 == 3)
            holder.view.setBackgroundResource(R.color.yellow);
    }

    public class Holder extends RecyclerView.ViewHolder
    {
        private ImageView ivImagem;
        private TextView tvTitulo;
        private TextView tvDescricao;
        private View view;

        public Holder(View itemView)
        {
            super(itemView);
            ivImagem = itemView.findViewById(R.id.ivImagem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescricao = itemView.findViewById(R.id.tvDescricao);
            view = itemView;
        }
    }


    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public Model getItem(int position)
    {
        return list.get(position);
    }
}
