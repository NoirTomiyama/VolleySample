package jp.tomiyama.noir.volleysample

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class VolleyApplication : Application() {
    companion object {
        lateinit var instance: VolleyApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

}