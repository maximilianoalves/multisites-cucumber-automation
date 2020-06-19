package br.com.maximilianodacruz.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mappings {

    private String brand;
    private String screen;

    public Mappings(String screen) {
        this.brand = Utils.getBrand().toLowerCase();
        this.screen = screen;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public JSONObject getJsonFile() {
        JSONParser parser = new JSONParser();
        JSONObject jsonDataObject = null;

        try {
            StringBuilder fileName = new StringBuilder();
            fileName.append(System.getProperty("user.dir"));
            fileName.append("/src/test/java/br/com/maximilianodacruz/elements/");
            fileName.append(this.getBrand());
            fileName.append("/");
            fileName.append(this.getScreen());
            fileName.append(".json");

            Object jsonFileObject = parser.parse(new FileReader(fileName.toString()));
            jsonDataObject = (JSONObject) jsonFileObject;
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonDataObject;
    }

    public String getValue(String element) {
        JSONObject screenNode = (JSONObject) getJsonFile().get(element);
        if (screenNode != null) {
            return screenNode.get("value").toString();
        } else {
            Assert.fail("ScreenNode não encontrado: " + element);
            return null;
        }
    }

    public String getType(String element) {
        JSONObject screenNode = (JSONObject) getJsonFile().get(element);
        if (screenNode != null) {
            return screenNode.get("type").toString();
        } else {
            Assert.fail("ScreenNode não encontrado: " + element);
            return null;
        }
    }
}
