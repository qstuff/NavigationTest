package com.kmb.navigationtest.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardDetailViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Here are the details"
    }
    val text: LiveData<String> = _text
}