package com.doggy.walker.data.repositoryimpl

import com.doggy.walker.data.mapper.DummyUserMapper
import com.doggy.walker.data.remote.datasource.DummyDataSource
import com.doggy.walker.domain.model.entity.DummyUser
import com.doggy.walker.domain.repository.DummyRepository
import javax.inject.Inject

class DummyRepositoryImpl @Inject constructor(
    private val dummyDataSource: DummyDataSource,
    private val mapper: DummyUserMapper
): DummyRepository {
    override suspend fun getDummyList(): Result<List<DummyUser>> = runCatching {
        dummyDataSource.getDummyList().data.map { mapper.mapDtoToEntity(it) }
    }
}