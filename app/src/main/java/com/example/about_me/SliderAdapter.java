package com.example.about_me;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context=context;
    }

    public int[] slide_images = {
            R.drawable.welcome,
            R.drawable.welcome,
            R.drawable.welcome
    };

    public String[] slide_headings = {
            "Halo!",
            "Apa ini?",
            "Mulai!"
    };

    public String[] slide_desc = {
            "Ini adalah sebagian dari hal-hal dalam hidup saya",
            "Akan menjelaskan beberapa identitas saya seperti Profil lengkap saya, Hobby, Cita-Cita, Lagu Kesukaan, dan lain-lain",
            "Langsung aja yuk, geser ke kanan"
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view ==(RelativeLayout) o;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.imageView);
        TextView slideHeadings = (TextView) view.findViewById(R.id.textView4);
        TextView slideDesc = (TextView) view.findViewById(R.id.textView5);

        slideImageView.setImageResource(slide_images[position]);
        slideHeadings.setText(slide_headings[position]);
        slideDesc.setText(slide_desc[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((RelativeLayout)object);

    }
}
