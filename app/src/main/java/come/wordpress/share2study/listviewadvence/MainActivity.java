package come.wordpress.share2study.listviewadvence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvFruit;
    List<Fruit> listOfFruit;
    FruitAdapter fruitAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        fruitAdapter = new FruitAdapter(this, R.layout.fruit_line, listOfFruit);
        lvFruit.setAdapter(fruitAdapter);
    }

    private void anhXa() {
        lvFruit = (ListView) findViewById(R.id.lvFruit);
        listOfFruit = new ArrayList<>();
        listOfFruit.add(new Fruit("Dâu tây", "Dâu tây đà lạt", R.drawable.dau));
        listOfFruit.add(new Fruit("Cam", "Cam xã đoài", R.drawable.cam));
        listOfFruit.add(new Fruit("Dứa", "Dứa lâm đồng", R.drawable.dua));
        listOfFruit.add(new Fruit("Đu đủ", "Đu đủ nghệ an", R.drawable.dudu));
        listOfFruit.add(new Fruit("Apple", "Apple Timcook", R.drawable.apple));
        listOfFruit.add(new Fruit("Táo tàu", "Táo trung quốc", R.drawable.tao));
        listOfFruit.add(new Fruit("Nho", "Nho nhập khẩu", R.drawable.nho));
    }
}
