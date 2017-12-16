package com.example.www.route;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    final Context context = this;
    CheckBox checkBoxRoute;


    private GoogleMap map;

    private ArrayList<String> transportList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentMap);
        supportMapFragment.getMapAsync(this);

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_route);
        dialog.setTitle("Seleccionar Ruta");

        ListView listViewRoutes = (ListView)dialog.findViewById(R.id.lstViewRoutes);
        loadData();

        final MapAdapter mapAdapter = new MapAdapter(this, transportList, map);
        listViewRoutes.setAdapter(mapAdapter);

        final TextView txtViewSelect = findViewById(R.id.txtViewSelectRoute);
        txtViewSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.show();


            }
        });

        listViewRoutes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                map.clear();
                PolylineOptions polyline = new PolylineOptions();
                if (position == 0)
                    polyline = loadDataRutaOne();
                if (position == 1)
                    polyline = loadDataRutaOne();
                if (position == 2)
                    polyline = loadDataRutaOne();
                map.addPolyline(polyline);
                dialog.dismiss();
            }
        } );
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        this.map = googleMap;
        LatLng point = new LatLng(-16.398744, -71.536906);
        map.addMarker(new MarkerOptions().position(point).title("Catedral de Arequipa"));
        map.moveCamera(CameraUpdateFactory.newLatLng(point));

    }

    public void loadData() {

        transportList = new ArrayList<>();
        transportList.add("Ruta 001");
        transportList.add("Ruta 002");
        transportList.add("Ruta 003");
    }

    private PolylineOptions loadDataRutaOne() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.add(new LatLng(	-16.369097	,	-71.505157))
                .add(new LatLng(	-16.369081	,	-71.505211))
                .add(new LatLng(	-16.369081	,	-71.505211))
                .add(new LatLng(	-16.368568	,	-71.505058))
                .add(new LatLng(	-16.368158	,	-71.50502	))
                .add(new LatLng(	-16.368158	,	-71.50502	))
                .add(new LatLng(	-16.368143	,	-71.505569))
                .add(new LatLng(	-16.368347	,	-71.507248))
                .add(new LatLng(	-16.368347	,	-71.507248))
                .add(new LatLng(	-16.36891	,	-71.507072	))
                .add(new LatLng(	-16.36891	,	-71.507072	))
                .add(new LatLng(	-16.369318	,	-71.505981))
                .add(new LatLng(	-16.369425	,	-71.505569))
                .add(new LatLng(	-16.369425	,	-71.505569))
                .add(new LatLng(	-16.36985	,	-71.505798	))
                .add(new LatLng(	-16.370136	,	-71.506142))
                .add(new LatLng(	-16.370136	,	-71.506142))
                .add(new LatLng(	-16.370285	,	-71.50602	))
                .add(new LatLng(	-16.370285	,	-71.50602	))
                .add(new LatLng(	-16.370653	,	-71.506577))
                .add(new LatLng(	-16.372475	,	-71.508972))
                .add(new LatLng(	-16.372475	,	-71.508972))
                .add(new LatLng(	-16.373709	,	-71.510605))
                .add(new LatLng(	-16.373709	,	-71.510605))
                .add(new LatLng(	-16.372459	,	-71.511597))
                .add(new LatLng(	-16.372459	,	-71.511597))
                .add(new LatLng(	-16.372856	,	-71.512123))
                .add(new LatLng(	-16.372856	,	-71.512123))
                .add(new LatLng(	-16.373365	,	-71.511742))
                .add(new LatLng(	-16.373365	,	-71.511742))
                .add(new LatLng(	-16.377005	,	-71.516769))
                .add(new LatLng(	-16.377344	,	-71.517181))
                .add(new LatLng(	-16.377344	,	-71.517181))
                .add(new LatLng(	-16.379374	,	-71.515846))
                .add(new LatLng(	-16.379374	,	-71.515846))
                .add(new LatLng(	-16.380657	,	-71.518036))
                .add(new LatLng(	-16.380657	,	-71.518036))
                .add(new LatLng(	-16.380068	,	-71.518387))
                .add(new LatLng(	-16.380068	,	-71.518387))
                .add(new LatLng(	-16.381004	,	-71.519943))
                .add(new LatLng(	-16.382557	,	-71.522079))
                .add(new LatLng(	-16.382557	,	-71.522079))
                .add(new LatLng(	-16.382765	,	-71.522324))
                .add(new LatLng(	-16.383417	,	-71.525253))
                .add(new LatLng(	-16.385693	,	-71.527275))
                .add(new LatLng(	-16.385693	,	-71.527275))
                .add(new LatLng(	-16.38855	,	-71.526413	))
                .add(new LatLng(	-16.38855	,	-71.526413	))
                .add(new LatLng(	-16.387976	,	-71.525696))
                .add(new LatLng(	-16.387976	,	-71.525696))
                .add(new LatLng(	-16.388458	,	-71.525322))
                .add(new LatLng(	-16.388458	,	-71.525322))
                .add(new LatLng(	-16.389015	,	-71.526093))
                .add(new LatLng(	-16.389036	,	-71.526192))
                .add(new LatLng(	-16.389627	,	-71.526947))
                .add(new LatLng(	-16.389627	,	-71.526947))
                .add(new LatLng(	-16.38991	,	-71.526588	))
                .add(new LatLng(	-16.390392	,	-71.526382))
                .add(new LatLng(	-16.39061	,	-71.52623	))
                .add(new LatLng(	-16.39201	,	-71.524467	))
                .add(new LatLng(	-16.39201	,	-71.524467	))
                .add(new LatLng(	-16.392714	,	-71.525307	))
                .add(new LatLng(	-16.39303	,	-71.525871	))
                .add(new LatLng(	-16.393118	,	-71.526123	))
                .add(new LatLng(	-16.393215	,	-71.526611	))
                .add(new LatLng(	-16.39332	,	-71.528381	))
                .add(new LatLng(	-16.39332	,	-71.528381	))
                .add(new LatLng(	-16.393469	,	-71.530663	))
                .add(new LatLng(	-16.393469	,	-71.530663	))
                .add(new LatLng(	-16.394375	,	-71.530899	))
                .add(new LatLng(	-16.395407	,	-71.53125	))
                .add(new LatLng(	-16.395407	,	-71.53125	))
                .add(new LatLng(	-16.395426	,	-71.531334	))
                .add(new LatLng(	-16.394716	,	-71.533463	))
                .add(new LatLng(	-16.394716	,	-71.533463	))
                .add(new LatLng(	-16.394163	,	-71.535133	))
                .add(new LatLng(	-16.393297	,	-71.537476	))
                .add(new LatLng(	-16.393297	,	-71.537476	))
                .add(new LatLng(	-16.392609	,	-71.539436	))
                .add(new LatLng(	-16.392609	,	-71.539436	))
                .add(new LatLng(	-16.392464	,	-71.539452	))
                .add(new LatLng(	-16.392405	,	-71.539558	))
                .add(new LatLng(	-16.392448	,	-71.539719	))
                .add(new LatLng(	-16.39217	,	-71.540535	))
                .add(new LatLng(	-16.391256	,	-71.542938	))
                .add(new LatLng(	-16.39006	,	-71.54631	))
                .add(new LatLng(	-16.389593	,	-71.547874	))
                .add(new LatLng(	-16.389174	,	-71.548805	))
                .add(new LatLng(	-16.388687	,	-71.550125	))
                .add(new LatLng(	-16.38818	,	-71.55162	))
                .add(new LatLng(	-16.388132	,	-71.551918	))
                .add(new LatLng(	-16.388132	,	-71.551918	))
                .add(new LatLng(	-16.388172	,	-71.551903	))
                .add(new LatLng(	-16.389339	,	-71.548706	))
                .add(new LatLng(	-16.389339	,	-71.548706	))
                .add(new LatLng(	-16.39048	,	-71.548042	))
                .add(new LatLng(	-16.39048	,	-71.548042	))
                .add(new LatLng(	-16.393005	,	-71.549217	))
                .add(new LatLng(	-16.39336	,	-71.549217	))
                .add(new LatLng(	-16.39336	,	-71.549217	))
                .add(new LatLng(	-16.393663	,	-71.549171	))
                .add(new LatLng(	-16.394049	,	-71.549011	))
                .add(new LatLng(	-16.396835	,	-71.547577	))
                .add(new LatLng(	-16.397127	,	-71.547531	))
                .add(new LatLng(	-16.397127	,	-71.547531	))
                .add(new LatLng(	-16.397299	,	-71.547577	))
                .add(new LatLng(	-16.398876	,	-71.549065	))
                .add(new LatLng(	-16.399981	,	-71.549995	))
                .add(new LatLng(	-16.401468	,	-71.550903	))
                .add(new LatLng(	-16.401468	,	-71.550903	))
                .add(new LatLng(	-16.402838	,	-71.548294	))
                .add(new LatLng(	-16.403141	,	-71.547501	))
                .add(new LatLng(	-16.403141	,	-71.547501	))
                .add(new LatLng(	-16.403706	,	-71.547684	))
                .add(new LatLng(	-16.403706	,	-71.547684	))
                .add(new LatLng(	-16.404203	,	-71.546211	))
                .add(new LatLng(	-16.404203	,	-71.546211	))
                .add(new LatLng(	-16.404243	,	-71.546227	))
                .add(new LatLng(	-16.404243	,	-71.546227	))
                .add(new LatLng(	-16.404299	,	-71.546028	))
                .add(new LatLng(	-16.404226	,	-71.545708	))
                .add(new LatLng(	-16.403671	,	-71.545296	))
                .add(new LatLng(	-16.403593	,	-71.545174	))
                .add(new LatLng(	-16.403543	,	-71.544876	))
                .add(new LatLng(	-16.404112	,	-71.543556	))
                .add(new LatLng(	-16.404112	,	-71.543556	))
                .add(new LatLng(	-16.404396	,	-71.542969	))
                .add(new LatLng(	-16.404396	,	-71.542969	))
                .add(new LatLng(	-16.40465	,	-71.542961	))
                .add(new LatLng(	-16.404764	,	-71.542816	))
                .add(new LatLng(	-16.404776	,	-71.542725	))
                .add(new LatLng(	-16.404736	,	-71.54258	))
                .add(new LatLng(	-16.404631	,	-71.542488	))
                .add(new LatLng(	-16.404539	,	-71.542465	))
                .add(new LatLng(	-16.404348	,	-71.542534	))
                .add(new LatLng(	-16.404348	,	-71.542534	))
                .add(new LatLng(	-16.403111	,	-71.541168	))
                .add(new LatLng(	-16.403111	,	-71.541168	))
                .add(new LatLng(	-16.402481	,	-71.542648	));

        return polylineOptions;
    }
}