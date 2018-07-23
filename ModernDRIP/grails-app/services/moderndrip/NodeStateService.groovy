package moderndrip

import grails.gorm.transactions.Transactional
import javax.annotation.PostConstruct

@Transactional
class NodeStateService {

  String nodeid

  @PostConstruct
  def bootstrap() {

    log.debug("NodeStateService::bootstrap()");

    def nodeid_setting = Setting.findByKey('nodeid')
    if ( nodeid_setting == null ) {
      log.debug("New node setup, generating nodeid");
      nodeid_setting = new Setting(key:'nodeid',value:java.util.UUID.randomUUID().toString()).save(flush:true, failOnError:true);
    }
    this.nodeid = nodeid_setting.value
    log.debug("Node id is ${this.nodeid}");
  }

  public String getNodeId() {
    return nodeid
  }

  /**
   * Tell all peers what our state is
   */
  public broadcastNodeState() {
    log.debug("NodeStateService::broadcastNodeState");
    Peernode.list().each { pn ->
      log.debug("POST ${pn.baseUrl}/node/${this.nodeid}/
    }
  }
}
