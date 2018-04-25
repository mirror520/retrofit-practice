package ncut;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Camera {
    @JsonProperty("mcid")
    private int mcid;

    @JsonProperty("camera")
    private String camera;
    
    @JsonProperty("address")
    private String address;
    
    @JsonProperty("output_width")
    private int output_width;
    
    @JsonProperty("output_height")
    private int output_height;
    
    @JsonProperty("x")
    private int x;
    
    @JsonProperty("y")
    private int y;
    
    @JsonProperty("record_enabled")
    private boolean record_enabled;
    
    @JsonProperty("enabled")
    private boolean enabled;
    
    @JsonProperty("format")
    private CameraFormat format;
    

	// private CameraBrandVO camera_brand;
	// private LocationAreaVO location_area;
}