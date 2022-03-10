package com.example.roomdatabase.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface UserDao {


        @Query("SELECT * FROM word_table ORDER BY word ASC")
        fun getAlphabetizedWords(): List<Word>

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        fun insert(vararg user : User)

        @Query("DELETE FROM word_table")
        fun deleteAll()



}