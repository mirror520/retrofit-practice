package ncut;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CameraFormat {
    @JsonProperty("mcfid")
    private int mcfid;
    
    @JsonProperty("format")
    private String format;

    @JsonProperty("codec")
    private CameraCodec codec;

    @JsonProperty("protocol")
	private CameraProtocol protocol;
}