package web.configuration;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:execution/${product}/${environment}.properties"})
public interface ExecutionConfiguration extends Config {

  @Key("driverConfig")
  String driverConfig();

  @Key("url.frontend")
  String landingPageUrl();

}
