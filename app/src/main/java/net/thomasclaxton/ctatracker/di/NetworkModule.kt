package net.thomasclaxton.ctatracker.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import net.thomasclaxton.ctatracker.service.CTAService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
import okhttp3.logging.HttpLoggingInterceptor

@Module
@InstallIn(ApplicationComponent::class)
class NetworkModule {
  @Provides
  @Singleton
  fun providesRetrofit(okHttpClient: OkHttpClient): CTAService {
    return Retrofit.Builder()
      .baseUrl("http://lapi.transitchicago.com/")
      .addConverterFactory(GsonConverterFactory.create())
      .client(okHttpClient)
      .build().create(CTAService::class.java)
  }

  @Provides
  @Singleton
  fun providesOkHttp(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
    return OkHttpClient.Builder()
      .addInterceptor(loggingInterceptor).build()
  }

  @Provides
  @Singleton
  fun providesLoggingInterceptor(): HttpLoggingInterceptor {
    return HttpLoggingInterceptor().apply {
      level = HttpLoggingInterceptor.Level.BODY
    }
  }
}
