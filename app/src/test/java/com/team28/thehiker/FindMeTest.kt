package com.team28.thehiker

import android.content.Intent
import android.view.View
import com.google.android.gms.maps.GoogleMap
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FindMeTest {
    @Test
    fun setMapPositionWithoutMap()
    {
        val test = FindMeActivity()
        var return_value = test.setMapPosition(0.0, 0.0)
        assert(return_value == -1)
    }

    @Test
    fun setMapPositionWithMap()
    {
        val act_ = FindMeActivity()
        //test.onCreate(null)
        var intent = act_.intent(this, FindMeActivity::class.java)
        var return_value = act_.setMapPosition(0.0, 0.0)

        assert(return_value == -1)
    }
}