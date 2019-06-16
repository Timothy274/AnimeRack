package com.example.animerack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainGrid = findViewById(R.id.mainGrid);

        //event
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalT = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    if (finalT==0){
                        Intent intent = new Intent(MainActivity.this,AnimeStorage.class);
                        startActivity(intent);
                    }
                    else if (finalT==1){
                        Intent intent = new Intent(MainActivity.this,AnimeInputStorageOffline.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
