package com.aylingunes.javafragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment { //fragmanlarla çalşırken extend fragment denir

        // görünümle çalışmak için oncreate active etmek gerekiyor
// com.yol üzerinde new Fragment dediğinde .xml dosyası ve extend hali de default eklenirdi fakat manuel yaptığımız için onCreate de dahil eklemeler yapılmalı


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_first,container,false);
        TextView textView = viewGroup.findViewById(R.id.textView);
        textView.setText("1st Fragment example");

        // return inflater olmalı--> .xml id'si bekleyen bir inflate seçelim
        return viewGroup;
    }
}
