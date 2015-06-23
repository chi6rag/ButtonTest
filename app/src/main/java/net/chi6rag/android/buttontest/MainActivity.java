package net.chi6rag.android.buttontest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity{
    Button button_click_inner_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_click_inner_class = (Button) findViewById(R.id.button_click_inner_class);
        button_click_inner_class.setOnClickListener(new ButtonActivity());
    }

    public class ButtonActivity implements OnClickListener{

        @Override
        public void onClick(View v) {
            Log.d("chi6rag", "Clicked Button: " + v.getId());
        }

    }

}