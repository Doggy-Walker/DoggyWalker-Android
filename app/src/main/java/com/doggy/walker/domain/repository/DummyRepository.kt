package com.doggy.walker.domain.repository

import com.doggy.walker.domain.model.entity.DummyUser


interface DummyRepository {
    suspend fun getDummyList(): Result<List<DummyUser>>
}