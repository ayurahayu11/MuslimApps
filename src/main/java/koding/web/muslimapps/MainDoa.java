package koding.web.muslimapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainDoa extends AppCompatActivity {

    private Button doasebelumtidur;
    private Button doabanguntidur;
    private Button doahendakkeluarrumah;
    private Button doahendakmasukrumah;
    private Button doaketikamelihatbarangygdisukai;
    private Button doamenghilangkanrasamarahh;
    private Button doasebelumbelajar;
    private Button doasebelummakan;
    private Button doauntukkebaikanoranglain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doa);

        doasebelumtidur = (Button) findViewById(R.id.btn_doa_sebelum_tidur);
        doabanguntidur = (Button) findViewById(R.id.btn_doa_bangun_tidur);
        doahendakkeluarrumah = (Button) findViewById(R.id.btn_doa_hendak_keluar_rumah);
        doahendakmasukrumah = (Button) findViewById(R.id.btn_doa_hendak_masuk_rumah);
        doaketikamelihatbarangygdisukai = (Button) findViewById(R.id.btn_doa_ketika_melihat_barang_ygdisukai);
        doamenghilangkanrasamarahh = (Button) findViewById(R.id.btn_doa_menghilangkan_rasa_marah);
        doasebelumbelajar = (Button) findViewById(R.id.btn_doa_sebelum_belajar);
        doasebelummakan = (Button) findViewById(R.id.btn_doa_sebelum_makan);
        doauntukkebaikanoranglain = (Button) findViewById(R.id.btn_doa_untuk_kebaikan_oranglain);

        doasebelumtidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaSebelumTidur.class);
                startActivity(intent);
            }
        });

        doabanguntidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaBangunTidur.class);
                startActivity(intent);
            }
        });

        doahendakkeluarrumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaHendakKeluarRumah.class);
                startActivity(intent);
            }
        });

        doahendakmasukrumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaHendakMasukRumah.class);
                startActivity(intent);
            }
        });

        doaketikamelihatbarangygdisukai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaKetikaMelihatBarangYgDisukai.class);
                startActivity(intent);
            }
        });

        doamenghilangkanrasamarahh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaMenghilangkanRasaMarah.class);
                startActivity(intent);
            }
        });

        doasebelumbelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaSebelumBelajar.class);
                startActivity(intent);
            }
        });

        doasebelummakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaSebelumMakan.class);
                startActivity(intent);
            }
        });

        doauntukkebaikanoranglain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDoa.this, DoaUntukKebaikanOranglain.class);
                startActivity(intent);
            }
        });
    }
}
