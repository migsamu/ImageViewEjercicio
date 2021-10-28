package org.iesfm.imageviewejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView frutas;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cargarImagen(View v) {

        frutas = (ImageView) findViewById(R.id.ivFrutas);
        texto = (EditText) findViewById((R.id.etTexto));

        switch (texto.getText().toString()) {
            case "a":
                frutas.setImageResource(R.drawable.aguacates);
                Toast.makeText(this, "Ha seleccionado los aguacates", Toast.LENGTH_LONG).show();
                break;

            case "n":
                frutas.setImageResource(R.drawable.naranjas);
                Toast.makeText(this, "Ha seleccionado las naranjas", Toast.LENGTH_LONG).show();
                break;

            case "p":
                frutas.setImageResource(R.drawable.platano);
                Toast.makeText(this, "Ha seleccionado los platanos", Toast.LENGTH_LONG).show();
                break;

            default:
                Toast.makeText(this, "Introduce a, n, p, para mostrar la fruta seleccionada", Toast.LENGTH_LONG).show();
                frutas.setImageResource(R.drawable.fruta);
        }

    }
}