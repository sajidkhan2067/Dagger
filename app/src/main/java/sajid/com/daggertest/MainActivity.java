package sajid.com.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject MyExample myExample;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dateTextView = findViewById(R.id.tvDate);
//        MyExample myExample = MyExample.getInstance();
      ((MyApplication) getApplication()).getMyComponent()
              .inject(MainActivity.this);

        dateTextView.setText((new Date(myExample.getDate())).toString());
    }





}
