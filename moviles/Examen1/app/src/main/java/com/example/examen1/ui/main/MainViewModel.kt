package com.example.examen1.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.examen1.domain.useCases.DameTareasUseCase

class MainViewModel (
    private val dameTareasUseCase: DameTareasUseCase
) : ViewModel() {

    private val _state = MutableLiveData<MainState>(MainState(dameTareasUseCase.dameTareas()[0]))

    val state : LiveData<MainState> = _state

    fun handleTareas(){
        var texto = dameTareasUseCase.dameTareas()[0]
        _state.value = _state.value?.copy(texto = dameTareasUseCase.dameTareas()[0])
    }

    class MainViewModelFactory(
        private val dameTareasUseCase: DameTareasUseCase
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST") return MainViewModel(
                    dameTareasUseCase
                ) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}
