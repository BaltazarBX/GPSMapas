package com.example.gpsmapas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener{

    EditText txtlatitud, txtlongitud;
    GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtlatitud=findViewById(R.id.txt_latitud);
        txtlongitud=findViewById(R.id.txt_longitud);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);

        VideoView MiVideo = findViewById(R.id.videoView);
        String video = "android.resource://"+getPackageName()+"/"+R.raw.st;
        Uri uri = Uri.parse(video);
        MiVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        MiVideo.setMediaController(mediaController);
        mediaController.setAnchorView(MiVideo);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng Temuco = new LatLng(-33.448726, -70.660882);
        mMap.addMarker(new MarkerOptions().position(Temuco).title("Sede Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));
        LatLng Arica = new LatLng(-18.4824962798507, -70.3101670);
        mMap.addMarker(new MarkerOptions().position(Arica).title("Sede Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arica));
        LatLng Iquique = new LatLng(-20.21326, -70.15027);
        mMap.addMarker(new MarkerOptions().position(Iquique).title("Sede Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Iquique));
        LatLng Serena = new LatLng(-29.90453, -71.24894);
        mMap.addMarker(new MarkerOptions().position(Serena).title("Sede Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Serena));
        LatLng Antofagasta = new LatLng(-23.65236, -70.3954);
        mMap.addMarker(new MarkerOptions().position(Antofagasta).title("Sede Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Antofagasta));
        LatLng Viña = new LatLng(-33.448726, -70.660882);
        mMap.addMarker(new MarkerOptions().position(Viña).title("Sede Viña"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Viña));
        LatLng Santiago = new LatLng(-33.5613472, -70.6225687);
        mMap.addMarker(new MarkerOptions().position(Santiago).title("Sede Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Santiago));
        LatLng Talca = new LatLng(-35.4264,  -71.65542);
        mMap.addMarker(new MarkerOptions().position(Talca).title("Sede Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));
        LatLng Concepcion = new LatLng(-73.0497700,  -36.8269900);
        mMap.addMarker(new MarkerOptions().position(Concepcion).title("Sede Concepcion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Concepcion));
        LatLng Angeles = new LatLng(-37.46973,  -72.35366);
        mMap.addMarker(new MarkerOptions().position(Angeles).title("Sede Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Angeles));
        LatLng Valdivia = new LatLng(-39.81422,  -73.24589);
        mMap.addMarker(new MarkerOptions().position(Valdivia).title("Sede Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Valdivia));
        LatLng Osorno = new LatLng(-40.57395,  -73.13348);
        mMap.addMarker(new MarkerOptions().position(Osorno).title("Sede Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Osorno));
        LatLng Puertomontt = new LatLng(-41.4693,  -72.94237);
        mMap.addMarker(new MarkerOptions().position(Puertomontt).title("Sede Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Puertomontt));





    }

    @Override
    public void onMapClick(@NonNull LatLng latLng){
        txtlatitud.setText(""+latLng.latitude);
        txtlongitud.setText(""+latLng.longitude);
    }
    @Override
    public void onMapLongClick(@NonNull LatLng latLng){
        txtlatitud.setText(""+latLng.latitude);
        txtlongitud.setText(""+latLng.longitude);
    }


}