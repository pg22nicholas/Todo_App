package com.vfs.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vfs.todoapp.models.Category
import com.vfs.todoapp.models.Task

/*
Entrance point of the app
 */
class MainActivity : AppCompatActivity(), TaskCategorySelected {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Create Fragment to show list of tasks/categories
    }

    override fun onTaskSelected(selectedTask: Task) {
        TODO("Not yet implemented")
    }

    override fun onCategorySelected(selectedCategory: Category) {
        TODO("Not yet implemented")
    }
}