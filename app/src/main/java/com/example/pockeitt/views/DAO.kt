package com.example.pockeitt.views


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pockeitt.models.IncomeExpense
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


@Dao
interface IncomeDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertIncomeExpense(incomeExpense: IncomeExpense)


    @Query("SELECT * FROM income_expense")
    fun getIncomeExpense(): List<IncomeExpense>


}

