package com.example.finalproject1.ui.About;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.finalproject1.R;
import com.example.finalproject1.databinding.FragmentAboutBinding;

public class AboutFragment extends Fragment {

    private FragmentAboutBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        Button btnmail = binding.mail;
        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_SEND);
                i1.setType("text/plain");
                i1.putExtra(Intent.EXTRA_EMAIL,new String[]{"aslanahmetburak40@gmail.com"});
                if (i1.resolveActivity(getActivity().getPackageManager())!= null)
                {
                  startActivity(i1);
                }
            }
        });

        Button btngithub = binding.github;
        btngithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url2 = "https://github.com/Burak2110";
                Intent i3 = new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse(url2));
                startActivity(i3);
            }
        });
         return root;
    }
    @Override
    public  void onDestroyView(){
        super.onDestroyView();
        binding=null;
    }
}