package doconver.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.Base64;

import org.json.simple.JSONObject;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import doconver.model.FileModel;
import doconver.model.RequestModel;
import doconver.util.Validator;
import doconver.util.Variable;

public class ConvertController implements Serializable {

	private static final long serialVersionUID = 1L;

	public ConvertController() {
	}

	public void to(String entry, String output, int extEntry, int extOutput) throws Exception {
		if (Validator.validate(entry, Variable.MENU_EXT[extEntry])) {
			FileModel model = new FileModel(entry);
			RequestController request = new RequestController();
			JSONObject send = request.structure(model, Variable.MENU_EXT_CONVERT[extEntry][extOutput]);
			RequestModel requestModel = new RequestModel(request.post(Variable.URL_API, send));
			save(requestModel.getBase64(), output, requestModel.getName());
		}
	}

	public void save(String base64, String out, String name) throws IOException {
		byte[] decodedFile = Base64.getDecoder().decode(base64.getBytes(StandardCharsets.UTF_8));
		Path path = Paths.get(out, name);
		Files.write(path, decodedFile);
	}
}