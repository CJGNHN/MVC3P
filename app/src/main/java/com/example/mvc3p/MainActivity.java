package com.example.mvc3p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mvc3p.Models.ModelsCounters;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer, View.OnClickListener
{

    private ModelsCounters contador;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = new ModelsCounters();
        contador.addObserver(this);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn1:
            contador.SetValorIndice(0);
            break;

            case R.id.btn2:
            contador.SetValorIndice(1);
            break;

            case R.id.btn3:
                contador.SetValorIndice(2);
                break;
            case R.id.btn4:
                contador.SetValorIndice(3);
                break;

        }

    }

    @Override
    public void update(Observable o, Object arg) {

        btn1.setText("contador ;" + contador.ObtenerValorIndice(0));
        btn2.setText("contador ;" + contador.ObtenerValorIndice(1));
        btn3.setText("contador ;" + contador.ObtenerValorIndice(2));
        btn4.setText("contador ;"+ contador.ObtenerValorIndice(3));
    }
}