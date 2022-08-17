package com.bigkoo.pickerview.adapter

import com.contrarywind.adapter.WheelAdapter
import java.lang.Exception

/**
 * Numeric Wheel adapter.
 */
class NumericWheelAdapter
/**
 * Constructor
 * @param minValue the wheel min value
 * @param maxValue the wheel max value
 */(private val minValue: Int, private val maxValue: Int) : WheelAdapter<Any?> {
    override fun getItem(index: Int): Any {
        return if (index in 0 until itemsCount) {
            minValue + index
        } else 0
    }

    override val itemsCount: Int
        get() = maxValue - minValue + 1

    override fun indexOf(o: Any?): Int {
        return try {
            o as Int - minValue
        } catch (e: Exception) {
            -1
        }
    }
}