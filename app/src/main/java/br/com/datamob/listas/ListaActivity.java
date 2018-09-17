package br.com.datamob.listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity
{
    private RadioGroup rgOpcao;
    private ListView lvInformacoes;
    private GridView gvInformacoes;
    private ArrayList<Model> list;
    private Button btRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        //
        inicializaComponentes();
    }

    private void inicializaComponentes()
    {
        rgOpcao = findViewById(R.id.rgOpcao);
        lvInformacoes = findViewById(R.id.lvInformacoes);
        gvInformacoes = findViewById(R.id.gvInformacoes);
        btRecycleView = findViewById(R.id.btRecycleView);
        btRecycleView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ListaActivity.this, RecycleActivity.class));
            }
        });
        //
        rgOpcao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                criaLista();
                if(checkedId == R.id.rbGrid)
                {
                    lvInformacoes.setVisibility(View.GONE);
                    gvInformacoes.setAdapter(new AdapterListaGrid(ListaActivity.this,
                            R.layout.item_grid, list));
                    gvInformacoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    gvInformacoes.setVisibility(View.GONE);
                    lvInformacoes.setAdapter(new AdapterListaGrid(ListaActivity.this,
                            R.layout.item_lista, list));
                    lvInformacoes.setVisibility(View.VISIBLE);
                }
            }
        });
        lvInformacoes.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                list.remove(position);
                ((ArrayAdapter)lvInformacoes.getAdapter()).notifyDataSetChanged();
            }
        });
        gvInformacoes.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                list.remove(position);
                ((ArrayAdapter)gvInformacoes.getAdapter()).notifyDataSetChanged();
            }
        });
    }

    private void criaLista()
    {
        list = new ArrayList<>();
        for(int i =0; i < 2; i++)
        {
            list.add(new Model(R.drawable.ic_brightness_7_black, "Título 1", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Título Legal", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Meu Título", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_child_care_black, "Testando", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_brightness_7_black, "Meu Teste Legal", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Título 2", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_brightness_7_black, "Título 3", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título 4", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Título do Meu Título", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_child_care_black, "Título 1", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Título Título", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Barão de Maua", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_brightness_7_black, "Título Título Título", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título Título do Titudo", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Meu Teste de Título", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_brightness_7_black, "Teste do Título 1", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_child_care_black, "Título 1", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_brightness_7_black, "Título 3", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título 4", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Título do Meu Título", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_child_care_black, "Título 1", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Título Título", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Barão de Maua", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_brightness_7_black, "Título 1", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Título Legal", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_android_black, "Meu Título", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_child_care_black, "Testando", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_brightness_7_black, "Meu Teste Legal", "Minha descrição teste"));
            list.add(new Model(R.drawable.ic_brightness_7_black, "Meu Teste Legal", "Minha descrição teste"));
        }
    }
}
