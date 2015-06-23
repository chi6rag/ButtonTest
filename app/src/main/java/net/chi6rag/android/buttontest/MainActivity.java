package net.chi6rag.android.buttontest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity{
    Button button_click_inner_class;
    Button button_click_anonymous_inner_class_1;
    Button button_click_anonymous_inner_class_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_click_inner_class = (Button) findViewById(R.id.button_click_inner_class);
        button_click_inner_class.setOnClickListener(new ButtonActivity());

        button_click_anonymous_inner_class_1 = (Button) findViewById
                (R.id.button_click_anonymous_inner_class_1);
        button_click_anonymous_inner_class_1.setOnClickListener(ocl);

        button_click_anonymous_inner_class_2 = (Button) findViewById
                (R.id.button_click_anonymous_inner_class_2);
        button_click_anonymous_inner_class_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("chi6rag", "Clicked button_click_anonymous_inner_class_2");
            }
        });

    }

    OnClickListener ocl = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("chi6rag", "Clicked button_click_anonymous_inner_class_1");
        }
    };

    public class ButtonActivity implements OnClickListener{

        @Override
        public void onClick(View v) {
            Log.d("chi6rag", "Clicked Button: " + v.getId());
        }

    }

}