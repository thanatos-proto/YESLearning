package config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by moonwolfzy on 2017-11-18.
 */

@Component
@ConfigurationProperties(prefix ="web")
public class OwnerSettings {
    private String webOwner;
    private String webName;

    public String getWebOwner() {
        return webOwner;
    }

    public void setWebOwner(String webOwner) {
      this.webOwner = webOwner;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
     this.webName = webName;
    }
}
