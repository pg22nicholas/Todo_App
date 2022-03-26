package com.vfs.todoapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/*
Deals with the list of Categories and their tasks through a task manager.
Swaps between showing a list of Tasks and a list of categories.
 */
class TaskCategoryListFragment : Fragment() {

    lateinit var listClickListener : TaskCategorySelected;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task_category_list, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listClickListener = context as TaskCategorySelected
    }
}