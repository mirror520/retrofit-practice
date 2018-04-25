package ncut;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CameraCodec {
    @JsonProperty("mccid")
    private int mccid;
    
    @JsonProperty("codec")
    private String codec;
}