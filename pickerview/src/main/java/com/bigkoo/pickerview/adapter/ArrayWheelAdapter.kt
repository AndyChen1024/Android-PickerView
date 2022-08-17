package com.bigkoo.pickerview.adapter

import com.contrarywind.adapter.WheelAdapter

/**
 * The simple Array wheel adapter
 * @param <T> the element type
</T> */
class ArrayWheelAdapter<T>(private val items: List<T?>?) : WheelAdapter<T> {

    //    override fun getItem(index: Int): Any {
//        return if (index >= 0 && index < items.size) {
//            items[index]
//        } else ""
//    }
//
//    override val itemsCount: Int
//        get() = items.size
//
//    override fun indexOf(o: Any?): Int {
//        return items.indexOf(o)
//    }
    override val itemsCount: Int?
        get() = items?.size

    override fun getItem(index: Int): T {
        return if (index >= 0 && index < items?.size!!) {
            items[index]!!
        } else "" as T
    }

    override fun indexOf(o: T): Int {
        return items!!.indexOf(o)
    }
}