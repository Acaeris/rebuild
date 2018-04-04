package rebuild.core.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RebuildLog {
  private final Logger log;

  private RebuildLog(Logger logger) {
    log = logger;
  }

  public static RebuildLog getLogger(String logId) {
    return new RebuildLog(LogManager.getLogger(logId));
  }
}
