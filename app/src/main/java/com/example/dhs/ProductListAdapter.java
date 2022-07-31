package com.example.dhs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter <ProductViewHolder> {

    private Context mContext;
    private List<ProductList> mProductList;

    ProductListAdapter(Context mContext, List<ProductList> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row_item, parent, false);
        return new ProductViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.imageView.setImageResource(mProductList.get(position).getProductImage());
        holder.textView.setText(mProductList.get(position).getProductName());
    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }
}
    class ProductViewHolder extends RecyclerView.ViewHolder{
//    class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView= itemView.findViewById(R.id.imageview);
            textView =itemView.findViewById(R.id.textview);
        }
    }
