package com.iheartradio.module_b

import java.util.*

/**
 * Created by Jonathan Muller on 2019-11-18.
 */
interface DataB {

    val uuid: UUID

    val following: Boolean

    val dataB: String

}

interface RepoB {

    fun init()

    fun getDataB(): DataB

}