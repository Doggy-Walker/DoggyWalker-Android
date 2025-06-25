package com.doggy.walker.data.di

import com.doggy.walker.data.repositoryimpl.DummyRepositoryImpl
import com.doggy.walker.domain.repository.DummyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsDummyRepository(
        dummyRepositoryImpl: DummyRepositoryImpl
    ): DummyRepository

}