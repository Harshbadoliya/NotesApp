package com.example.notesapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class NotesViewModel : ViewModel() {

    // Holds list of notes
    private val _notes = MutableStateFlow<List<Note>>(emptyList())

    // Exposed to UI
    val notes: StateFlow<List<Note>> = _notes

    // Function to add a new note
    fun addNote(title: String, body: String) {
        val newNote = Note(
            title = title,
            body = body
        )
        _notes.value = listOf(newNote) + _notes.value
    }
}
