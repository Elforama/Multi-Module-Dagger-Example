package com.iheartradio.module_a

/**
 * Created by Jonathan Muller on 2019-11-18.
 */
interface DataA {

    val id: String

    val date: Long

    val dataA: String

}

interface RepoA {

    fun init()

    fun getDataA(): DataA

}