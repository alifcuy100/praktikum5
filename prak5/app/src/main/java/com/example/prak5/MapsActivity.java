package com.example.prak5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sidoarjo = new LatLng(-7.446522, 112.718519);
        LatLng ayambakarsolo = new LatLng(-7.446837, 112.704378);
        mMap.addMarker(new MarkerOptions().position(ayambakarsolo).title("Ayam Bakar Wong Solo"));
        LatLng baksocakpitung = new LatLng(-7.447460, 112.712509);
        mMap.addMarker(new MarkerOptions().position(baksocakpitung).title("Bakso Cak pitung"));
        LatLng pizzahut = new LatLng(-7.450101, 112.712574);
        mMap.addMarker(new MarkerOptions().position(pizzahut).title("Pizza Hut"));
        LatLng mcdonald = new LatLng(-7.449159, 112.703941);
        mMap.addMarker(new MarkerOptions().position(mcdonald).title("Mc Donald"));
        LatLng burgerking = new LatLng(-7.449211, 112.708293);
        mMap.addMarker(new MarkerOptions().position(burgerking).title("Burger King"));
        LatLng ibc = new LatLng(-7.449869, 112.703902);
        mMap.addMarker(new MarkerOptions().position(ibc).title("Ikan Bakar Cianjur"));
        LatLng igabakar = new LatLng(-7.449539, 112.707301);
        mMap.addMarker(new MarkerOptions().position(igabakar).title("Iga Bakar Cianjur"));
        LatLng bebeksinjay = new LatLng(-7.446221, 112.704884);
        mMap.addMarker(new MarkerOptions().position(bebeksinjay).title("Bebek Sinjay"));
        LatLng seblak = new LatLng(-7.451093, 112.706002);
        mMap.addMarker(new MarkerOptions().position(seblak).title("Aneka Seblak Dan Mi Pedas"));
        LatLng kepiting = new LatLng(-7.451092, 112.703321);
        mMap.addMarker(new MarkerOptions().position(kepiting).title("Aneka Masakan Kepiting"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sidoarjo));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13));
    }
}
