package news.pioneer.com.mydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btn_system)
    Button btnSystem;
    @BindView(R.id.btn_dynamic)
    Button btnDynamic;
    @BindView(R.id.btn_third)
    Button btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }



    @OnClick({R.id.btn_system, R.id.btn_dynamic, R.id.btn_third})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_system:
                startActivity(new Intent(MainActivity.this, SystemActivity.class));
                break;
            case R.id.btn_dynamic:
                startActivity(new Intent(MainActivity.this, DynamicActivity.class));
                break;
            case R.id.btn_third:
                startActivity(new Intent(MainActivity.this, ThirdActivity.class));
                break;
        }
    }
}
