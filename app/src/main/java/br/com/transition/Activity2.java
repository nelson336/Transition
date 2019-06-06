package br.com.transition;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.transition.Fade;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    private AppCompatImageView ivAct2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        setTitle("Activity 2");

        ivAct2 = findViewById(R.id.ivAct2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Utils.transitionFadeActivity(getWindow());
            ivAct2.setTransitionName(Constants.TRANSITION_NAME);
        }
    }


}
