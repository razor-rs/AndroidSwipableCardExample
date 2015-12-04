package wxj.swipeablecardstack;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CardsDataAdapter extends ArrayAdapter<String> {

    public CardsDataAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, final View contentView, ViewGroup parent){
//        TextView v = (TextView)(contentView.findViewById(R.id.content));
//        v.setText(getItem(position));

        ImageView img = (ImageView)(contentView.findViewById(R.id.image));



            Picasso.with(getContext()).load(getItem(position)).fit().centerCrop().into(img);


        return contentView;
    }

}

