package com.example.employeesolution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EmployeeEntryActivity extends AppCompatActivity {
    private EditText fnameET, lnameET, height_feetET, weightET, ageET, height_inchesET;
    private Employee theEmployee = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_entry);

        this.fnameET = this.findViewById(R.id.fnameET);
        this.lnameET = this.findViewById(R.id.lnameET);
        this.height_feetET = this.findViewById(R.id.height_feetET);
        this.weightET = this.findViewById(R.id.weightET);
        this.ageET = this.findViewById(R.id.ageET);
        this.height_inchesET = this.findViewById(R.id.height_inchesET);
    }

    public void onCreateEmployeeButtonClicked(View v)
    {
        if(this.theEmployee == null) {


            String fname = this.fnameET.getText().toString();
            String lname = this.lnameET.getText().toString();
            double weight = Double.parseDouble(this.weightET.getText().toString());
            int height_feet = Integer.parseInt(this.height_feetET.getText().toString());
            int age = Integer.parseInt(this.ageET.getText().toString());
            int height_inches = Integer.parseInt(this.height_inchesET.getText().toString());
            this.theEmployee = new Employee(fname, lname, height_feet, age, weight, height_inches);
        }

        else
        {
            theEmployee.setFname(this.fnameET.getText().toString());
            theEmployee.setHeight_inches(Integer.parseInt(this.height_inchesET.getText().toString()));
            theEmployee.setLname(this.lnameET.getText().toString());
            theEmployee.setAge(Integer.parseInt(this.ageET.getText().toString()));
            theEmployee.setHeight_feet(Integer.parseInt(this.height_feetET.getText().toString()));
            theEmployee.setWeight(Double.parseDouble(this.weightET.getText().toString()));



        }

    }
}
