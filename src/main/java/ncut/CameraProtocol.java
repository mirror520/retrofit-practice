package ncut;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CameraProtocol {
    @JsonProperty("mcpid")
    private int mcpid;
    
    @JsonProperty("protocol")
    private String protocol;
}