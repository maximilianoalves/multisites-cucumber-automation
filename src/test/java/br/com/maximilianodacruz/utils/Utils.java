package br.com.maximilianodacruz.utils;

import org.junit.Assert;

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
        Brands env = Brands.valueOf(getBrand().toUpperCase());
        String url = null;

        switch (env) {
            case GOOGLE:
                url = "https://www.google.com.br";
                break;
            case BING:
                url = "https://www.bing.com/?cc=br";
                break;
            case DUCKDUCKGO:
                url = "https://duckduckgo.com/";
                break;
            default:
                Assert.fail("Ambiente não existente: " + env);
        }

        return url;
    }
}
