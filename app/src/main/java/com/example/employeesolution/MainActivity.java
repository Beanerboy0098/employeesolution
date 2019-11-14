package com.example.employeesolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onAddEmployeeClick(View V){
        Intent i = new Intent(  this, EmployeeEntryActivity.class);
        this.startActivity(i);
                }
    public void onEmployeeListClick(View V){
        Intent i = new Intent(  this, EmployeeEntryActivity.class);
        this.startActivity(i);
    }
                }
