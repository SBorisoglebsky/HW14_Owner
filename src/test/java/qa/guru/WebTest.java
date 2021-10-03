package qa.guru;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.configs.WebTestConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTest {

    @Test
    public void localTest() {
        System.setProperty("type", "local");
        WebTestConfig config = ConfigFactory.create(WebTestConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("chrome");
        assertThat(config.browserVersion()).isEqualTo("91.0");
        assertThat(config.isRemote()).isEqualTo("false");

    }

    @Test
    public void remoteTest() {
        System.setProperty("type", "remote");
        WebTestConfig config = ConfigFactory.create(WebTestConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("firefox");
        assertThat(config.browserVersion()).isEqualTo("88.0");
        assertThat(config.isRemote()).isEqualTo("true");

    }
}
