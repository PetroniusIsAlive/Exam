package com.kras.androidinterntask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://restcountries.eu"

class MainActivity : AppCompatActivity() {

    private var TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getCurrentData()




    }

    private fun getCurrentData() {
  val api = Retrofit.Builder()
      .baseUrl(BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build()
      .create(ApiRequests::class.java)

        CoroutineScope(Dispatchers.IO).launch  {
            val responce = api.getWorldData().awaitResponse()
            if( responce.isSuccessful){
                val data = responce.body()!!
                Log.d(TAG, data.toString())

            }
        }



    }

}