package com.andira.gaji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtnik, edtnamkar, edtgajpok, edtbur, edtgol, edtintsif, edtjmlhhar;
    private Button btnproses;
    private Button btnhapus;
    private Button btnexit;
    private TextView txtnik;
    private TextView txtnamakar;
    private TextView txtgajipok;
    private TextView txtbur;
    private TextView txtgol;
    private TextView txtjumlahhar;
    private TextView txtgajpok;
    private TextView txtuangbur;
    private TextView txttunjangantrans;
    private TextView txttunjanganmkn;
    private TextView txttunjangangol;
    private TextView txtintsif;
    private TextView txtjumlahgajtor;
    private TextView txtpph;
    private TextView txtbpjssehat;
    private TextView txtbpjsketenaga;
    private TextView txtkoperasi;
    private TextView txtjumlahpot;
    private TextView txtgajiber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("UASMobile202010225280");
        edtnik = (EditText) findViewById(R.id.nik);
        edtnamkar = (EditText) findViewById(R.id.namakaryawan);
        edtgajpok = (EditText) findViewById(R.id.gajipokok);
        edtbur = (EditText) findViewById(R.id.lembur);
        edtgol = (EditText) findViewById(R.id.golongan);
        edtintsif = (EditText) findViewById(R.id.intensif);
        edtjmlhhar = (EditText) findViewById(R.id.jmlhhari);
        btnproses = (Button) findViewById(R.id.tombol1);
        txtnik = (TextView) findViewById(R.id.nik);
        txtnamakar = (TextView) findViewById(R.id.namakaryawan);
        txtgajipok = (TextView) findViewById(R.id.gajipok);
        txtbur = (TextView) findViewById(R.id.lembur);
        txtgol = (TextView) findViewById(R.id.golongan);
        txtjumlahhar = (TextView) findViewById(R.id.jmlhhari);
        txtgajpok = (TextView) findViewById(R.id.gajipok);
        txtuangbur = (TextView) findViewById(R.id.uanglembur);
        txttunjangantrans = (TextView) findViewById(R.id.tunjtransport);
        txttunjanganmkn = (TextView) findViewById(R.id.tunjmakan);
        txttunjangangol = (TextView) findViewById(R.id.tunjgolongan);
        txtintsif = (TextView) findViewById(R.id.intsif);
        txtjumlahgajtor = (TextView) findViewById(R.id.gajikotor);
        txtpph = (TextView) findViewById(R.id.pph21);
        txtbpjssehat = (TextView) findViewById(R.id.bpjskesehatan);
        txtbpjsketenaga = (TextView) findViewById(R.id.bpjsketenagakerjaan);
        txtkoperasi = (TextView) findViewById(R.id.koperasi);
        txtjumlahpot = (TextView) findViewById(R.id.jmlpotongan);
        txtgajiber = (TextView) findViewById(R.id.gajibersih);

        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nik = edtnik.getText().toString().trim();
                String namakaryawan = edtnamkar.getText().toString().trim();
                String gajipokok = edtgajpok.getText().toString().trim();
                String lembur = edtbur.getText().toString().trim();
                String golongan = edtgol.getText().toString().trim();
                String intensif = edtintsif.getText().toString().trim();
                String jumlahhari = edtjmlhhar.getText().toString().trim();
                double jd = 15000;
                double jdd = 20000;
                double gj = Double.parseDouble(gajipokok);
                txtgajipok.setText("Gaji Pokok = " + gj);
                double l = Double.parseDouble(lembur);
                txtuangbur.setText("Uang Lembur = " + l);
                double jh = Double.parseDouble(jumlahhari);
                double trans = (jh * jd);
                txttunjangantrans.setText("Tunjangan Transport = " + trans);
                double mkn = (jh * jdd);
                txttunjanganmkn.setText("Tunjangan Makan = " + mkn);
                double g = Double.parseDouble(golongan);
                double gol = (g);
                txttunjangangol.setText("Tunjangan Transport = " + gol);
                if (g == 1) {
                    g = 100000;
                    txttunjangangol.setText("Tunjangan Golongan = " + g);
                } else if (g == 2) {
                    g = 200000;
                    txttunjangangol.setText("Tunjangan Golongan = " + g);
                } else if (g == 3) {
                    g = 300000;
                    txttunjangangol.setText("Tunjangan Golongan = " + g);
                } else if (g == 4) {
                    g = 400000;
                    txttunjangangol.setText("Tunjangan Golongan = " + g);
                } else if (g == 5) {
                    g = 500000;
                    txttunjangangol.setText("Tunjangan Gol                                                                                                                                                                                                                                                                                          ongan = " + g);
                } else {
                    txttunjangangol.setText("Golongan tidak ada");
                }
                double i = Double.parseDouble(intensif);
                txtintsif.setText("Insentif = " + i);
                double gator = (gj + l + trans + mkn + g + i);
                txtjumlahgajtor.setText("Jumlah Gaji Kotor = " + gator);
                double pph = (gator * 0.1);
                txtpph.setText("PPh21 = " + pph);
                double sehat = (gj * 0.03);
                txtbpjssehat.setText("BPJS Kesehatan = " + sehat);
                double tenaga = (gj * 0.02);
                txtbpjsketenaga.setText("BPJS Ketenagakerjaan = " + tenaga);
                double kp = (100000);
                txtkoperasi.setText("Koperasi = " + kp);
                double pot = (pph + sehat + tenaga + kp);
                txtjumlahpot.setText("Jumlah Potongan = " + pot);
                double gasih = (gator - pot);
                txtgajiber.setText("Gaji Bersih = " + gasih);
            }
        });
    }
}