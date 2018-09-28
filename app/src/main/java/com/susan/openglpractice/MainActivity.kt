package com.susan.openglpractice

import android.opengl.GLSurfaceView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var mGLView: GLSurfaceView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        mGLView = MyGLSurfaceView(this)
        setContentView(mGLView)
    }
}
