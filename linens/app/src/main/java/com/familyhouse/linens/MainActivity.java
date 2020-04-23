package com.familyhouse.linens;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText showGuest;
    int guest = 0;

    EditText showBlanket;
    int blanket = 0;

    EditText showTowels;
    int towel = 0;

    EditText showCloth;
    int wash = 0;

    EditText showBath;
    int bath = 0;

    EditText showBlue;
    int blue = 0;

    EditText showTwin;
    int twin =  0;

    EditText showQueen;
    int queen = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);

        showGuest = (EditText) findViewById(R.id.guestValue);
        showBlanket = (EditText) findViewById(R.id.blanketValue);
        showTowels = (EditText) findViewById(R.id.towelValue);
        showCloth = (EditText) findViewById(R.id.washValue);
        showBath = (EditText) findViewById(R.id.bathValue);
        showBlue = (EditText) findViewById(R.id.blueValue);
        showTwin = (EditText) findViewById(R.id.twinValue);
        showQueen = (EditText) findViewById(R.id.queenValue);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.house, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    public void guestIN (View view) {
        guest++;
        showGuest.setText(Integer.toString(guest));
    }

    public void blanketIN (View view) {
        blanket++;
        showBlanket.setText(Integer.toString(blanket));
    }

    public void towelIN (View view) {
        towel++;
        showTowels.setText(Integer.toString(towel));
    }

    public void clothIN (View view) {
        wash++;
        showCloth.setText(Integer.toString(wash));
    }

    public void bathmatIN (View view) {
        bath++;
        showBath.setText(Integer.toString(bath));
    }

    public void bluebagIN (View view) {
        blue++;
        showBlue.setText(Integer.toString(blue));
    }

    public void twinIN (View view) {
        twin++;
        showTwin.setText(Integer.toString(twin));
    }

    public void queenIN (View view) {
        queen++;
        showQueen.setText(Integer.toString(queen));
    }

    public void guestDE (View view) {
        guest--;
        showGuest.setText(Integer.toString(guest));
    }

    public void blanketDE (View view) {
        blanket--;
        showBlanket.setText(Integer.toString(blanket));
    }

    public void towelDE (View view) {
        towel--;
        showTowels.setText(Integer.toString(towel));
    }

    public void clothDE (View view) {
        wash--;
        showCloth.setText(Integer.toString(wash));
    }

    public void bathmatDE (View view) {
        bath--;
        showBath.setText(Integer.toString(bath));
    }

    public void bluebagDE (View view) {
        blue--;
        showBlue.setText(Integer.toString(blue));
    }

    public void twinDE (View view) {
        twin--;
        showTwin.setText(Integer.toString(twin));
    }

    public void queenDE (View view) {
        queen--;
        showQueen.setText(Integer.toString(queen));
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

