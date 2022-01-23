package com.example.aers_global.ui.food_delivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.aers_global.R;
import com.example.aers_global.databinding.FragmentFoodDeliveryBinding;
import com.example.aers_global.ui.finance.FinanceViewModel;

public class FoodDeliveryFragment extends Fragment {

    private FoodDeliveryViewModel FoodDeliveryViewModel;
    private FragmentFoodDeliveryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FoodDeliveryViewModel =
                new ViewModelProvider(this).get(FoodDeliveryViewModel.class);

        binding = FragmentFoodDeliveryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFoodDelivery;
        FoodDeliveryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
