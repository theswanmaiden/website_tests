package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/application.properties"})
public interface DataConfig extends Config {

    @Key("url")
    String getUrl();
}