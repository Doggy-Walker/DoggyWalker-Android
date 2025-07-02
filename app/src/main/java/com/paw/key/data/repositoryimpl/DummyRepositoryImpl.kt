package com.paw.key.data.repositoryimpl

import com.paw.key.data.mapper.DummyUserMapper
import com.paw.key.data.remote.datasource.DummyDataSource
import com.paw.key.domain.model.entity.DummyUser
import com.paw.key.domain.repository.DummyRepository
import javax.inject.Inject

class DummyRepositoryImpl @Inject constructor(
    private val dummyDataSource: DummyDataSource,
    private val mapper: DummyUserMapper
): DummyRepository {
    override suspend fun getDummyList(): Result<List<DummyUser>> = runCatching {
        dummyDataSource.getDummyList().data.map { mapper.mapDtoToEntity(it) }
    }
}