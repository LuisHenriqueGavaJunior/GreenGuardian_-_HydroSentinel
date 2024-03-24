package com.luis.pi_app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;

public class ModalTutorial extends Dialog {

    private Context mContext;

    public ModalTutorial(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.modal_tutorial);
    }
}