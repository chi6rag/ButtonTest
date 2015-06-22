package net.chi6rag.android.buttontest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
    Button button_learn_more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_learn_more = (Button) findViewById(R.id.button_learn_more);
        button_learn_more.setOnClickListener(this);
    }

    public void onClick(View view){
        Log.d("chi6rag", "Learn More button is clicked");
    }

    public void handleClick(View view){
        switch(view.getId()){
            case R.id.button_learn_more:
                Log.i("chi6rag", "Learn More button was clicked");
                break;
            case R.id.button_teach:
                Log.i("chi6rag", "Teach button was clicked");
                break;
            default:
                Log.e("chi6rag", "Unidentified button clicked");
                break;
        }
    }
}