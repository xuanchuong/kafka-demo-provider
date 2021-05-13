package xuanchuongdp.kafka.demo.provider.event;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;

public class ActivityPublisher {

    private final EventChannel eventChannel;

    public ActivityPublisher(final EventChannel eventChannel) {
        this.eventChannel = eventChannel;
    }

    public void publish(ActivityDto activityDto) {
        Message<ActivityDto> message = MessageBuilder.withPayload(activityDto)
            .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
            .build();
        eventChannel.userActivitiesHistoricalEventOutputChannel().send(message);
    }
}
