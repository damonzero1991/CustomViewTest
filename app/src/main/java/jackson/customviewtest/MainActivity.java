package jackson.customviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import jackson.customviewtest.View.CustomGroupView;

public class MainActivity extends AppCompatActivity {

    private CustomGroupView customGroupView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customGroupView =  ((CustomGroupView)findViewById(R.id.titlebarId));
        customGroupView.setTitleText("标题多层次单");
        customGroupView.setLeftButtonListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "调回去", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
