package com.example.dayoneimageapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Second_activity extends AppCompatActivity {
    //define the index and he array of images
    int index=0;
    int[] images=new int[]{R.drawable.image_one,R.drawable.image_two,R.drawable.image_three,R.drawable.image_four};
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
    }
    public void slide(View view){
        //define the imageview slide
        imageView=findViewById(R.id.image_slider);
        //change the image when the button is click
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_animation);
        imageView.startAnimation(animation);
        imageView.setImageResource(images[index]);
        index++;
        //reset the index to 0
        if(index==images.length)
        {
            index=0;
        }

    }
}
