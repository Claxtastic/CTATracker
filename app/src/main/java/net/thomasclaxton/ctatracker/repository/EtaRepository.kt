package net.thomasclaxton.ctatracker.repository

import net.thomasclaxton.ctatracker.network.model.Eta

interface EtaRepository {

  suspend fun getEtasByStationId(stationId: Int): List<Eta>
}
