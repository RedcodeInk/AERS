package com.example.aers_global.ui.catering;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CateringViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CateringViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is catering fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
