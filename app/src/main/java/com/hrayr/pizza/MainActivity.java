package com.hrayr.pizza;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity {
        RecyclerView rv;
        GridLayoutManager glm;
        pizza piz;
        CaptionedImagesAdapter cia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.pizza_recycler);
        glm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(glm);
        cia = new CaptionedImagesAdapter(piz);
        rv.setAdapter(cia);
}
}