package com.example.coroutines

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       GlobalScope.launch{
          val networkCallAnswer=doNetworkcall()
           val networkCallAnswer2=doNetworkcall2()
           Log.d(TAG,networkCallAnswer)
           Log.d(TAG,networkCallAnswer2)
        }

    }

    suspend fun doNetworkcall():String{
        delay(3000L)
        return "Netowrk call successful"
    }
    suspend fun doNetworkcall2():String{
        delay(3000L)
        return  "Network call 2 successful"
    }
}