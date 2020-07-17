package com.edgarlopez.pizzerialosarcos.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edgarlopez.pizzerialosarcos.PizzaActivity;
import com.edgarlopez.pizzerialosarcos.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MenuNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_navigation);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_menu, R.id.navigation_more)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }
    public void Pizzasact(View t) {
        Intent intent = new Intent(MenuNavigationActivity.this, PizzaActivity.class);
        startActivity(intent);
    }
   /* public void carrito (View t) {
        Intent intent = new Intent(MenuActivity.this, CarritoActivity.class);
        startActivity(intent);
    }
    public void ensalada(View t) {
        Intent intent = new Intent(MenuActivity.this, EnsaladasActivity.class);
        startActivity(intent);
    }
    public void hamburgesa(View t) {
        Intent intent = new Intent(MenuActivity.this, HamburgesaActivity.class);

        startActivity(intent);
    }
    public void marisco(View t) {
        Intent intent = new Intent(MenuActivity.this, MariscoActivity.class);

        startActivity(intent);
    }
    public void platillos(View t) {
        Intent intent = new Intent(MenuActivity.this, PlatillosActivity.class);

        startActivity(intent);
    }
    public void desayuno (View t) {
        Intent intent = new Intent(MenuActivity.this, DesayunoActivity.class);
        startActivity(intent);
    }
    public void bebidas(View t) {
        Intent intent = new Intent(MenuActivity.this, BebidaActivity.class);
        startActivity(intent);
    }
    public void postres(View t) {
        Intent intent = new Intent(MenuActivity.this, PostreActivity.class);
        startActivity(intent);
    }
    public void nieves(View t) {
        Intent intent = new Intent(MenuActivity.this, NieveActivity.class);
        startActivity(intent);
    }
    public void kids(View t) {
        Intent intent = new Intent(MenuActivity.this, KidsActivity.class);
        startActivity(intent);
    }
*/
}
