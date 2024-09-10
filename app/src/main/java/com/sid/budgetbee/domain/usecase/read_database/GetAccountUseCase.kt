package com.sid.budgetbee.domain.usecase.read_database

import com.sid.budgetbee.data.local.entity.AccountDto
import com.sid.budgetbee.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAccountUseCase @Inject constructor(private val repo: TransactionRepository) {

    operator fun invoke(account: String): Flow<AccountDto> {
        return repo.getAccount(account)
    }
}