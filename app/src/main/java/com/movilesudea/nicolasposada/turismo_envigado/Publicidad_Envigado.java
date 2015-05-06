package com.movilesudea.nicolasposada.turismo_envigado;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class Publicidad_Envigado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicidad__envigado);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_publicidad__envigado, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.actionp_hoteles) {
            Intent i = new Intent(this, Hoteles.class);
            startActivity(i);
            return true;
        }else if (id == R.id.actionp_bares){
            Intent i = new Intent(this, Bares.class);
            startActivity(i);
            return true;
        }else if (id == R.id.actionp_turismo){
            Intent i = new Intent(this, Turismo.class);
            startActivity(i);
            return true;
        }else if (id == R.id.actionp_demografia){
            Intent i = new Intent(this, Demografia.class);
            startActivity(i);
            return true;
        }else if (id == R.id.actionp_acercade){
            Intent i = new Intent(this, acercade.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
