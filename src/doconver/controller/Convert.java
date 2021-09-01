package doconver.controller;

import java.io.Serializable;

import doconver.model.FileModel;

public class Convert implements Serializable {

	private static final long serialVersionUID = 1L;

	public Convert() {
	}
	
	public void to(String entry, String output, int extEntry, String extOutput) throws Exception {
		FileModel model = new FileModel(entry);
		String base = model.toBase64();
	}

}
