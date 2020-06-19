package br.com.maximilianodacruz.utils;

import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {

    public static String getBrand() {
        String brand = null;
        if (System.getProperty("brand") != null) {
            brand = System.getProperty("brand");
        } else {
            //brand = "GOOGLE";
            Assert.fail("Brand não definido");
        }
        return brand ;
    }

    public static String getEnv() {
        return getConfigProperties().getProperty("URL");
    }

    public static Properties getConfigProperties() {
        StringBuilder pathProperties = new StringBuilder();
        pathProperties.append(System.getProperty("user.dir"));
        pathProperties.append("/src/test/java/br/com/maximilianodacruz/elements/");
        pathProperties.append(Utils.getBrand().toLowerCase());
        pathProperties.append("/config.properties");
        Properties configProps = new Properties();

        try {
            configProps.load(new FileInputStream(pathProperties.toString()));
        } catch (FileNotFoundException e) {
            Assert.fail(e.getMessage());
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
        return configProps;
    }


}
