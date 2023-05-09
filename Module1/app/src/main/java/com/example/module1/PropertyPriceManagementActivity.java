package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

public class PropertyPriceManagementActivity extends AppCompatActivity {

    ListView lvProperty;
    EditText edtWeekend, edtHolidays, edtOtherDays;
    ImageView btnUpWeekend, btnDownWeekend,
            btnUpHolidays, btnDownHolidays,
            btnUpOtherDays, btnDownOtherDays;
    Spinner spnWeekend, spnHolydays, spnOtherDay;

    PropertyPriceAdapter priceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_price_management);

        setControl();
        setAdapter();
        setEvent();
    }

    private void setAdapter() {
        String [] test = {"fd", "dsf", "fds", "fd"};
        priceAdapter = new PropertyPriceAdapter(PropertyPriceManagementActivity.this, test);
        lvProperty.setAdapter(priceAdapter);
    }

    private void setEvent() {
    }

    private void setControl() {
        lvProperty = findViewById(R.id.lvProperty);
        edtWeekend = findViewById(R.id.edtWeekend);
        edtHolidays = findViewById(R.id.edtHolidays);
        edtOtherDays = findViewById(R.id.edtOtherDays);
        btnUpWeekend = findViewById(R.id.btnUpWeekend);
        btnDownWeekend = findViewById(R.id.btnDownWeekend);
        btnUpHolidays = findViewById(R.id.btnUpHolidays);
        btnDownHolidays = findViewById(R.id.btnDownHolidays);
        btnUpOtherDays = findViewById(R.id.btnUpOtherDays);
        btnDownOtherDays = findViewById(R.id.btnDownOtherDays);
        spnWeekend = findViewById(R.id.spnWeekend);
        spnHolydays = findViewById(R.id.spnHolydays);
        spnOtherDay = findViewById(R.id.spnOtherDay);
    }
}