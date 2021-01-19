package com.crunchapp.edit

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                arrayListOf("1", "2", "3", "4", "5", "6","1", "2", "3", "4", "5", "6"))
        val headerView = LayoutInflater.from(this).inflate(R.layout.header, listView, false)
        val etHeader = headerView.findViewById<EditText>(R.id.etComment)
        listView.addHeaderView(headerView)

        val footerView = LayoutInflater.from(this).inflate(R.layout.footer, listView, false)
        val etFooter = footerView.findViewById<EditText>(R.id.etComment)
        listView.addFooterView(footerView)

        etHeader.setOnFocusChangeListener { v, hasFocus ->
            Log.e("", "etHeader->setOnFocusChangeListener: $hasFocus")
        }
        etFooter.setOnFocusChangeListener { v, hasFocus ->
           Log.e("", "etFooter->setOnFocusChangeListener: $hasFocus")
        }

    }
}