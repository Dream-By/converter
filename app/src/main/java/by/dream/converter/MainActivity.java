package by.dream.converter;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Конвертируем в метры
    private float convertParrotMeter(float parrot){
        return (float) (parrot / 7.6);
    }

    //Конвертируем в попугаи
    private float convertMeterParrot (float meter){
        return (float) (meter * 7.6);
    }

    public void onClick(View view) {
        RadioButton meterRadioButton = (RadioButton) findViewById(R.id.radioButtonMeter);
        EditText inputEditText = (EditText) findViewById(R.id.editText);

        if (inputEditText.getText().length()==0){
            Toast.makeText(getApplicationContext(), "Введите длину кота", Toast.LENGTH_SHORT).show();
            return;
        }

        float inputValue = Float.parseFloat(inputEditText.getText().toString());
            if (meterRadioButton.isChecked()){
                inputEditText.setText(String.valueOf(convertParrotMeter(inputValue)));
            } else {
                inputEditText.setText(String.valueOf(convertMeterParrot(inputValue)));
            }

    }
}
