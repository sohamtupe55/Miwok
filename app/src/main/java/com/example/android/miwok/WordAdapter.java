package com.example.android.miwok;

import android.app.Activity;
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
    int mCategoryColor;
    public WordAdapter(Activity context, ArrayList<Word>words,int CategoryColor)
    {
        super(context,0,words);
        mCategoryColor=CategoryColor;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord=getItem(position);
        ImageView imageView=listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mCategoryColor);
        textContainer.setBackgroundColor(color);
        TextView miwokTextView=listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokranTslation());

        TextView defaultTextView=listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        return listItemView;
    }

}
