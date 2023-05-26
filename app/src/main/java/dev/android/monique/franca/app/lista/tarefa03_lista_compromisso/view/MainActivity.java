package dev.android.monique.franca.app.lista.tarefa03_lista_compromisso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dev.android.monique.franca.app.lista.tarefa03_lista_compromisso.R;
import dev.android.monique.franca.app.lista.tarefa03_lista_compromisso.model.Compromisso;

public class MainActivity extends AppCompatActivity {

    Compromisso compromisso;
    Compromisso outroCompromisso;

    EditText editNomeCompromisso;
    EditText editDataCompromisso;
    EditText editHoraCompromisso;
    EditText editLocalCompromisso;

    Button btn_button_limpar;
    Button btn_button_salvar;
    Button btn_butto_finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compromisso = new Compromisso();
        outroCompromisso = new Compromisso();

        compromisso.setNomeCompromisso("Jantar com o David");
        compromisso.setDataCompromisso("26/05/23");
        compromisso.setHorarioCompromisso("20:00");
        compromisso.setLocalCompromisso("Churrascaria Tropeiro");

        editNomeCompromisso =findViewById(R.id.editText_titulo_compromisso);
        editDataCompromisso = findViewById(R.id.editText_data);
        editHoraCompromisso = findViewById(R.id.editText_horario);
        editLocalCompromisso = findViewById(R.id.editText_local);

        editNomeCompromisso.setText(compromisso.getNomeCompromisso());
        editDataCompromisso.setText(compromisso.getDataCompromisso());
        editHoraCompromisso.setText(compromisso.getHorarioCompromisso());
        editLocalCompromisso.setText(compromisso.getLocalCompromisso());

        btn_button_limpar =findViewById(R.id.button_limpar);
        btn_button_salvar =findViewById(R.id.button_salvar);
        btn_butto_finalizar =findViewById(R.id.button_finalizar);

        btn_button_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNomeCompromisso.setText("");
                editDataCompromisso.setText("");
                editHoraCompromisso.setText("");
                editLocalCompromisso.setText("");
            }
        });

        btn_button_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outroCompromisso.setNomeCompromisso(editNomeCompromisso.getText().toString());
                outroCompromisso.setDataCompromisso(editDataCompromisso.getText().toString());
                outroCompromisso.setHorarioCompromisso(editHoraCompromisso.getText().toString());
                outroCompromisso.setLocalCompromisso(editLocalCompromisso.getText().toString());

                Toast.makeText(MainActivity.this,"Compromisso salvo com sucesso", Toast.LENGTH_LONG).show();
            }
        });

        btn_butto_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Compromisso realizado!",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}