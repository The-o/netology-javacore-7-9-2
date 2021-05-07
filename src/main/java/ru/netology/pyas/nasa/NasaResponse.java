package ru.netology.pyas.nasa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NasaResponse {
    private String url;

    public NasaResponse(
        @JsonProperty("url") String url
    ) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
