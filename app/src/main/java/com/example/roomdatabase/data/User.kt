package com.example.roomdatabase.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true) val id : String,
    @ColumnInfo(name = "firstName")val firstName:String,
    @ColumnInfo(name = "lastName")val lastName :String,
    @ColumnInfo(name = "nationalCode") val nationalCode: String
    )


