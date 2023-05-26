package dev.android.monique.franca.app.lista.tarefa01_lista_tarefas.view.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import dev.android.monique.franca.app.lista.tarefa01_lista_tarefas.R;
import dev.android.monique.franca.app.lista.tarefa01_lista_tarefas.model.Tarefa;

public class MainActivity extends AppCompatActivity {

    Tarefa tarefa;
    Tarefa outraTarefa;

    EditText editTituloTarefa;
    EditText editDescricaoTarefa;
    EditText editDataTarefa;

    FloatingActionButton btn_button_limpar;
    FloatingActionButton btn_button_salvar;
    Button btn_button_finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tarefa = new Tarefa();
        tarefa.setTituloTarefa("Prova de Física");
        tarefa.setDescricaoTarefa("Conteúdo de Física Moderna");
        tarefa.setDataTarefa("31/05/2023");

        outraTarefa =new Tarefa();

        editTituloTarefa = findViewById(R.id.editText_titulo_da_Tarefa);
        editDescricaoTarefa = findViewById(R.id.editText_descricao_da_Tarefa);
        editDataTarefa = findViewById(R.id.editText_data_de_conclucao);

        editTituloTarefa.setText(tarefa.getTituloTarefa());
        editDescricaoTarefa.setText(tarefa.getDescricaoTarefa());
        editDataTarefa.setText(tarefa.getDataTarefa());

        btn_button_limpar = findViewById(R.id.Button_limpar);
        btn_button_salvar = findViewById(R.id.Button_salvar);
        btn_button_finalizar = findViewById(R.id.button_finalizar);

        btn_button_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTituloTarefa.setText("");
                editDescricaoTarefa.setText("");
                editDataTarefa.setText("");

            }
        });

        btn_button_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outraTarefa.setTituloTarefa(editTituloTarefa.getText().toString());
                outraTarefa.setDescricaoTarefa(editDescricaoTarefa.getText().toString());
                outraTarefa.setDataTarefa(editDataTarefa.getText().toString());

                Toast.makeText(MainActivity.this, "Dados Salvos com Sucesso! " + outraTarefa.toString(),Toast.LENGTH_LONG).show();

            }
        });

        btn_button_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this," Tarefa Concluida!",Toast.LENGTH_LONG).show();
                finish();
            }
        });



    }
}