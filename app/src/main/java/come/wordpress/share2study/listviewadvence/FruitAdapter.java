package come.wordpress.share2study.listviewadvence;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import static come.wordpress.share2study.listviewadvence.R.id.txtDescribe;
import static come.wordpress.share2study.listviewadvence.R.id.txtName;

/**
 * Created by thela on 10/9/2017.
 */

public class FruitAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Fruit> listOfFruit;

    public FruitAdapter(Context context, int layout, List<Fruit> listOfFruit) {
        this.context = context;
        this.layout = layout;
        this.listOfFruit = listOfFruit;
    }

    @Override
    public int getCount() {
        return listOfFruit.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView imgImage;
        TextView txtName, txtDescribe;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();
            viewHolder.imgImage = (ImageView) view.findViewById(R.id.imgImage);
            viewHolder.txtName = (TextView) view.findViewById(txtName);
            viewHolder.txtDescribe = (TextView) view.findViewById(txtDescribe);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Fruit fruit = listOfFruit.get(i);

        viewHolder.imgImage.setImageResource(fruit.getImage());
        viewHolder.txtName.setText(fruit.getName());
        viewHolder.txtDescribe.setText(fruit.getDescribe());
        return view;
    }
}
