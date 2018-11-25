package com.glintec.app.userpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnOp;
    private EditText et1, et2;
    private String validUser = "glintec";
    private  String validPassword = "glintec1315";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOp = findViewById(R.id.btnOPERAR);
        et1=findViewById(R.id.edTxtUSUARIO);
        et2=findViewById(R.id.edTxtPASSWORD);

        View.OnClickListener cL = new  View.OnClickListener(){

            @Override
            public void onClick(View v) {
                checar();
            }
        };

        btnOp.setOnClickListener(cL);
    }

    private void checar(){
        String username= et1.getText().toString();
        String userpassword=et2.getText().toString();

        if(userpassword.length()==0){
            Toast.makeText(this,"Ingresa contraseña", Toast.LENGTH_LONG).show();
        }else{
            if(username.equals(validUser) &&  userpassword.equals(validPassword)){
                Toast.makeText(this,"Has puesto contraseña",Toast.LENGTH_LONG).show();
                Toast.makeText(this,"Password y Usuario correctos!!",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Password o Usuario Incorrectos!!!",Toast.LENGTH_LONG).show();
            }


        }


    }
}
