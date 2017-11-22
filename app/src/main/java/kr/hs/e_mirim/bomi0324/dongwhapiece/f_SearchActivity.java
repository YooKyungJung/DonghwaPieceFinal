package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by LG on 2017-11-07.
 */
public class f_SearchActivity extends Fragment implements View.OnClickListener {
    Button back;
    String sum;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment_search, container, false);

        //밑에는 인기순 추천순처럼 나타나지만 sum을 찾아서 나타낸다.
        return rootView;
    }

    @Override
    public void onClick(View view) {

    }
}