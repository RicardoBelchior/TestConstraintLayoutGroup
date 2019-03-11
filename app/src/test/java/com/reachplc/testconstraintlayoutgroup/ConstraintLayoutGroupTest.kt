package com.reachplc.testconstraintlayoutgroup

import android.view.View
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ConstraintLayoutGroupTest {

    @Test
    fun `hide views using a ConstraintLayout Group`() {
        Robolectric.setupActivity(MainActivity::class.java).apply {
            assertViewsAreVisible()

            hideViewsUsingGroup()

            assertViewsAreGone()
        }
    }

    @Test
    fun `hide views without using ConstraintLayout Group`() {
        Robolectric.setupActivity(MainActivity::class.java).apply {
            assertViewsAreVisible()

            hideViewsWithoutGroup()

            assertViewsAreGone()
        }
    }



    ////////////////////////////////////////////////////////////////////////////

    private fun MainActivity.assertViewsAreVisible() {
        findViewById<View>(R.id.button31).shouldBeVisible()
        findViewById<View>(R.id.button32).shouldBeVisible()
        findViewById<View>(R.id.button33).shouldBeVisible()
        findViewById<View>(R.id.button34).shouldBeVisible()
    }

    private fun MainActivity.assertViewsAreGone() {
        findViewById<View>(R.id.button31).shouldBeGone()
        findViewById<View>(R.id.button32).shouldBeGone()
        findViewById<View>(R.id.button33).shouldBeGone()
        findViewById<View>(R.id.button34).shouldBeGone()
    }

    private fun View.shouldBeVisible() {
        assertEquals(View.VISIBLE, visibility)
    }

    private fun View?.shouldBeGone() {
        if (this == null) return
        assertEquals(View.GONE, visibility)
    }

}