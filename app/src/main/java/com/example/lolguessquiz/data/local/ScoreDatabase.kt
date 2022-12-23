package com.example.lolguessquiz.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ScoreModelEntity::class],
    version = 2
)
abstract class ScoreDatabase: RoomDatabase() {
    abstract val dao: ScoreDao
}