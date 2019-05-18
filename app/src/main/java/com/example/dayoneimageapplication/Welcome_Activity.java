package com.example.dayoneimageapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_Activity extends AppCompatActivity {
    Button show_images,show_sliders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_);
        initialize();
        operation_on_welcome();
    }

    private void operation_on_welcome() {
    //go to the images activity
        show_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent images=new Intent(Welcome_Activity.this,MainActivity.class);
                startActivity(images);
            }
        });

        //go to the images activity
        show_sliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent slider=new Intent(Welcome_Activity.this,Second_activity.class);
                startActivity(slider);
            }
        });
    }
    private void initialize() {
    //define the button in the welcome activity
        show_images=findViewById(R.id.show_image);
        show_sliders=findViewById(R.id.show_slider);
    }
}
