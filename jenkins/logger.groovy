import jenkins.model.*;
import java.util.logging.Logger

Logger logger = Logger.getLogger("");
logger.info"Executing init script";

Jenkins.instance.setDisabledRememberMe(true);
Jenkins.instance.setSystemMessage('<h1> Jenkins Server - Atomating Jenkins with Groovy </h1>');
Jenkins.instance.save();

logger.info "Initi script complete"