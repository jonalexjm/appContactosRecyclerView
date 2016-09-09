package jonalexjm.com.appcontactosbasedatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView rvContactos;
    public ContactoAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        rvContactos = (RecyclerView) findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);// asi funciona con linear
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvContactos.setLayoutManager(llm);

        /*
        GridLayoutManager glm = new GridLayoutManager(this, 2); // fnciona con grid en caso de querer utilizar otra layout se comenta estas dos lineas
        listaContactos.setLayoutManager(glm);
*/

        inicializarListaContactos();
        inicializarAdaptador();



    }

    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos, this);
        rvContactos.setAdapter(adaptador);

    }

    public void inicializarListaContactos(){

        contactos = new ArrayList<Contacto>();


        contactos.add(new Contacto(R.drawable.linux_client_48, "john alexander jimenez", "565644444", "jonalexjm@hotmail.com"));
        contactos.add(new Contacto(R.drawable.windows_client_48, "mirian castaño", "334443343", "mrjhico@gmail.com"));
        contactos.add(new Contacto(R.drawable.mac_client_48, "cristian cepeda", "9998878776", "cristian@hotmail.com"));

    }





}












