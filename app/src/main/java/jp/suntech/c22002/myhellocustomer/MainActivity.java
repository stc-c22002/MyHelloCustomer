package jp.suntech.c22002.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンオブジェクトの用意
        Button btClick =findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        HelloListener listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);

        //name
        Button btClearName=findViewById(R.id.btClearName);
        //クリアにリスナ設定
        btClearName.setOnClickListener(listener);

        //address
        Button btClearAddress=findViewById(R.id.btClearAddress);
        //クリアにリスナ設定
        btClearAddress.setOnClickListener(listener);
    }

    //ボタンをクリックした時のリスナクラス
    private class HelloListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            //オブジェクト取得name
            EditText inputName =findViewById(R.id.etName);
            //オブジェクト取得address
            EditText inputAddress =findViewById(R.id.etAddress);
            TextView output = findViewById(R.id.tvOutput);

            int id=v.getId();

            //表示ボタン
            if(id==R.id.btClick){
                String inputStrName = inputName.getText().toString();
                String inputStrAddress = inputAddress.getText().toString();
                output.setText(inputStrAddress+"にお住いの"+inputStrName+"さん、こんにちは！");
            }else if(id==R.id.btClearName){
                inputName.setText("");
            }else if(id==R.id.btClearAddress){
                inputAddress.setText("");
            }
        }
    }
}