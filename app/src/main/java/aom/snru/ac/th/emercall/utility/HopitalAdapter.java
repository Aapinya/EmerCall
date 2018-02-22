package aom.snru.ac.th.emercall.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Admin on 22/2/2561.
 */

public class HopitalAdapter extends BaseAdapter{

    //    Explicit
    private Context context;
    private int[] ints;
    private String[] titleStrings, poneStrings;

    public HopitalAdapter(Context context, int[] ints, String[] titleStrings, String[] poneStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.poneStrings = poneStrings;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



        return null;
    }
} // Main Class
