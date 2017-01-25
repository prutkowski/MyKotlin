package com.pawelrutkowski.mykotlin.Commons.Adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

interface DelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun onBindViewHolder(holder: RecyclerView.ViewHolder, recyclerViewItem: RecyclerViewItem)
}