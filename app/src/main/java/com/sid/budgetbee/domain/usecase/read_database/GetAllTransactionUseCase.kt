package com.sid.budgetbee.domain.usecase.read_database

import com.sid.budgetbee.data.local.entity.TransactionDto
import com.sid.budgetbee.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllTransactionUseCase @Inject constructor(private val repo: TransactionRepository) {
    operator fun invoke(): Flow<List<TransactionDto>?> {
        return repo.getAllTransaction()
    }
}