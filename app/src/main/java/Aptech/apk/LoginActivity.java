package Aptech.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

public class LoginActivity extends AppCompatActivity
{
    private Button mcode;
    private EditText mTel;
    private CountryCodePicker mccp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mcode=(Button) findViewById(R.id.gcode);
        mTel=(EditText) findViewById(R.id.ptel);
        mccp=(CountryCodePicker) findViewById(R.id.ccp);
    }
}
