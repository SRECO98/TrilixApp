package com.example.lolguessquiz.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ScoreModel::class],
    version = 1
)
abstract class ScoreDatabase: RoomDatabase() {
    abstract val dao: ScoreDao
}