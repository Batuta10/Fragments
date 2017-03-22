package br.com.fiap.rm78792.fragmentsexemplos;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout fragment_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment_container = (FrameLayout) findViewById(R.id.fragment_container);
    }
    public void  alteraFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit();
    }
    public void exibirCarro1(View view) {
        alteraFragment(new Carro1Fragment());

    }
    public void exibiCarro2(View view) {
        alteraFragment(new Carro2Fragment());
    }
}