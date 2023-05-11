package com.nora.mytodo.ui.add_edit_todo

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.nora.mytodo.data.Todo
import com.nora.mytodo.data.TodoRepository
import com.nora.mytodo.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class AddEditTodoViewModel @Inject constructor(
    private val repository: TodoRepository,
    savedStateHandle: SavedStateHandle
): ViewModel(){
    var todo = mutableListOf<Todo?>(null)
    private set

    var title = mutableStateOf("")
    private set

    var description = mutableStateOf("")
        private set

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    init {

    }
}