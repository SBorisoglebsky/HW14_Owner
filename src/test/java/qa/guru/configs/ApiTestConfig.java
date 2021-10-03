package qa.guru.configs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/Users/serega/api.properties"
      // ,"classpath:api.properties"
})

public interface ApiTestConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com/")
    String getBaseUrl();

    @Key("token")
    String getToken();

}
