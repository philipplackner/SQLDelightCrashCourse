package com.plcoding.sqldelightcrashcourse.di

import android.app.Application
import com.plcoding.sqldelightcrashcourse.PersonDatabase
import com.plcoding.sqldelightcrashcourse.data.PersonDataSource
import com.plcoding.sqldelightcrashcourse.data.PersonDataSourceImpl
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return AndroidSqliteDriver(
            schema = PersonDatabase.Schema,
            context = app,
            name = "person.db"
        )
    }

    @Provides
    @Singleton
    fun providePersonDataSource(driver: SqlDriver): PersonDataSource {
        return PersonDataSourceImpl(PersonDatabase(driver))
    }
}