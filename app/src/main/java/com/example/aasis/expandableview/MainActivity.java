package com.example.aasis.expandableview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class MainActivity extends AppCompatActivity {

    RadioButton btn;
    ExpandableRelativeLayout expandableRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (RadioButton)findViewById(R.id.radioButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expandableRelativeLayout = (ExpandableRelativeLayout)findViewById(R.id.btnexpand);
                expandableRelativeLayout.toggle();

            }
        });
    }
}
