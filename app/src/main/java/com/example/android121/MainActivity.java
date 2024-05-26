package com.example.android121;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse("content://com.example.android12.provider/data");
        Cursor cursor = getContentResolver()
                .query(uri, null, null, null, null);

        if (cursor != null) {
            while (cursor.moveToNext()) {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
                String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                // use later
            }
            cursor.close();
        }
    }
}