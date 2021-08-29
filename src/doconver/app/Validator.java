package doconver.app;

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
				throw new Exception("El archivo no existe en la ruta " + path + ".");
			}
		} else {
			throw new Exception("No se ha recibido ningun archivo.");
		}
		throw new Exception("La extenciones esperada debe ser: " + toChain(exts) + ".");
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

	public static String name(String aux) {
		File file = new File(aux);
		String var = file.getName();
		int start = var.lastIndexOf(".");
		return var.substring(0, start);
	}
	
	public static int indexElement(String vector [], String element){
		if(vector != null) {
			int i = 0;
			for(String e: vector) {
				if(e.equals(element)) {
					return i;
				}
				i++;
			}
		}
		return -1;
	}
}
