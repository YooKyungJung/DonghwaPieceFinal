package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Student on 2017-11-09.
 */

public class Book_eActivity extends AppCompatActivity {

    Button left, right;
    LinearLayout background;
    int[] imgs = {R.drawable.estart, R.drawable.e1, R.drawable.e2, R.drawable.e3,
            R.drawable.e4, R.drawable.e5,  R.drawable.e6,  R.drawable.e8, R.drawable.e9, R.drawable.e10};
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e);
        left=(Button)findViewById(R.id.left);
        right=(Button)findViewById(R.id.right);
        background=(LinearLayout)findViewById(R.id.backgrounde);
        background.setBackgroundResource(R.drawable.estart);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt!=0) cnt--;
                background.setBackgroundResource(imgs[cnt]);
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt<(imgs.length-1))cnt++;
                background.setBackgroundResource(imgs[cnt]);
            }
        });

        Button btn_prev =(Button)findViewById(R.id.back);
        btn_prev.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(Book_eActivity.this,  MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
