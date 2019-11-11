package com.example.androidvolleyexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),IVolley {

    override fun onResponse(response: String) {
        //show Toast
        Toast.makeText(this@MainActivity,""+response,Toast.LENGTH_LONG).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        *  https://jsonplaceholder.typicode.com/
        * */

        btn_get.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity,this@MainActivity)
                .getMethod("https://jsonplaceholder.typicode.com/todos/1")

        }

        btn_post.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity,this@MainActivity)
                .postRequest("https://jsonplaceholder.typicode.com/posts")

        }

        btn_put.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity,this@MainActivity)
                .putRequest("https://jsonplaceholder.typicode.com/posts/1")

        }

        btn_post.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity,this@MainActivity)
                .postRequest("https://jsonplaceholder.typicode.com/posts")

        }

        btn_patch.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity,this@MainActivity)
                .patchRequest("https://jsonplaceholder.typicode.com/posts/1")

        }

        btn_delete.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity,this@MainActivity)
                .deleteRequest("https://jsonplaceholder.typicode.com/posts/1")

        }

        btn_image_loader.setOnClickListener {
            image_view.setImageUrl("https://www.w3schools.com/tags/img_pink_flowers.jpg",
                MyVolleyRequest.getInstance(this@MainActivity).imageLoader)
        }
    }
}
