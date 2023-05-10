package com.sdk.domain.use_case

import com.sdk.domain.model.Note
import com.sdk.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

typealias SaveNoteBaseUseCase = BaseUseCase<Note, Flow<Boolean>>

class SaveNoteUseCase(
    private val repository: NoteRepository
) : SaveNoteBaseUseCase {
    override suspend fun invoke(parameter: Note): Flow<Boolean> {
        return repository.saveNote(parameter)
    }
}