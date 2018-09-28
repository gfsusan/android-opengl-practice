package com.susan.openglpractice

import android.content.Context
import android.opengl.GLSurfaceView
import java.security.AccessControlContext

class MyGLSurfaceView(context: Context) : GLSurfaceView(context) {

    private val mRenderer : MyGLRenderer

    init {
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2)

        mRenderer = MyGLRenderer()

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer)
    }
}