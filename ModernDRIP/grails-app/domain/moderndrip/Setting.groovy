package moderndrip

class Setting {

  String id
  String key
  String value

  static constraints = {

      key blank: false, nullable: false, unique: true
    value blank: false, nullable: false
  }

  static mapping = {
    table 'md_setting'
    id column: 'st_id', generator: 'uuid', length:36
    key column: 'st_key'
    value column: 'st_value'
  }

}
