package adapter;

/**
 * Created by Adina on 29.04.2017.
 */


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import entities.Product;
import lessons.kz.kazntu.a29042017.R;

public class ProductListAdapter extends ArrayAdapter<Product>{

    private  Context context;
    private List<Product> products;

    public ProductListAdapter (Context context, List<Product> products){

        super(context, R.layout.product_list_layout, products);
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.product_list_layout, parent, false);

        ImageView imageViewPhoto = (ImageView) view.findViewById(R.id.imageView);
        imageViewPhoto.setImageResource(products.get(position).getPhoto());

        TextView textViewname = (TextView) view.findViewById(R.id.textViewName);
        textViewname.setText(products.get(position).getName());

        TextView textViewPrice = (TextView) view.findViewById(R.id.textViewPrice);
        textViewPrice.setText(String.valueOf(products.get(position).getPrice()));

        return view;
    }
}


