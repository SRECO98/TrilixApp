package com.example.lolguessquiz.di

import android.app.Application
import androidx.room.Room
import com.example.lolguessquiz.data.local.ScoreDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideStockDatabase(app: Application): ScoreDatabase{
        return Room.databaseBuilder(
            app,
            ScoreDatabase::class.java,
            "stockdb.db",
        ).build()
    }

}