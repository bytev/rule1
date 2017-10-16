package uk.co.hadoopathome.kafkastreams.drools;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.apache.log4j.Logger;
import uk.co.hadoopathome.kafkastreams.KafkaStreamsDroolsMain;


import java.io.StringReader;

import static org.apache.log4j.Level.DEBUG;

public class ZebraMsgBuilder {

    public static final Logger LOGGER = Logger.getLogger(ZebraMsgBuilder.class);

    public ZebraMsgBuilder(ZebraMsg zebraMsg, String msg) {
        JsonElement jsonElement = new JsonParser().parse(msg);
        if (jsonElement.isJsonArray()) {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            JsonElement jsonElementX = jsonArray.get(0);

            JsonObject jsonObject = jsonElementX.getAsJsonObject();
            JsonObject tagObject = jsonObject.getAsJsonObject("tag");
            initTag(zebraMsg, tagObject);
            LOGGER.log(DEBUG, "");
        }
        LOGGER.log(DEBUG, "");
    }

    private void initTag(ZebraMsg zebraMsg, JsonObject tagObject) {
        String id = tagObject.get("id").getAsString();
        zebraMsg.setId(id);
        LOGGER.log(DEBUG, "");
    }

}