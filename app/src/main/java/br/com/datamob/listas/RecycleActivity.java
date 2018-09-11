package br.com.datamob.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity
{
    private RadioGroup rgOpcao;
    private RecyclerView rvView;
    private ArrayList<Model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        inicializaComponentes();
    }

    private void inicializaComponentes()
    {
        rgOpcao = findViewById(R.id.rgOpcao);
        rvView = findViewById(R.id.rvView);
        //
        rgOpcao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                criaLista();
                if(checkedId == R.id.rbGrid)
                {
                    rvView.setLayoutManager(new GridLayoutManager(RecycleActivity.this, 2));
                    rvView.setAdapter(new AdapterRecycle(R.layout.item_grid, list));
                }
                else  if(checkedId == R.id.rbLista)
                {
                    rvView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
                    rvView.setAdapter(new AdapterRecycle(R.layout.item_lista, list));
                }
                else  if(checkedId == R.id.rbEscalonado)
                {
                    rvView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
                    rvView.setAdapter(new AdapterRecycle(R.layout.item_dinamico, list));
                }
            }
        });
    }

    private void criaLista()
    {
        list = new ArrayList<>();
        list.add(new Model(R.drawable.ic_brightness_7_black, "Título 1", "Minha descrição teste Minha descrição teste Minha descrição teste"));
        list.add(new Model(R.drawable.ic_android_black, "Título Legal", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_android_black, "Meu Título", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_child_care_black, "Testando", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_brightness_7_black, "Meu Teste Legal", "Minha descrição teste Minha descrição teste Minha descrição teste Minha descrição teste Minha descrição teste"));
        list.add(new Model(R.drawable.ic_android_black, "Título 2", "Minha descrição teste \"Minha descrição teste\"Minha descrição teste"));
        list.add(new Model(R.drawable.ic_brightness_7_black, "Título 3", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_assignment_ind_black, "Título 4", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_android_black, "Título do Meu Título", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste Minha descrição teste Minha descrição teste Minha descrição teste Minha descrição teste"));
        list.add(new Model(R.drawable.ic_child_care_black, "Título 1", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_android_black, "Título Título", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_assignment_ind_black, "Título do meu Teste", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_android_black, "Barão de Maua", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_brightness_7_black, "Título Título Título", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_assignment_ind_black, "Título Título do Titudo", "Minha descrição teste"));
        list.add(new Model(R.drawable.ic_android_black, "Meu Teste de Título Meu Teste de Título Meu Teste de Título Meu Teste de Título", "Minha descrição teste"));
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
    }
}
