package com.example.fu;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUs extends Fragment implements OnMapReadyCallback {

    GoogleMap map;
    static final  LatLng erasmus_office=new LatLng(38.674631,39.1872898);
    static final  LatLng firat_univ=new LatLng(38.6777569,39.1997669);
    static  final LatLng faculty_education=new LatLng(38.6801516,39.19377);  //check the location numberies tik
    static  final LatLng faculty_science=new LatLng(38.6810398,39.2015744);
    static  final LatLng faculty_humanity=new LatLng(38.6810712,39.2006463);
    static  final LatLng faculty_economic=new LatLng(38.6819452,39.1912703);    //iktisadi ve idari bilimler fak konumu?  tik
    static  final LatLng faculty_theology=new LatLng(38.6771257,39.189975);
    static  final LatLng faculty_communication=new LatLng(38.624641,39.0964687);
    static  final LatLng faculty_engineering=new LatLng(38.6734719,39.1854492);
    static  final LatLng faculty_health=new LatLng(38.6837905,39.1915852);
    static  final LatLng faculty_fisher=new LatLng(38.6846317,39.1915382);
    static  final LatLng faculty_sport=new LatLng(38.6824,39.1925599);
    static  final LatLng faculty_technology=new LatLng(38.6812759,39.1938943);
    static  final LatLng faculty_architecture=new LatLng(38.673706,39.1911468);  //check the location number  tik
    static  final LatLng faculty_medicine=new LatLng(38.6783984,39.2022322);
    static  final LatLng faculty_dentis=new LatLng(38.6794184,39.2040303);
    static  final LatLng faculty_veterinary=new LatLng(38.6791077,39.198054);



    public ContactUs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_contact_us, container, false);
        SupportMapFragment mapFragment=(SupportMapFragment)getFragmentManager().findFragmentById(R.id.map1);

        return  v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment=(SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        if(MainActivity.ers==-2)DataActivity.whichfaculty=-1;

    map=googleMap;
        if(map != null) {
            map.addMarker(new MarkerOptions().position(erasmus_office)
                    .title("FU Erasmus Office")
                    .snippet(getResources().getString(R.string.if_you_have_any_prob))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.fu_logo)));


            map.addMarker(new MarkerOptions().position(faculty_education)
                    .title(getResources().getString(R.string.faculty_education))
                    .snippet(getResources().getString(R.string.has7))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.education)));


            map.addMarker(new MarkerOptions().position(faculty_science)
                    .title(getResources().getString(R.string.faculty_science))
                    .snippet(getResources().getString(R.string.has6))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.science)));


            map.addMarker(new MarkerOptions().position(faculty_humanity)
                    .title(getResources().getString(R.string.faculty_humanity))
                    .snippet(getResources().getString(R.string.has7))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.humanities)));


            map.addMarker(new MarkerOptions().position(faculty_economic)
                    .title(getResources().getString(R.string.faculty_economic))
                    .snippet(getResources().getString(R.string.has7))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.economics)));


            map.addMarker(new MarkerOptions().position(faculty_theology)
                    .title(getResources().getString(R.string.faculty_theology))
                    .snippet(getResources().getString(R.string.has3))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.religion)));


            map.addMarker(new MarkerOptions().position(faculty_communication)
                    .title(getResources().getString(R.string.faculty_communication))
                    .snippet(getResources().getString(R.string.has4))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.communication)));


            map.addMarker(new MarkerOptions().position(faculty_engineering)
                    .title(getResources().getString(R.string.faculty_engineering))
                    .snippet(getResources().getString(R.string.has14))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.engineering)));


            map.addMarker(new MarkerOptions().position(faculty_health)
                    .title(getResources().getString(R.string.faculty_health))
                    .snippet(getResources().getString(R.string.has4))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.healt_science)));


            map.addMarker(new MarkerOptions().position(faculty_fisher)
                    .title(getResources().getString(R.string.faculty_fisher))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.fisheries)));


            map.addMarker(new MarkerOptions().position(faculty_sport)
                    .title(getResources().getString(R.string.faculty_sport))
                    .snippet(getResources().getString(R.string.has3))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.sports)));


            map.addMarker(new MarkerOptions().position(faculty_technology)
                    .title(getResources().getString(R.string.faculty_technology))
                    .snippet(getResources().getString(R.string.has10))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.technology)));


            map.addMarker(new MarkerOptions().position(faculty_architecture)
                    .title(getResources().getString(R.string.faculty_architecture))
                    .snippet(getResources().getString(R.string.has5))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.architecture)));


            map.addMarker(new MarkerOptions().position(faculty_medicine)
                    .title(getResources().getString(R.string.faculty_medicine))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.medicine)));


            map.addMarker(new MarkerOptions().position(faculty_dentis)
                    .title(getResources().getString(R.string.faculty_dentis))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.dentistry)));


            map.addMarker(new MarkerOptions().position(faculty_veterinary)
                    .title(getResources().getString(R.string.faculty_veterinary))
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.vet_medicine)));


            UiSettings uis=googleMap.getUiSettings();
            uis.setCompassEnabled(true);
            uis.setZoomControlsEnabled(true);
            uis.setMyLocationButtonEnabled(true);
        }

        switch (DataActivity.whichfaculty){

            case 15: map.moveCamera(CameraUpdateFactory.newLatLngZoom(firat_univ,16)); break;
            case 0: map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_education,16));break;
            case 1:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_science,16));break;
            case 2:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_humanity,16));break;
            case 3: map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_economic,16));break;
            case 4:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_theology,16));break;
            case 5:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_communication,16));break;
            case 6: map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_engineering,16));break;
            case 7:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_health,16));break;
            case 8:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_fisher,16));break;
            case 9: map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_sport,16));break;
            case 10:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_technology,16));break;
            case 11:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_architecture,16));break;
            case 12: map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_medicine,16));break;
            case 13:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_dentis,16));break;
            case 14:map.moveCamera(CameraUpdateFactory.newLatLngZoom(faculty_veterinary,16));break;
            case -1:map.moveCamera(CameraUpdateFactory.newLatLngZoom(erasmus_office,16));
            MainActivity.ers=0;break;



        }

        }
}
