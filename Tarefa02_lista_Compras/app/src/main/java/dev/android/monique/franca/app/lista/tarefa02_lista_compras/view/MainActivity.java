package dev.android.monique.franca.app.lista.tarefa02_lista_compras.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dev.android.monique.franca.app.lista.tarefa02_lista_compras.R;
import dev.android.monique.franca.app.lista.tarefa02_lista_compras.model.Compras;

public class MainActivity extends AppCompatActivity {

    Compras compras;
    Compras outrasCompras;

    EditText editnomeItem;
    EditText editquantidadeItem;
    EditText editlocal;

    Button btn_button_limpar;
    Button btn_button_salvar;
    Button btn_button_finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compras = new Compras();
        compras.setNomeItem("Maça");
        compras.setQuantidadeItem("10");
        compras.setLocal("Super maxi");

        outrasCompras = new Compras();

        editnomeItem = findViewById(R.id.editText_nomedoItem);
        editquantidadeItem = findViewById(R.id.editText_quantidade);
        editlocal =findViewById(R.id.editText_local);

        editnomeItem.setText(compras.getNomeItem());
        editquantidadeItem.setText(compras.getQuantidadeItem());
        editlocal.setText(compras.getLocal());

        btn_button_limpar =findViewById(R.id.button_limpar);
        btn_button_salvar = findViewById(R.id.button_salvar);
        btn_button_finalizar = findViewById(R.id.button_finalizar);

        btn_button_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editnomeItem.setText("");
                editquantidadeItem.setText("");
                editlocal.setText("");
            }
        });

        btn_button_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outrasCompras.setNomeItem(editnomeItem.getText().toString());
                outrasCompras.setQuantidadeItem(editquantidadeItem.getText().toString());
                outrasCompras.setLocal(editlocal.getText().toString());

                Toast.makeText(MainActivity.this,"Ítem adicionado na lista!",Toast.LENGTH_LONG).show();
            }
        });

        btn_button_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ítem Comprado com Sucesso!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}