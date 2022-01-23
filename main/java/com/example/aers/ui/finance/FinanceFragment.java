package com.example.aers_global.ui.finance;

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
import com.example.aers_global.databinding.FragmentFinanceBinding;
import com.example.aers_global.ui.finance.FinanceViewModel;

public class FinanceFragment extends Fragment {

    private FinanceViewModel dashboardViewModel;
    private FragmentFinanceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(FinanceViewModel.class);

        binding = FragmentFinanceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFinance;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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
