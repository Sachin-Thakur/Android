package `in`.co.thakur.demokotlin.activities

import `in`.co.thakur.demokotlin.R
import `in`.co.thakur.demokotlin.showToast
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class  SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
         val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")
        showToast(msg)
        txvUserMessage.text =  msg
    }
}