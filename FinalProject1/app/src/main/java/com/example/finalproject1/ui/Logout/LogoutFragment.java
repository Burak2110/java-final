package com.example.finalproject1.ui.Logout;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.finalproject1.OpenView;
import com.example.finalproject1.R;
import com.example.finalproject1.databinding.FragmentAboutBinding;
import com.example.finalproject1.databinding.FragmentLogoutBinding;
import com.google.firebase.auth.FirebaseAuth;


public class LogoutFragment extends Fragment {

    private FragmentLogoutBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLogoutBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        Button btnlogout = binding.logout;
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

                startActivity(new Intent(getActivity(),OpenView.class));
                getActivity().finish();
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