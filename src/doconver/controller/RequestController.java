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

public class RequestController implements Serializable {

	private static final long serialVersionUID = 1L;

	public RequestController() {
	}

	@SuppressWarnings("unchecked")
	public JSONObject structure(FileModel model, String base, String ext) throws Exception{
		JSONObject object = new JSONObject();
		object.put("nombreArchivo", model.getNameExt());
		object.put("extensionFuente", model.getExt());
		object.put("extensionDestino", ext);
		object.put("base64", base);
		return object;
	}
	
	public JSONObject post(String url, JSONObject send) throws Exception {
		 try {
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
	            	throw new Exception(http.getResponseMessage());
	            }
	        } catch (Exception e) {
	            throw new Exception(e.getMessage());
	        }
	}

}
