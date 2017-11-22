package kr.hs.e_mirim.bomi0324.dongwhapiece;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;


/**
 * Created by LG on 2017-11-07.
 */
public class f_MypageActivity extends Fragment implements View.OnClickListener {
    Button back;
    String uid;
    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference fb;
    private Button wantSee;
    TextView tname,tag;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment_mypage, container, false);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // Name, email address, and profile photo Url
            String name = user.getDisplayName();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();

            // Check if user's email is verified
            boolean emailVerified = user.isEmailVerified();

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            uid = user.getUid();
        }

        fb=databaseReference.child("userData").child(uid).child("nickname");
        wantSee=(Button)rootView.findViewById(R.id.wantSee);
        tname=(TextView)rootView.findViewById(R.id.nameText);
        tag=(TextView)rootView.findViewById(R.id.tagText);


        //밑에는 인기순 추천순처럼 나타나지만 sum을 찾아서 나타낸다.
        return rootView;
    }

    @Override
    public void onClick(View view) {

    }
    @Override
    public void onStart() {
        super.onStart();
        fb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name=dataSnapshot.getValue(String.class);
                tname.setText(name);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


}