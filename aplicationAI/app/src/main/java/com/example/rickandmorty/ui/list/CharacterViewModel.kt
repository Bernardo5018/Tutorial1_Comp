package com.example.rickandmorty.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.data.model.Character
import com.example.rickandmorty.data.repository.CharacterRepository
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel() {
    private val repository = CharacterRepository()

    private val _characters = MutableLiveData<List<Character>>()
    val characters: LiveData<List<Character>> = _characters

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _error = MutableLiveData<String?>()
    val error: LiveData<String?> = _error

    fun loadCharacters(page: Int = 1) {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                val response = repository.getCharacters(page)
                if (response.isSuccessful) {
                    _characters.value = response.body()?.results ?: emptyList()
                    _error.value = null
                } else {
                    _error.value = "Error fetching characters: ${response.code()}"
                }
            } catch (e: Exception) {
                _error.value = "Error: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }
}
