package com.example.travelmania;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.example.travelmania.fragmentclasses.AboutusFragments;
import com.example.travelmania.fragmentclasses.ContactusFragments;
import com.example.travelmania.fragmentclasses.PlacesFragments;
import com.example.travelmania.helpers.User;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Places extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;
    FirebaseAuth mAuth;




    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        drawer=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigaton_drawer_open, R.string.navigaton_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        updateNavHeader();

        if(savedInstanceState == null) {


            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,
                    new PlacesFragments()).commit();
            navigationView.setCheckedItem(R.id.nav_places);

        }

        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();


    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,
                    new PlacesFragments()).commit();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.nav_chat:
                startActivity(new Intent(getApplicationContext(), GlobalChat.class));
                break;

            case R.id.nav_places:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,
                        new PlacesFragments()).commit();
                break;
            case R.id.nav_about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,
                        new AboutusFragments()).addToBackStack(null).commit();
                break;
            case R.id.nav_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,
                        new ContactusFragments()).addToBackStack(null).commit();
                break;
            case R.id.nav_settings:
                startActivity(new Intent(getApplicationContext(), Settings.class));
                break;
            case R.id.nav_share:
                Toast.makeText(this, "Please Share this with your friends!",Toast.LENGTH_LONG).show();
                break;
            case R.id.nav_logout:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(Places.this,MainActivity.class));
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void updateNavHeader(){

        NavigationView navigationView=findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);

        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        final TextView greetingTextView = headerView.findViewById(R.id.name);
        final TextView emailTextView = headerView.findViewById(R.id.email);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userprofile = snapshot.getValue(User.class);

                if(userprofile != null){
                    String name= userprofile.name;
                    String email= userprofile.email;

                    greetingTextView.setText("Welcome, " + name + "!");
                    emailTextView.setText(email);

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Places.this, "Something went wrong!", Toast.LENGTH_LONG).show();
            }
        });
    }
}