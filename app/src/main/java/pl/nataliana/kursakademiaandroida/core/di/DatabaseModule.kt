package pl.nataliana.kursakademiaandroida.core.di

import androidx.room.Room
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import pl.nataliana.kursakademiaandroida.db.MyDatabase

val databaseModule = module {

    single {
        Room.databaseBuilder(
            androidApplication(), MyDatabase::class.java, "my-database"
        ).build()
    }
}