package com.doggy.walker.data.remote.datasource

import com.doggy.walker.data.service.DummyService
import javax.inject.Inject

class DummyDataSource @Inject constructor (
    private val dummyService: DummyService
) {
    suspend fun getDummyList() = dummyService.getDummyLists()
}
