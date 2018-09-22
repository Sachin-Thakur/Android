package `in`.co.thakur.demokotlin

import android.app.Activity
import android.content.Context
import android.widget.Toast


fun Context.showToast(message:String){

    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}