package io.mylibrary;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class CBCarolWidgetManager extends SimpleViewManager<View> {

    public static final String REACT_CLASS = "CBCarolWidget";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public View createViewInstance(final ThemedReactContext c) {
        // TODO: Implement some actually useful functionality
        AppCompatCheckBox cb = new AppCompatCheckBox(c);
        cb.setChecked(false);
        try {
            c.getCurrentActivity().startActivity(new Intent(c.getCurrentActivity(),Class.forName("io.StartActivity")));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        cb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Class.forName("com.passbase.passbase_sdk.new_design.StartScreenActivity")
//                Toast.makeText(c.getCurrentActivity(), "Ok test nao", Toast.LENGTH_SHORT).show();
//            }
//        });
        return cb;
    }
}
