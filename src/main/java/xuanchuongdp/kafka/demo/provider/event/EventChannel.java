package xuanchuongdp.kafka.demo.provider.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface EventChannel {

    String ACTIVITIES_OUTPUT = "activityEventOutputChannel";

    @Output(ACTIVITIES_OUTPUT)
    MessageChannel userActivitiesHistoricalEventOutputChannel();
}
