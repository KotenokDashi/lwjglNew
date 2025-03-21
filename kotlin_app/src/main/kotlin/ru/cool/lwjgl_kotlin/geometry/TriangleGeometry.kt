package ru.cool.lwjgl_kotlin.geometry

import org.lwjgl.BufferUtils

class TriangleGeometry : Geometry(
    BufferUtils.createFloatBuffer(25).apply {
        put(
            floatArrayOf(
                -1f, -1f, 0f,   0f,0f,1f,   0f,0f,
                0f, 1f, 0f,     0f,0f,1f,   0f,0.5f,
                1f, -1f, 0f,    0f,0f,1f,   1f,1f
            )
        )
        flip()
    },
    BufferUtils.createIntBuffer(3).apply {
        put(
            intArrayOf(
                0, 1, 2
            )
        )
        flip()
    },
    true,
    true
)