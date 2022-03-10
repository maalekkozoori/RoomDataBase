package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Database
import com.example.roomdatabase.data.Word
import com.example.roomdatabase.data.WordDao
import com.example.roomdatabase.data.WordRoomDatabase
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val database by lazy { WordRoomDatabase.getDatabase(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dao =  database.wordDao()


        thread {
            dao.insert(Word(1,"maalek"))

        }
    }
}