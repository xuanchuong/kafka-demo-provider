package xuanchuongdp.kafka.demo.provider.event;

public class ActivityDto {
    private String name;
    private String content;
    private String user;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }
}
