package com.vfs.todoapp.models

/*
Manages a list of collective tasks
 */
class Category(var name: String = "No Category") {

    lateinit var taskList : ArrayList<Task>

    fun addTask(taskToAdd: Task) {
        // TODO:
    }

    fun deleteTask(taskToDelete : Task) {
        // TODO:
    }

}