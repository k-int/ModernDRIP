package moderndrip

class BootStrap {

  def nodeStateService

  def init = { servletContext ->
    log.debug("BootStrap::init");
    nodeStartup();
  }

  def destroy = {
  }

  def nodeStartup() {
    log.debug("Node id : ${nodeStateService.nodeId}");
  }
}
