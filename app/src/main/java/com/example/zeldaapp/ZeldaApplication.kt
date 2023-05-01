package com.example.zeldaapp

import android.app.Application
import androidx.databinding.ktx.BuildConfig
import com.example.zeldaapp.category.di.CategoryDi
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class ZeldaApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(if (BuildConfig.DEBUG) org.koin.core.logger.Level.ERROR else org.koin.core.logger.Level.NONE)
            androidContext(androidContext = this@ZeldaApplication)

            loadKoinModules(CategoryDi.module)
        }
    }

}