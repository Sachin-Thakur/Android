package `in`.co.thakur.demokotlin.activities

import `in`.co.thakur.demokotlin.adapters.HobbiesAdapter
import `in`.co.thakur.demokotlin.R
import `in`.co.thakur.demokotlin.models.Supplier
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hobbies.*


class HobbiesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hobbies)
    setupRecyclerView()
    }
    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager =layoutManager
        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
    }

}