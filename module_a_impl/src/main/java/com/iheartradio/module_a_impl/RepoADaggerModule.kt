package com.iheartradio.module_a_impl

import com.iheartradio.module_a.RepoA
import dagger.Module
import dagger.Provides

/**
 * Created by Jonathan Muller on 2019-11-18.
 */
@Module
class RepoADaggerModule {

    @Provides
    fun providesRepoA(): RepoA {
        return RepoAImpl()
    }

}