package uk.co.hadoopathome.kafkastreams;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.log4j.BasicConfigurator;
import uk.co.hadoopathome.kafkastreams.configuration.ConfigurationReader;
import org.apache.log4j.Logger;


public class KafkaStreamsDroolsMain {

    public static final Logger LOGGER= Logger.getLogger(KafkaStreamsDroolsMain.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        PropertiesConfiguration properties = ConfigurationReader.getProperties("config.properties");
        //KafkaStreamsRunner.runKafkaStream(properties);
        KafkaStreamsRunner.runZebraStream(properties);
    }
}
