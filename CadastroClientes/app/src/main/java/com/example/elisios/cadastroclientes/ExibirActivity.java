package com.example.elisios.cadastroclientes;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ExibirActivity extends AppCompatActivity {

    private TextView nome;
    private TextView sobrenome;
    private TextView idade;
    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir);

        nome = findViewById(R.id.text_nome);
        sobrenome = findViewById(R.id.text_sobrenome);
        idade = findViewById(R.id.text_idade);
        email = findViewById(R.id.text_email);

        exibirResultados();
    }

    public void exibirResultados(){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        nome.setText(bundle.getString(MainActivity.NOME));
        sobrenome.setText(bundle.getString(MainActivity.SOBRENOME));
        idade.setText(bundle.getString(MainActivity.IDADE));
        email.setText(bundle.getString(MainActivity.EMAIL));
    }

    public void exibirTelaRoxa(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_id, new RoxoFragment());
        transaction.commit();
    }

    public void exibirTelaVermelha(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_id, new VermelhoFragment());
        transaction.commit();
    }
}
