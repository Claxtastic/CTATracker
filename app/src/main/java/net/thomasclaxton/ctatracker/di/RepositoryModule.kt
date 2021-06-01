package net.thomasclaxton.ctatracker.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.thomasclaxton.ctatracker.network.model.EtaDtoMapper
import net.thomasclaxton.ctatracker.repository.EtaRepository
import net.thomasclaxton.ctatracker.repository.EtaRepositoryImpl
import net.thomasclaxton.ctatracker.network.CtaService
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

  @Singleton
  @Provides
  fun provideEtaRepository(ctaService: CtaService, etaMapper: EtaDtoMapper): EtaRepository {
    return EtaRepositoryImpl(ctaService = ctaService, mapper = etaMapper)
  }
}