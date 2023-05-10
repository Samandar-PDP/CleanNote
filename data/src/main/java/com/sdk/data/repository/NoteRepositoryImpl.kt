package com.sdk.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.sdk.domain.model.Note
import com.sdk.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

class NoteRepositoryImpl(
    private val firebase: FirebaseFirestore
) : NoteRepository {
    private var isSuccess = false
    override suspend fun saveNote(note: Note): Flow<Boolean> = flow {
        firebase.collection("notes")
            .document()
            .set(note)
            .addOnSuccessListener {
                isSuccess = true
            }.await()
        emit(isSuccess)
    }


    override fun getAllNotes(): Flow<List<Note>> {

    }

    override suspend fun deleteNote(note: Note): Flow<Boolean> {

    }

    override suspend fun updateNote(note: Note): Flow<Boolean> {

    }
}