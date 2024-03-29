package utils;

import lombok.SneakyThrows;

import java.io.*;
import java.util.Properties;

public class DataUtil {

    @SneakyThrows
    public static Properties getProperties(String path) throws IOException {

        var properties = new Properties();
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try (InputStream resourceAsStream = classLoader.getResourceAsStream(path)) {
            if (resourceAsStream == null) {
                throw new FileNotFoundException(" File not found: " + path);
            }

            try (var reader = new BufferedReader(new InputStreamReader(resourceAsStream))) {
                properties.load(reader);
                return properties;
            }
        }
    }

}
