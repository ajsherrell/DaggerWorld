package com.example.android.di

import com.example.android.dagger.storage.FakeStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class TestStorageModule {
    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}