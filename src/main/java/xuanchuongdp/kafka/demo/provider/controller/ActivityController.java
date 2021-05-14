package xuanchuongdp.kafka.demo.provider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xuanchuongdp.kafka.demo.provider.event.ActivityDto;
import xuanchuongdp.kafka.demo.provider.event.ActivityPublisher;

@RestController
public class ActivityController {

    private final ActivityPublisher activityPublisher;

    public ActivityController(final ActivityPublisher activityPublisher) {
        this.activityPublisher = activityPublisher;
    }

    @PostMapping("activity/create")
    public void sendActivity(ActivityDto activityDto) {
        this.activityPublisher.publish(activityDto);
    }
}
