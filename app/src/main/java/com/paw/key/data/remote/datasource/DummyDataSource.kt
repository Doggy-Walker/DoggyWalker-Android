package com.paw.key.data.remote.datasource

import com.paw.key.data.service.DummyService
import javax.inject.Inject

class DummyDataSource @Inject constructor (
    private val dummyService: DummyService
) {
    suspend fun getDummyList() = dummyService.getDummyLists()
}
