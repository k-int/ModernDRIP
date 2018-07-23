package moderndrip

class RegisterEntry {

  /**
   * A unique id for this register entry
   */
  String id

  /**
   * A unique id the entity who actually owns the entry. If a registry
   * is composed of entries from companies for example, this is the id of acme.com
   * which will determine who is allowed to update these entries
   */
  String ownerId

  /**
   * A JSON Document which is the document describing the register entry
   */
  String entry

  /**
   * Sign the document using the private cert of ownerId
   */
  String signature

  static constraints = {
         ownerId blank: false, nullable: false
           entry blank: false, nullable: false
       signature blank: false, nullable: false
  }

  static mapping = {
    table 'md_register_entry'
            id column: 're_id', generator: 'uuid', length:36
       ownerId column: 're_owner_id'
         entry column: 're_entry'
     signature column: 're_sig'
  }

}
