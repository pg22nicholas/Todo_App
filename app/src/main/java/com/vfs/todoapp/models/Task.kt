package com.vfs.todoapp.models

import java.util.*
import kotlin.collections.ArrayList

/*
A single task
 */
class Task(var taskName : String, var priority : Priority) {

    var notes : ArrayList<String> = ArrayList()

    fun addNote(noteToAdd : String) {
        // TODO:
    }

    fun deleteNote(indexToDelete : Int) {
        // TODO:
    }

    enum class Priority {
        HIGH,
        MEDIUM,
        LOW
    }
}
