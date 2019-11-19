package com.iheartradio.module_b_impl

import android.util.Log
import com.iheartradio.module_a.RepoA
import com.iheartradio.module_b.DataB
import com.iheartradio.module_b.RepoB
import java.util.*
import javax.inject.Inject

/**
 * Created by Jonathan Muller on 2019-11-18.
 */
internal class RepoBImpl @Inject constructor(private val repoA: RepoA) : RepoB {

    override fun init() {
        repoA.init()
        Log.d("Injection Test", "Init Repo B with Repo A data: ${repoA.getDataA().dataA}")
    }

    override fun getDataB(): DataB {
        return object : DataB {

            override val uuid: UUID = UUID.randomUUID()

            override val following: Boolean = false

            override val dataB: String = "DataB"

        }
    }
}