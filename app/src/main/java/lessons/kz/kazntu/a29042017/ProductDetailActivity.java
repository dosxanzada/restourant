package lessons.kz.kazntu.a29042017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import entities.Product;



public class ProductDetailActivity extends AppCompatActivity {

    private Button buttonBack;
    private TextView textViewName;
    private TextView textViewId;
    private TextView textViewPrice;
    private ImageView imageViewPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdetail);
        Intent intent = getIntent();
        Product product = (Product) intent.getSerializableExtra("product");
        this.buttonBack = (Button) findViewById(R.id.button);
        this.buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductDetailActivity.this, Recip_29.class);
                startActivity(intent);
            }
        });
        this.textViewId = (TextView) findViewById(R.id.textViewId);
        this.textViewId.setText(product.getId());
        this.textViewName = (TextView) findViewById(R.id.textViewName);
        this.textViewName.setText(product.getName());
        this.textViewPrice = (TextView) findViewById(R.id.textViewPrice);
        this.textViewPrice.setText(String.valueOf(product.getPrice()));
        this.imageViewPhoto = (ImageView) findViewById(R.id.imageViewPhoto);
        this.imageViewPhoto.setImageResource(product.getPhoto());

    }
}
