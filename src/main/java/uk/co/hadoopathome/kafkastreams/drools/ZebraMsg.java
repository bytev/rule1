package uk.co.hadoopathome.kafkastreams.drools;

public class ZebraMsg {
    private String content;
    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ZebraMsg(String content) {
        this.content = content;
        new ZebraMsgBuilder(this, content);
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override public String toString() {
        return "Message{" + "content='" + content + '\'' + '}';
    }
}