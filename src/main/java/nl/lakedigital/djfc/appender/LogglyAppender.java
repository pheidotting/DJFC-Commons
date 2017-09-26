package nl.lakedigital.djfc.appender;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class LogglyAppender extends AppenderSkeleton {
    private String tag = "";
    private String token = "";

    public LogglyAppender() {
        super();
    }

    public LogglyAppender(boolean isActive) {
        super(isActive);
    }


    @Override
    protected void append(LoggingEvent event) {
        /**
         * We always only produce to the current file. So there's no need for locking
         */

        assert this.layout != null : "Cannot log, there is no layout configured.";

        String output = this.layout.format(event);

        //        try {
        //            HttpResponse<String> response = Unirest.post("http://logs-01.loggly.com/inputs/" + token + "/tag/" + tag + "," + event.getLevel()).header("accept", "application/json").body(output).asString();
        //        } catch (UnirestException e) {
        //            e.printStackTrace();
        //        }

    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public void close() {

    }

    @Override
    public boolean requiresLayout() {
        return false;
    }
}
