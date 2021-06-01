package net.thomasclaxton.ctatracker

import net.thomasclaxton.ctatracker.domain.EtaDto

interface CtaRepository {

  suspend fun getEtasByStationId(stationId: Int): List<Eta>
}
