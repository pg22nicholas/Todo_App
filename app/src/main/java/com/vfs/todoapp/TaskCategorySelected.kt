package com.vfs.todoapp

import com.vfs.todoapp.models.Category
import com.vfs.todoapp.models.Task

interface TaskCategorySelected {

    fun onTaskSelected(selectedTask: Task)

    fun onCategorySelected(selectedCategory : Category)
}