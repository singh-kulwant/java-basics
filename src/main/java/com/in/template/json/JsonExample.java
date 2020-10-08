package com.in.template.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.in.template.json.model.Profiles;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class JsonExample {

    public static void main(String[] args) throws IOException {

        URL url = JsonExample.class.getClassLoader().getResource("sample.json");
        String rawContent = new String(Files.readAllBytes(Path.of(url.getPath())));

        String formattedContent = new Gson().toJson(rawContent, JsonNode.class);

        ObjectMapper objectMapper = new ObjectMapper();
        Profiles profiles = objectMapper.readValue(rawContent, Profiles.class);
        String deserializedString = objectMapper.writeValueAsString(profiles);

        System.out.println("Result:" + Objects.equals(formattedContent, deserializedString));
    }

}
