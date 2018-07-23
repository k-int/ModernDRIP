package moderndrip

import grails.gorm.transactions.Transactional

@Transactional
class RegistryService {

  def upsert(String entry_id,
             String owner_id,
             String payload,
             String signature) {
    
    log.debug("RegistryService::upsert.....");

  }
}
