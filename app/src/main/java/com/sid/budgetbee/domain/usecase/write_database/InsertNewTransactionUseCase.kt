package com.sid.budgetbee.domain.usecase.write_database

import com.sid.budgetbee.data.local.entity.TransactionDto
import com.sid.budgetbee.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertNewTransactionUseCase @Inject constructor(private val repo: TransactionRepository) {

    suspend operator fun invoke(dailyExpense: TransactionDto) {
        repo.insertTransaction(dailyExpense)
    }
}