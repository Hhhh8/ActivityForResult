package mobile.hyejin.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 2017-04-19.
 */

public class Activity2 extends ActionBarActivity {
    EditText edit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);


        edit = (EditText) findViewById(R.id.edit);
        Button button_ok = (Button) findViewById(R.id.Button_ok);
        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("INPUT_TEXT",edit.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        Button button_cancel = (Button) findViewById(R.id.Button_cancel);
        button_cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}