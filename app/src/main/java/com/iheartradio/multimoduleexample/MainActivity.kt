package com.iheartradio.multimoduleexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.iheartradio.module_a.RepoA
import com.iheartradio.module_a_impl.RepoADaggerModule
import com.iheartradio.module_b.RepoB
import com.iheartradio.module_b_impl.RepoBDaggerModule
import dagger.Component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repoA: RepoA

    @Inject
    lateinit var repoB: RepoB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)


        repoA.init()
        repoB.init()

        Log.d("Injection Test", "Data from RepoA: ${repoA.getDataA().dataA}")
        Log.d("Injection Test", "Data from RepoB: ${repoB.getDataB().dataB}")
    }
}


@Component(modules = [
    RepoADaggerModule::class,
    RepoBDaggerModule::class
])
interface AppComponent {

    fun inject(activity: MainActivity)

}
