package com.example.beatboxkotlin

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel(private val beatBox: BeatBox): BaseObservable() {
    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }

    var sound: Sound? = null
    set(sound){
        field = sound
        notifyPropertyChanged(BR.title)
    }

    @get:Bindable
    val title: String?
    get() = sound?.name


}