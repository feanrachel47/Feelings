package com.example.feelings

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "Feeling")
data class Feeling(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val mode: Int,
    val created_at: Date,
    val remarks: String
) {

}