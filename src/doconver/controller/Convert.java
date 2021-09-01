package doconver.controller;

import java.io.Serializable;

import org.json.simple.JSONObject;

import doconver.model.FileModel;
import doconver.model.RequestModel;
import doconver.util.Variable;

public class Convert implements Serializable {

	private static final long serialVersionUID = 1L;

	public Convert() {
	}
	
	public void to(String entry, String output, int extEntry, String extOutput) throws Exception {
		FileModel model = new FileModel(entry);
		RequestController request = new RequestController();
		String base = model.toBase64();
		JSONObject send = request.structure(model, base, extOutput);
		RequestModel requestModel = new RequestModel(request.post(Variable.URL_API, send));
		
		
	}

}
