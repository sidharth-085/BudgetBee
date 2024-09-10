package com.sid.budgetbee.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.sid.budgetbee.data.local.converter.DateConverter
import com.sid.budgetbee.data.local.entity.TransactionDto
import com.sid.budgetbee.data.local.entity.AccountDto

@TypeConverters(value = [DateConverter::class])
@Database(entities = [TransactionDto::class, AccountDto::class], exportSchema = true, version = 1)
abstract class TransactionDatabase: RoomDatabase() {
    abstract val transactionDao: TransactionDao
}