package xuanchuongdp.kafka.demo.provider.configuration;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xuanchuongdp.kafka.demo.provider.event.ActivityPublisher;
import xuanchuongdp.kafka.demo.provider.event.EventChannel;

@Configuration
@EnableBinding(value = {EventChannel.class})
public class MessageProducerConfiguration {

    @Bean
    public ActivityPublisher activityPublisher(EventChannel eventChannel) {
        return new ActivityPublisher(eventChannel);
    }
}
