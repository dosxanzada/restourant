package lessons.kz.kazntu.a29042017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import adapter.ProductListAdapter;
import entities.Product;

public class Recip_29 extends AppCompatActivity {

    private ListView listViewProducts;
    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recip_29);

        products = new ArrayList<Product>();
        products.add(new Product("#1", "Ассорти", R.drawable.recipedia1, BigDecimal.valueOf(250)));
        products.add(new Product("#2", "Котлет", R.drawable.recipedia2, BigDecimal.valueOf(300)));
        products.add(new Product("#3", "Салат", R.drawable.recipedia3, BigDecimal.valueOf(350)));
        products.add(new Product("#4", "Донер", R.drawable.recipedia4, BigDecimal.valueOf(400)));
        products.add(new Product("#5", "Тауық еті", R.drawable.recipedia5, BigDecimal.valueOf(450)));
        products.add(new Product("#6", "Пицца", R.drawable.recipedia6, BigDecimal.valueOf(500)));
        products.add(new Product("#7", "Фри картопы", R.drawable.recipedia7, BigDecimal.valueOf(550)));
        products.add(new Product("#8", "Балмұздақ", R.drawable.recipedia8, BigDecimal.valueOf(600)));
        products.add(new Product("#9", "Мохито", R.drawable.recipedia9, BigDecimal.valueOf(650)));
        products.add(new Product("#10", "Десерт", R.drawable.recipedia10, BigDecimal.valueOf(700)));
        products.add(new Product("#11", "Лағман", R.drawable.recipedia11, BigDecimal.valueOf(750)));

        this.listViewProducts = (ListView) findViewById(R.id.listViewProduct);
        this.listViewProducts.setAdapter(new ProductListAdapter(this, products));
        this.listViewProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product product = products.get(i);
                Intent intent = new Intent(Recip_29.this, ProductDetailActivity.class);
                intent.putExtra("product",product);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), product.getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}