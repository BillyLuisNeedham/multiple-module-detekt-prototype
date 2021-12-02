package com.billyluisneedham.multiplemoduledetektprototype.dataandroid.repositories.count

import com.billyluisneedham.multiplemoduledetektprototype.data.repository.count.CountLocalDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class BindCountLocalDataSource {

    @Binds
    abstract fun bindInMemoryCountLocalDataSource(source: InMemoryCountLocalDataSource): CountLocalDataSource
}