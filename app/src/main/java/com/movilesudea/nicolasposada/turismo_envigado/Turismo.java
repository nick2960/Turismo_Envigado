package com.movilesudea.nicolasposada.turismo_envigado;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class Turismo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_turismo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.actiont_publicidad) {
            Intent i = new Intent(this, Publicidad_Envigado.class);
            startActivity(i);
            return true;
        }else if (id == R.id.actiont_hoteles){
            Intent i = new Intent(this, Hoteles.class);
            startActivity(i);
            return true;
        }else if (id == R.id.actiont_bares){
            Intent i = new Intent(this, Bares.class);
            startActivity(i);
            return true;
        }else if (id == R.id.actiont_demografia){
            Intent i = new Intent(this, Demografia.class);
            startActivity(i);
            return true;
        }else if (id == R.id.actiont_acercade){
            Intent i = new Intent(this, acercade.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
