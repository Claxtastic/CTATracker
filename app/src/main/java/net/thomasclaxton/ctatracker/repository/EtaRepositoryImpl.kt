package net.thomasclaxton.ctatracker.repository

import net.thomasclaxton.ctatracker.BuildConfig
import net.thomasclaxton.ctatracker.network.model.Eta
import net.thomasclaxton.ctatracker.network.CtaService
import net.thomasclaxton.ctatracker.network.model.EtaDtoMapper

class EtaRepositoryImpl(
  private val ctaService: CtaService,
  private val mapper: EtaDtoMapper
): EtaRepository {

  override suspend fun getEtasByStationId(stationId: Int): List<Eta> {
    val result = ctaService.getArrivalsForStation(BuildConfig.ApiKey, stationId).data.eta
    return mapper.toDomainList(result)
  }
}
