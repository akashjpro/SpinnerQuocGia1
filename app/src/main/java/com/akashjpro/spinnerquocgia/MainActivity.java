package com.akashjpro.spinnerquocgia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spQuocGia;
    ArrayList<QuocGia> mamgQuocGia;
    QuocGiaAdapter quocGiaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
    }

    private void addControls() {
        spQuocGia = (Spinner) findViewById(R.id.spinnerQuocGia);
        mamgQuocGia = new ArrayList<>();

        mamgQuocGia.add(new QuocGia(R.drawable.campuchia, "Campuchia"));
        mamgQuocGia.add(new QuocGia(R.drawable.viet_nam, "Việt Nam"));
        mamgQuocGia.add(new QuocGia(R.drawable.han_quoc, "Hàn Quốc"));
        mamgQuocGia.add(new QuocGia(R.drawable.my, "Hoa Kỳ"));
        mamgQuocGia.add(new QuocGia(R.drawable.thai_lan, "Thái Lan"));
        mamgQuocGia.add(new QuocGia(R.drawable.thuy_dien, "Thụy Điển"));

        quocGiaAdapter = new QuocGiaAdapter(MainActivity.this, R.layout.item, mamgQuocGia);

        spQuocGia.setAdapter(quocGiaAdapter);

    }
}
