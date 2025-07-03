package com.paw.key.domain.repository

import com.paw.key.domain.model.entity.DummyUser

interface DummyRepository {
    suspend fun getDummyList(): Result<List<DummyUser>>
}