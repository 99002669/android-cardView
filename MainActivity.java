package com.lnt.cardviewexample;


        import androidx.appcompat.app.AppCompatActivity;
        import androidx.cardview.widget.CardView;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;
        import android.os.Bundle;
        import java.util.ArrayList;
        import java.util.Arrays;
public class MainActivity extends AppCompatActivity {
    ArrayList<String> AndroidName = new ArrayList<>(Arrays.asList("Android Cupcake","Android Donut","Android Eclair","Android Froyo","Android Gingerbread","Android Honeycomb","Android Icecreamsandwich"));
    ArrayList<String> AndroidVersion = new ArrayList<>(Arrays.asList("Android 1.5","Android 1.6","Android 2.0/2.1","Android 2.2.x","Android 2.3.x","Android 3.x","Android 4.0.x"));
    ArrayList<Integer> Image = new ArrayList<>(Arrays.asList(R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich));




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //Set a linear layout manager with default vertical orientation
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        //callthe constructor of customAdapter to send the reference and data to adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,AndroidName,AndroidVersion,Image);
        recyclerView.setAdapter(customAdapter);//Set the adapter to recycler view
    }
}
