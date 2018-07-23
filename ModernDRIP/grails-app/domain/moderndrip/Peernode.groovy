package moderndrip

class Peernode {

  String id
  String baseUrl
  String peerNodeId
  String peerState

  static constraints = {
       baseUrl blank: false, nullable: false
    peerNodeId blank: false, nullable: false, unique: true
     peerState blank: false, nullable: false
  }

  static mapping = {
    table 'md_peer_node'
            id column: 'pn_id', generator: 'uuid', length:36
    peerNodeId column: 'pn_peer_node_id'
     peerState column: 'pn_peer_state'
       baseUrl column: 'pn_peer_base_url'
  }

}
