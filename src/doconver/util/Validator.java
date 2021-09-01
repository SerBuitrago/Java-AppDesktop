package doconver.util;

import java.io.File;
import java.io.Serializable;

public class Validator implements Serializable {

	private static final long serialVersionUID = 1L;

	public static boolean validate(String path, String[] exts) throws Exception {
		if (path != null) {
			File file = new File(path);
			if (file.exists()) {
				String name = file.getAbsolutePath().toLowerCase();
				for (String ext : exts) {
					if (name.endsWith(ext)) {
						return true;
					}
				}
			} else {
				throw new Exception(Variable.MESSAGE_ERROR_FILE_EXIST + " " + path + ".");
			}
		} else {
			throw new Exception(Variable.MESSAGE_ERROR_FILE_EMPTY);
		}
		throw new Exception(Variable.MESSAGE_ERROR_FILE_EXT + toChain(exts) + ".");
	}

	public static <T> String toChain(T[] exts) {
		String chain = "[";
		int size = exts.length, i = 1;
		for (T ext : exts) {
			chain += "" + ext + (i < size ? ", " : "");
			i++;
		}
		chain += "]";
		return chain;
	}

	public static int indexElement(String vector[], String element) {
		if (vector != null) {
			int i = 0;
			for (String e : vector) {
				if (e.equals(element)) {
					return i;
				}
				i++;
			}
		}
		return -1;
	}
}
