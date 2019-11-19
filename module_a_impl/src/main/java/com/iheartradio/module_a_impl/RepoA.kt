package com.iheartradio.module_a_impl

import android.util.Log
import com.iheartradio.module_a.DataA
import com.iheartradio.module_a.RepoA
import javax.inject.Inject

/**
 * Created by Jonathan Muller on 2019-11-18.
 */
internal class RepoAImpl @Inject constructor() : RepoA {

    override fun init() {
        Log.d("Injection Test", "Init Repo A")
    }

    override fun getDataA(): DataA {
        return object : DataA {

            override val id: String = "ID"

            override val date: Long = 1234

            override val dataA: String = "DataA"
        }
    }
}