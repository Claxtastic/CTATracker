package net.thomasclaxton.ctatracker.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.thomasclaxton.ctatracker.CtaTrackerApp
import net.thomasclaxton.ctatracker.network.model.EtaDtoMapper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

  @Singleton
  @Provides
  fun provideApplication(@ApplicationContext app: Context): CtaTrackerApp {
    return app as CtaTrackerApp
  }

  @Singleton
  @Provides
  fun provideEtaDtoMapper(): EtaDtoMapper {
    return EtaDtoMapper()
  }
}
