package qa.guru;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.configs.ApiTestConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    public void testApi() {
        ApiTestConfig config = ConfigFactory.create(ApiTestConfig.class, System.getProperties());
        assertThat(config.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(config.getToken()).isEqualTo("1234567890");
    }
}
