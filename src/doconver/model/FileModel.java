package doconver.model;

import java.io.File;
import java.io.Serializable;
import java.nio.file.Files;

import doconver.util.Variable;

public class FileModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private File file;
	private String path;
	private String nameExt;
	private String name;
	private String ext;

	public FileModel() {
		this(null);
	}

	public FileModel(String path) {
		this.path = path;
		this.file = new File(path);
		init();

	}

	public void init() {
		if (isExists()) {
			this.nameExt = file.getName();
			int start = nameExt.lastIndexOf(".");
			this.name = nameExt.substring(0, start);
			this.ext = nameExt.substring(start, nameExt.length());
		}
	}

	public String toBase64() throws Exception {
		if (isExists()) {
			byte[] aux = Files.readAllBytes(file.toPath());
			String base64 = java.util.Base64.getEncoder().encodeToString(aux);
			return base64;
		} else {
			throw new Exception(Variable.MESSAGE_ERROR_FILE_EXIST + " " + this.path + ".");
		}
	}

	public boolean isExists() {
		return (file != null && file.exists());
	}

	public String getPath() {
		return path;
	}

	public String getNameExt() {
		return nameExt;
	}

	public String getName() {
		return name;
	}

	public String getExt() {
		return ext;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
