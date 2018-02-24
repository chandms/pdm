package com.disarm.surakshit.pdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.github.florent37.materialtextfield.MaterialTextField;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.github.javiersantos.materialstyleddialogs.enums.Style;

public class RegisterActivity extends AppCompatActivity {
    Button btn_volunteer,btn_manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_volunteer = (Button) findViewById(R.id.btn_register_volunteer);
        btn_manager = (Button) findViewById(R.id.btn_register_manager);

        btn_volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createDialog("volunteer");
            }
        });

        btn_manager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createDialog("manager");
            }
        });

    }

    private void createDialog(final String who){
        View view = getLayoutInflater().inflate(R.layout.dialog_register,null);
        final MaterialStyledDialog dialog = new MaterialStyledDialog.Builder(this)
                .setTitle(R.string.input_password)
                .setStyle(Style.HEADER_WITH_TITLE)
                .withDarkerOverlay(true)
                .withDialogAnimation(true)
                .setCancelable(false)
                .setCustomView(view,10,20,10,20)
                .build();
        dialog.show();
        Button btn_submit = (Button) view.findViewById(R.id.btn_submit_password);
        Button btn_cancel = (Button) view.findViewById(R.id.btn_submit_cancel);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}