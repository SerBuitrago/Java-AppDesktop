package doconver.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import doconver.model.FileModel;
import doconver.util.Variable;

public class RequestController implements Serializable {

	private static final long serialVersionUID = 1L;

	public RequestController() {
	}

	@SuppressWarnings("unchecked")
	public JSONObject structure(FileModel model, String ext) throws Exception{
		JSONObject object = new JSONObject();
		object.put("nombreArchivo", model.getNameExt());
		object.put("extensionFuente", model.getExt().substring(model.getExt().lastIndexOf(".") + 1).toUpperCase());
		object.put("extensionDestino", ext.substring(ext.lastIndexOf(".") + 1).toUpperCase());
		object.put("base64", model.toBase64());
		return object;
	}
	
	public JSONObject post(String url, JSONObject send) throws Exception {
		 URL connect = new URL(url);
         HttpURLConnection http = (HttpURLConnection) connect.openConnection();
         http.setDoOutput(true);
         http.setDoInput(true);
         http.setRequestProperty("Content-Type", "application/json; charset=utf8");
         http.setRequestProperty("Accept", "application/json");
         http.setRequestProperty("Method", "POST");
         OutputStream os = http.getOutputStream();
         os.write(send.toString().getBytes("UTF-8"));
         os.close();
         StringBuilder sb = new StringBuilder();
         int HttpResult = http.getResponseCode();
         if (HttpResult == HttpURLConnection.HTTP_OK) {
             BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream(), "utf-8"));
             String line = null;
             while ((line = br.readLine()) != null) {
                 sb.append(line + "\n");
             }
             br.close();
             String response = sb.toString();
             JSONParser parser = new JSONParser();
             JSONObject jsonResult = (JSONObject) parser.parse(response);
             return jsonResult;
         } else {
         	throw new Exception(Variable.MESSAGE_ERROR_FAIL_RESPONSE);
         }
	}

}
