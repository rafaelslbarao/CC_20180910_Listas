package br.com.datamob.listas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterListaGrid extends ArrayAdapter<Model>
{
    private int resource;
    private List<Model> list;

    public AdapterListaGrid(@NonNull Context context, int resource, List<Model> list)
    {
        super(context, resource, list);
        this.resource = resource;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if (convertView == null)
            convertView = criaView(parent);
        //
        Holder holder = (Holder) convertView.getTag();
        //
        Model item = getItem(position);
        holder.ivImagem.setImageResource(item.getImagem());
        holder.tvTitulo.setText(position + " " + item.getTitulo());
        holder.tvDescricao.setText(item.getDescricao());
        //
        if(position%4 == 0)
            holder.view.setBackgroundResource(R.color.white);
        else if(position%4 == 1)
            holder.view.setBackgroundResource(R.color.grey);
        else if(position%4 == 2)
            holder.view.setBackgroundResource(R.color.aquablue);
        else if(position%4 == 3)
            holder.view.setBackgroundResource(R.color.yellow);
        //
        return convertView;
    }

    private View criaView(ViewGroup parent)
    {
        View convertView = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        Holder holder = new Holder();
        holder.ivImagem = convertView.findViewById(R.id.ivImagem);
        holder.tvTitulo = convertView.findViewById(R.id.tvTitulo);
        holder.tvDescricao = convertView.findViewById(R.id.tvDescricao);
        holder.view = convertView;
        convertView.setTag(holder);
        return convertView;
    }

    public class Holder
    {
        private ImageView ivImagem;
        private TextView tvTitulo;
        private TextView tvDescricao;
        private View view;
    }

    @Override
    public int getCount()
    {
        return list.size();
    }

    @Nullable
    @Override
    public Model getItem(int position)
    {
        return list.get(position);
    }
}
