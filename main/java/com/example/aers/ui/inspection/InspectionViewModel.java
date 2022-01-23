package com.example.aers_global.ui.inspection;



import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InspectionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InspectionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Finance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
