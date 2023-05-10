package com.sdk.domain.repository

import com.sdk.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun saveNote(note: Note): Flow<Boolean>
    fun getAllNotes(): Flow<List<Note>>
    suspend fun deleteNote(note: Note): Flow<Boolean>
    suspend fun updateNote(note: Note): Flow<Boolean>
}