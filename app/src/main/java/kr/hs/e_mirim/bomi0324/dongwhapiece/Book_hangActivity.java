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

public class Book_hangActivity extends AppCompatActivity {

    Button left, right;
    LinearLayout background;
    int[] imgs = {R.drawable.hangstart, R.drawable.hang1, R.drawable.hang2, R.drawable.hang3,
            R.drawable.hang4, R.drawable.hang5,  R.drawable.hang6, R.drawable.hang7, R.drawable.hang8, R.drawable.hang9, R.drawable.hang10};
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hang);
        left=(Button)findViewById(R.id.left);
        right=(Button)findViewById(R.id.right);
        background=(LinearLayout)findViewById(R.id.backgroundhang);
        background.setBackgroundResource(R.drawable.hangstart);

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
                Intent intent = new Intent(Book_hangActivity.this,  MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
