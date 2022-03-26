package com.vfs.todoapp.models

import java.lang.Exception

/*
Manages all categories of tasks
 */
class TaskManager {

    var selectedCategory : Category? = null
    lateinit var categoryList : ArrayList<Category>

    fun addCategory(categoryToAdd : Category) {
        // TODO:
    }

    fun deleteCategory(CategoryToDelete : Category) {
        // TODO:
    }

    // Set the selected category and return the selected category
    fun selectCategory(index : Int) : Category {
        // TODO:
        throw Exception("temp")
    }


}