package net.thomasclaxton.ctatracker

import net.thomasclaxton.ctatracker.domain.EtaDto
import net.thomasclaxton.ctatracker.domain.util.DomainMapper

class EtaDtoMapper : DomainMapper<EtaDto, Eta> {
  override fun mapToDomainModel(model: EtaDto): Eta {
    return Eta(
      stationId = model.stationId,
      stopId = model.stopId,
      stationName = model.stationName,
      stopDirection = model.stopDirection,
      runNumber = model.runNumber,
      rt = model.rt,
      destinationStop = model.destinationStop,
      destName = model.destName,
      trDr = model.trDr,
      prdt = model.prdt,
      arrivalTime = model.arrivalTime,
      isApp = model.isApp,
      isSch = model.isSch,
      isDly = model.isDly,
      isFlt = model.isFlt,
      flags = model.flags,
      lat = model.lat,
      lon = model.lon,
      heading = model.heading
    )
  }

  override fun mapFromDomainModel(domainModel: Eta): EtaDto {
    return EtaDto(
      stationId = domainModel.stationId,
      stopId = domainModel.stopId,
      stationName = domainModel.stationName,
      stopDirection = domainModel.stopDirection,
      runNumber = domainModel.runNumber,
      rt = domainModel.rt,
      destinationStop = domainModel.destinationStop,
      destName = domainModel.destName,
      trDr = domainModel.trDr,
      prdt = domainModel.prdt,
      arrivalTime = domainModel.arrivalTime,
      isApp = domainModel.isApp,
      isSch = domainModel.isSch,
      isDly = domainModel.isDly,
      isFlt = domainModel.isFlt,
      flags = domainModel.flags,
      lat = domainModel.lat,
      lon = domainModel.lon,
      heading = domainModel.heading
    )
  }

  fun toDomainList(initial: List<EtaDto>): List<Eta> {
    return initial.map { mapToDomainModel(it) }
  }

  fun fromDomainList(initial: List<Eta>): List<EtaDto> {
    return initial.map { mapFromDomainModel(it) }
  }
}
