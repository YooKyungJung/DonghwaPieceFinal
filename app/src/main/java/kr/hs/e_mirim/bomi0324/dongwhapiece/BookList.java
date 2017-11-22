package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by YookyungJung on 2017-11-21.
 */

public class BookList extends Fragment implements View.OnClickListener{
    private ArrayList<BookItem> data=null;
    @SuppressLint("MissingSuperCall")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.book_list,container, false);
        ListView listView=(ListView)rootView.findViewById(R.id.book_listview);


        data=new ArrayList<>();

        BookItem b1=new BookItem(R.drawable.profile, "메리","안녕달","사계절");
        BookItem b2=new BookItem(R.drawable.profile, "아빠 무릎은 내 자리","나은경","킨더랜드");
        BookItem b3=new BookItem(R.drawable.profile, "지난 여름","김지현","웅진주니어");
        BookItem b4=new BookItem(R.drawable.profile,  "이렇게 멋진 날","리처드 잭슨","비룡소");
        BookItem b5=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");
        BookItem b6=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");
        BookItem b7=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");
        BookItem b8=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");
        BookItem b9=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");
        BookItem b10=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");
        BookItem b11=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");
        BookItem b12=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");

        data.add(b1);  data.add(b2); data.add(b3); data.add(b4); data.add(b5); data.add(b6);
        data.add(b7);  data.add(b8); data.add(b9); data.add(b10); data.add(b11); data.add(b12);

        BookAdapter adapter=new BookAdapter(this.getContext(), R.layout.book_item, data);
        listView.setAdapter(adapter);

      /*  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(), BookClicked.class);
                intent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                intent.putExtra("BookName", data.get(position).getBookName());
                intent.putExtra("writer", data.get(position).getWriter());
                intent.putExtra("publisher", data.get(position).getPublisher());

                startActivity(intent);
            }
        });*/
      return rootView;
    }
    @Override
    public void onClick(View v) {

    }
}
