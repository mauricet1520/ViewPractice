package com.coolreecedev.viewpractice.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(app: Application): AndroidViewModel(app) {

    val headline = MutableLiveData<String>()
    init {
        Log.i("Practice", "view created")
        headline.value = "Yo! Yo!"
    }
}