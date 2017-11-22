package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by LG on 2017-11-07.
 */
public class f_MypageActivity extends Fragment implements View.OnClickListener {
    Button back;
    String sum;
    private Button wantSee;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment_mypage, container, false);
        wantSee=(Button)rootView.findViewById(R.id.wantSee);
        wantSee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), AddbookActivity.class);
                startActivity(intent);
            }
        });

        //밑에는 인기순 추천순처럼 나타나지만 sum을 찾아서 나타낸다.
        return rootView;
    }

    @Override
    public void onClick(View view) {

    }


}