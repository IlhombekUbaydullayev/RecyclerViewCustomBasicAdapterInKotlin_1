package com.example.recyclerviewinkotlin

import adapter.CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.Member

class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initView() {
         recyclerView = findViewById(R.id.recyclerView)
         recyclerView!!.layoutManager = GridLayoutManager(this,1)
    }

    private fun refreshAdapter(members: List<Member>) {
         val adapter = CustomAdapter(members)
         recyclerView!!.adapter = adapter
    }

    

    private fun prepareMemberList(): List<Member> {
         val members = ArrayList<Member>()

         for (i in 0..29) {
             members.add(Member("Ilhombek" + i,"Ubaydullayev" + i))
         }
       return members;
    }


}