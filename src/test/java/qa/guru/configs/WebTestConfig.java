package qa.guru.configs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${type}.properties"
})

public interface WebTestConfig extends Config {

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("isRemote")
    String isRemote();

}