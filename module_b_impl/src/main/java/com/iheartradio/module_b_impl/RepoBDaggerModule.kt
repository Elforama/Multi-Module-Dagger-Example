package com.iheartradio.module_b_impl

import com.iheartradio.module_a.RepoA
import com.iheartradio.module_b.RepoB
import dagger.Module
import dagger.Provides

/**
 * Created by Jonathan Muller on 2019-11-18.
 */
@Module
class RepoBDaggerModule {

    @Provides
    fun providesRepoB(repoA: RepoA): RepoB {
        return RepoBImpl(repoA)
    }

}