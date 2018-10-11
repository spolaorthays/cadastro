package com.example.elisios.cadastroclientes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NOME = "nome";
    public static final String SOBRENOME = "sobrenome";
    public static final String IDADE = "idade";
    public static final String EMAIL = "email";
    private Button button;
    private EditText nome;
    private EditText sobrenome;
    private EditText idade;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bt_enviar);
        nome = findViewById(R.id.edit_nome);
        sobrenome = findViewById(R.id.edit_sobrenome);
        idade = findViewById(R.id.edit_idade);
        email = findViewById(R.id.edit_email);

        findViewById(R.id.bt_enviar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colherDadosEEnviar();
            }
        });
    }


    public void colherDadosEEnviar(){
        Bundle bundle = new Bundle();
        bundle.putString(NOME,nome.getText().toString());
        bundle.putString(SOBRENOME,sobrenome.getText().toString());
        bundle.putString(IDADE,idade.getText().toString());
        bundle.putString(EMAIL,email.getText().toString());

        Intent intent = new Intent(this,ExibirActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }




}
