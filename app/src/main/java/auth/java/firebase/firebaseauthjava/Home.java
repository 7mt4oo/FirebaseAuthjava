package auth.java.firebase.firebaseauthjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void buLogout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(Home.this, LoginActivity.class));
        finish();


    }
}
