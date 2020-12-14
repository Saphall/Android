package com.example.miwokapp;

import android.app.Activity;
import android.media.Image;
import android.provider.Telephony;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private  int mColorResourceID;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceID){
        super(context,0,words);
        mColorResourceID=colorResourceID;
    }
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }
        Word curentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(curentWord.getmMiwokTranslation());

        TextView defaultTextView =(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(curentWord.getmDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(curentWord.hasImage()) {
            imageView.setImageResource(curentWord.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color  = ContextCompat.getColor(getContext(),mColorResourceID);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
