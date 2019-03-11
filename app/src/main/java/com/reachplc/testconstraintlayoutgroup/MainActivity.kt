package com.reachplc.testconstraintlayoutgroup

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Group

class MainActivity : AppCompatActivity() {

    private val root by lazy { findViewById<ConstraintLayout>(R.id.root) }

    private val group by lazy {
        Group(this).apply {
            referencedIds = intArrayOf(R.id.button31, R.id.button32, R.id.button33, R.id.button34)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.hide_using_group).setOnClickListener {
            hideViewsUsingGroup()
        }

        findViewById<View>(R.id.hide_without_group).setOnClickListener {
            hideViewsWithoutGroup()
        }

        findViewById<View>(R.id.reset).setOnClickListener {
            reset()
        }
    }

    fun hideViewsUsingGroup() {
        root.removeView(group)
        root.addView(group)


        group.visibility = View.GONE
    }

    fun hideViewsWithoutGroup() {
        root.removeView(group)

        findViewById<View>(R.id.button31).visibility = View.GONE
        findViewById<View>(R.id.button32).visibility = View.GONE
        findViewById<View>(R.id.button33).visibility = View.GONE
        findViewById<View>(R.id.button34).visibility = View.GONE
    }

    fun reset() {
        group.visibility = View.VISIBLE

        findViewById<View>(R.id.button31).visibility = View.VISIBLE
        findViewById<View>(R.id.button32).visibility = View.VISIBLE
        findViewById<View>(R.id.button33).visibility = View.VISIBLE
        findViewById<View>(R.id.button34).visibility = View.VISIBLE
    }
}
