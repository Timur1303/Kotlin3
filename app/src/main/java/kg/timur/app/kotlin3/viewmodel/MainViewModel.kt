package kg.timur.app.kotlin3.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {


    private var mCounter = 0
    private val builder = StringBuilder()
    val counter = MutableLiveData<Int?>()
    val counterText = MutableLiveData<String>()


    fun onIncrementClick(){
        builder.append(" ").append("+")
        counterText.value = builder.toString()
        counter.value = ++mCounter
    }

    fun onSubtractionClick(){
        builder.append(" ").append("-")
        counterText.value = builder.toString()
        counter.value = --mCounter
    }

    init {
        counter.postValue(0)
        counterText.postValue("")
    }
}