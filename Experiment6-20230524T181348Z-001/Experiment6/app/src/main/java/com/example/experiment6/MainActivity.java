package com.example.experiment6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView contextMenu = findViewById(R.id.t1);
        registerForContextMenu(contextMenu);

        Button alertDialog = findViewById(R.id.btn2);
        alertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this).
                        setMessage("Do you want to exit ?").
                        setTitle("Alert !")
                        .setCancelable(false)
                        .setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                            finish();
                        }).
                        setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                            dialog.cancel();
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_file,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this, "Clicked Main Menu",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i2:
                Toast.makeText(this, "I am sub menu 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i3:
                Toast.makeText(this, "I am sub menu 2",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_file,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this, "Clicked Main Menu",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i2:
                Toast.makeText(this, "I am sub menu 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i3:
                Toast.makeText(this, "I am sub menu 2",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    public void pop(View v){
        PopupMenu popupMenu = new PopupMenu(this,v);
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_file, popupMenu.getMenu());
        popupMenu.show();
    }

    public boolean OnMenuItemClick(MenuItem item){
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this, "Clicked Main Menu",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i2:
                Toast.makeText(this, "I am sub menu 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i3:
                Toast.makeText(this, "I am sub menu 2",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}