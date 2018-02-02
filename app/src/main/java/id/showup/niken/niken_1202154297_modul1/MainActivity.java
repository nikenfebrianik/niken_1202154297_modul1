package id.showup.niken.niken_1202154297_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nmMakanan;
    EditText jmlMakanan;
    private int uangOsas = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nmMakanan = findViewById(R.id.namaMakanan);
        jmlMakanan = findViewById(R.id.Jumlah);
    }

    public String getNmMakanan() {
        return nmMakanan.getText().toString();
    }
    public String getJumlah() {
        return jmlMakanan.getText().toString();
    }
    public int getUang() {
        return uangOsas;
    }

    public void keEatbus(View view) {
        Intent intentEatbus = new Intent(this, ResultActivity.class);
        intentEatbus.putExtra("tempat", "Eatbus");
        intentEatbus.putExtra("makanan", getNmMakanan());
        intentEatbus.putExtra("jumlah", getJumlah());
        intentEatbus.putExtra("uangOsas", getUang());

        startActivity(intentEatbus);
    }

    public void keAbnormal(View view) {
        Intent intentAbnormal = new Intent(this, ResultActivity.class);
        intentAbnormal.putExtra("tempat", "Abnormal");
        intentAbnormal.putExtra("makanan", getNmMakanan());
        intentAbnormal.putExtra("jumlah", getJumlah());
        intentAbnormal.putExtra("uangOsas", getUang());

        startActivity(intentAbnormal);
    }
}
