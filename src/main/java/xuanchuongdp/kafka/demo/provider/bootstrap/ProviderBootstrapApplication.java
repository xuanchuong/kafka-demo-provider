package xuanchuongdp.kafka.demo.provider.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import xuanchuongdp.kafka.demo.provider.configuration.MessageProducerConfiguration;

@SpringBootApplication
@Import({MessageProducerConfiguration.class})
public class ProviderBootstrapApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderBootstrapApplication.class, args);
    }

}
