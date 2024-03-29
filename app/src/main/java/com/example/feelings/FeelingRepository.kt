package com.example.feelings

import androidx.lifecycle.LiveData

class FeelingRepository (private val feelingDAO: FeelingDAO){

    val allFeeling: LiveData<Feeling> = feelingDAO.getFeelings()

    suspend fun insert(feeling: Feeling){
        feelingDAO.insertFeeling(feeling)
    }
}