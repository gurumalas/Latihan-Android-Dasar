package com.dicoding.myform;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tombolhome = findViewById(R.id.bt_pindah);
        tombolhome.setOnClickListener(this);

        Button tomboldgndata = findViewById(R.id.bt_data);
        tomboldgndata.setOnClickListener(this);

        Button tombolkontak = findViewById(R.id.bt_hp);
        tombolkontak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            jika tomobol awal maka akan ke home berdasarkan id
            case R.id.bt_pindah:
//                dari mainactiv ini memanggil fungsi dari home class
                Intent pindahrumah = new Intent(MainActivity.this, Home.class);
                startActivity(pindahrumah);
//                Kita membuat suatu obyek Intent dengan cara seperti di atas dengan memberikan kelas
//                Activity asal (MainActivity.this) dan kelas Activity tujuan (MoveActivity.class) pada konstruktor kelas Intent.
//                Kelas asal selalu menggunakan .this yang menandakan obyek kelas saat ini. Kelas tujuan selalu menggunakan .class.
                break;
            case R.id.bt_data:
                Intent pindahsamadata = new Intent(MainActivity.this, DenganData.class);
                pindahsamadata.putExtra(DenganData.EXTRA_NAME, "Duan ");
                pindahsamadata.putExtra(DenganData.EXTRA_AGE, 25);
                startActivity(pindahsamadata);
                break;
            case R.id.bt_hp:
                String phoneNumber = "ffv";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }


}