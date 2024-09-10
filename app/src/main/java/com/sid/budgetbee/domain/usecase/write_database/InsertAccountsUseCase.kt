package com.sid.budgetbee.domain.usecase.write_database

import com.sid.budgetbee.data.local.entity.AccountDto
import com.sid.budgetbee.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertAccountsUseCase @Inject constructor(private val repo: TransactionRepository) {

    suspend operator fun invoke(account: List<AccountDto>) {
        repo.insertAccount(account)
    }
}