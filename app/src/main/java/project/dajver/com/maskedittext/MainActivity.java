package project.dajver.com.maskedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import project.dajver.com.maskedittext.view.MaskedEditText;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.phone)
    MaskedEditText maskedEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
