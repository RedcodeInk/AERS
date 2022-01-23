package com.example.aers_global.ui.food_delivery;




import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FoodDeliveryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FoodDeliveryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Finance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
