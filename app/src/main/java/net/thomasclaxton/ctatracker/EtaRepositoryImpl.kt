package net.thomasclaxton.ctatracker

import net.thomasclaxton.ctatracker.service.CtaService

class EtaRepositoryImpl(
  private val ctaService: CtaService,
  private val mapper: EtaDtoMapper
): CtaRepository {

  override suspend fun getEtasByStationId(stationId: Int): List<Eta> {
    val result = ctaService.getArrivalsForStation(BuildConfig.ApiKey, stationId).data.eta
    return mapper.toDomainList(result)
  }
}
