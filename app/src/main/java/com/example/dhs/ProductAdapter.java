package com.example.dhs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class ProductAdapter extends BaseAdapter {
        int quantity;


    Context c;
    int image[]= {R.drawable.nerolacdistemper11,R.drawable.stainer1,R.drawable.jkputty123,R.drawable.wcement1,R.drawable.wcement1,R.drawable.pop1,R.drawable.acc,R.drawable.ambuja,R.drawable.nsp1,R.drawable.nsp1,R.drawable.redoxide1,R.drawable.redoxide1,R.drawable.woodprimer1,R.drawable.woodprimer1,R.drawable.lacquer2,R.drawable.sealer2,R.drawable.tarpeen3,R.drawable.tarpeen3,R.drawable.tarpeen3,R.drawable.thinner1,R.drawable.lakh,R.drawable.plyboard,R.drawable.plyboard,R.drawable.plyboard,R.drawable.plyboard,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.ply,R.drawable.fevocol,R.drawable.fevocol,R.drawable.nails,R.drawable.nails,R.drawable.nails,R.drawable.nails,R.drawable.nails,R.drawable.nails,R.drawable.nails,R.drawable.nails,R.drawable.wpipe,R.drawable.wpipe,R.drawable.wpipe,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.nipple,R.drawable.elbow,R.drawable.elbow,R.drawable.elbow,R.drawable.elbow,R.drawable.elbow,R.drawable.socket,R.drawable.socket,R.drawable.socket,R.drawable.socket,R.drawable.socket,R.drawable.uniun,R.drawable.uniun,
            R.drawable.uniun,R.drawable.uniun,R.drawable.uniun,R.drawable.ajk,R.drawable.ajk,R.drawable.ajk,R.drawable.ajk,R.drawable.ajk,R.drawable.reducersocket,R.drawable.reducersocket,R.drawable.reducersocket,R.drawable.reducersocket,R.drawable.reducersocket,R.drawable.reducersocket,R.drawable.reducersocket,R.drawable.reducersocket,R.drawable.reducersocket,};
    String data []={"Nerolac Paint 20Ltr","Stainer 100gm","JK Putty 20kg","White Cement 10kg","White Cement 20kg","Plaster Of Paris 20kg","Acc Cement","Ambuja Cement","Synthetic Paint 4Ltr","Synthetic Paint 20Ltr","Red-Oxide Primer 4Ltr","Red-Oxide Primer 20Ltr","Wood Primer 4Ltr","Wood Primer 20Ltr","Lacquer Paint 1Ltr","Sealer Paint 1Ltr","Tarpeen 1Ltr","Tarpeen 4Ltr","Tarpeen 20Ltr","Thinner 1Ltr","Lakh Dana 1Kg","PlyBoard 8*4","PlyBoard 6*4","PlyBoard 6*3","PlyBoard 6*2.5","PlyWood 6mm 8*4","PlyWood 6mm 6*4","PlyWood 6mm 6*3","PlyWood 9mm 8*4","PlyWood 9mm 6*4","PlyWood 9mm 6*3","PlyWood 12mm 8*4","PlyWood 12mm 6*4","PlyWood 12mm 6*3","PlyWood 16mm 8*4","PlyWood 16mm 6*4","PlyWood 16mm 6*3","Fevicol 1Kg","Fevicol 5Kg","Nails 1'' 1Kg","Nails 1.5'' 1Kg","Nails 2'' 1Kg","Nails 2.5'' 1Kg","Nails 3'' 1Kg","Nails 4'' 1Kg","Nails 5'' 1Kg","Nails 6'' 1Kg","Water Pipe 0.5''","Water Pipe 0.75''","Water Pipe 1''","Nippel 0.5''  2''","Nippel 0.75''  2''","Nippel 1''  2''","Nippel 0.5''  3''","Nippel 0.75''  3''","Nippel 1''  3''","Nippel 0.5''  4''","Nippel 0.75''  4''","Nippel 1''  4''","Nippel 0.5''  6''","Nippel 0.75''  6''","Nippel 1''  6''","Nippel 0.5''  8''","Nippel 0.75''  8''","Nippel 1''  8''","Nippel 0.5''  12''","Nippel 0.75''  12''","Nippel 1''  12''","Elbow 0.5''","Elbow 0.75''","Elbow 1''","Elbow 1.25''","Elbow 1.50''","Socket 0.5''","Socket 0.75''","Socket 1''","Socket 1.25''","Socket 1.50''","Uniun 0.5''","Uniun 0.75''",
            "Uniun 1''","Uniun 1.25''","Uniun 1.50''","Tee 0.5''","Tee 0.75''","Tee 1''","Tee 1.25''","Tee 1.50''","Reducer 0.5'' 0.75","Reducer 0.5'' 1","Reducer 0.5'' 1.25","Reducer 0.5'' 1.50","Reducer 0.75'' 1","Reducer 0.75'' 1.25","Reducer 0.75'' 1.50","Reducer 1'' 1.25","Reducer 1'' 1.50",};

    String price  [] = {"Rs.999","Rs.99","Rs.499","Rs.399","Rs.699","Rs.449","Rs.799","Rs.399","Rs.312","Rs.699","Rs.1399","Rs.449","Rs.1699","Rs.599","Rs.2199","Rs.999","Rs.99","Rs.499","Rs.349","Rs.399","Rs.99","Rs.299","Rs.130","Rs.999","Rs.1699","Rs.1399","Rs.1449","Rs.1649","Rs.799","Rs.699","Rs.599","Rs.1199","Rs.999","Rs.899","Rs.1250","Rs.1050","Rs.965","Rs.1599","Rs.1349","Rs.1299","Rs.165","Rs.599","Rs.100","Rs.75","Rs.70","Rs.70","Rs.70","Rs.75","Rs.75","Rs.75","Rs.75","Rs.599","Rs.699","Rs.799","Rs.20","Rs.30","Rs.40","Rs.30","Rs.40","Rs.50","Rs.45","Rs.55","Rs.65","Rs.55","Rs.65","Rs.75","Rs.65","Rs.75","Rs.85","Rs.50","Rs.60","Rs.70","Rs.80","Rs.30","Rs.40","Rs.45","Rs.50","Rs.60","Rs.110","Rs.120","Rs.130","Rs.140","Rs.170","Rs.30","Rs.60","Rs.90","Rs.100","Rs.110","Rs.80","Rs.85","Rs.100","Rs.110","Rs.90","Rs.100","Rs.110","Rs.120","Rs.130"};
    private Object view;


    ProductAdapter(Context c){this.c=c;}

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater l= (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = l.inflate(R.layout.xyzproduct,null);
        ImageView i =convertView.findViewById(R.id.iv1);
        ImageView i1 =convertView.findViewById(R.id.iv2);
        ImageView iv = convertView.findViewById(R.id.iv);
        TextView t = convertView.findViewById(R.id.txt);
        TextView t1 =convertView.findViewById(R.id.price);
        TextView tv= convertView.findViewById(R.id.add);

        t1.setText(price[position]);
        t.setText(data[position]);
        iv.setImageResource(image[position]);
        return convertView;
    }


}