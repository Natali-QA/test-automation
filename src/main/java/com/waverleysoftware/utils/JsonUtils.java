package com.waverleysoftware.utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("JavadocType")
public final class JsonUtils {

    private JsonUtils() {
        throw new UnsupportedOperationException("Illegal access to constructor");
    }

    public static <T> T jsonToEntity(final String dataSource, final Class<T> entityClass) {
        final Gson gson = new Gson();
        final String path = ClassLoader.getSystemResource(dataSource).getPath();

        try (FileReader fileReader = new FileReader(path)) {
            final JsonReader reader = new JsonReader(fileReader);
            return gson.fromJson(reader, entityClass);
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to read" + dataSource, e);
        }
    }

}
