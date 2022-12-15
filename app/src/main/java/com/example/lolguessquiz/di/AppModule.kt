package com.example.lolguessquiz.di

import android.app.Application
import androidx.room.Room
import com.example.lolguessquiz.data.local.ScoreDao
import com.example.lolguessquiz.data.local.ScoreDatabase
import com.example.lolguessquiz.data.repository.QuizRepositoryImpl
import com.example.lolguessquiz.domain.repository.QuizRepository
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
            "score.db",
        ).build()
    }

    @Provides
    @Singleton
    fun provideQuizRepository(db: ScoreDatabase): QuizRepository{
        return QuizRepositoryImpl(db.dao)
    }
}