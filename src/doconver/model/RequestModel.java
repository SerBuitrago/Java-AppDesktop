package doconver.model;

import java.io.Serializable;

import org.json.simple.JSONObject;

public class RequestModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private JSONObject object;
	private String base64;
	private String name;
	
	public RequestModel(JSONObject object) {
		this.object = object;
		this.base64 = String.valueOf(object.get("base64"));
        this.name = String.valueOf(object.get("nombreArchivo"));
	}

	public JSONObject getObject() {
		return object;
	}

	public String getBase64() {
		return base64;
	}

	public String getName() {
		return name;
	}
}
