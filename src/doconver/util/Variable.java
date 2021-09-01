package doconver.util;

import java.io.File;
import java.io.Serializable;

import javax.swing.filechooser.FileSystemView;

public class Variable implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String NAME_PROJECT = "DoConvert";
	
	public static final String DIR_DOWNLOAD = Variable.pathOutFile();
	
	public static final String URL_API = "http://54.163.147.33:8080/convertir";
	
	public static final String MESSAGE_ERROR_FILE_EXT = "La extenciones esperada debe ser: ";
	public static final String MESSAGE_ERROR_FILE_EMPTY = "No se ha recibido ningun archivo.";
	public static final String MESSAGE_ERROR_FILE_EXIST = "El archivo seleccionado no exite en la ruta";
	public static final String MESSAGE_ERROR_FAIL_RESPONSE = "No se ha recibido respuesta de la API.";

	public static final String[] EXT_WORD = { ".docx", ".ff" };
	public static final String[] EXT_EXCEL = { ".xlsx", ".xlsb", ".xlsm", ".xls", ".xlw", ".xml" };
	public static final String[] EXT_POWER_POINT = { ".pptx" };
	public static final String[] EXT_PDF = { ".pdf" };
	public static final String[] EXT_ODT = { ".odt" };
	public static final String[] EXT_ODS = { ".ods" };
	public static final String[] EXT_ODP = { ".odp" };

	
	public static final int TYPE_CONVERT = 0;
	public static final int TYPE_CONVERT_1 = 1;
	public static final int TYPE_CONVERT_2 = 2;
	
	public static final String[] MENU = { "WORD", "EXCEL", "POWER POINT", "ODT", "ODS", "ODP" };
	public static final String[] MENU_WORD = { "ODT", "PDF" };
	public static final String[] MENU_EXCEL = { "ODS", "PDF" };
	public static final String[] MENU_POWER_POINT = { "ODP", "PDF" };
	public static final String[] MENU_ODT = { "WORD", "PDF" };
	public static final String[] MENU_ODS = { "EXCEL", "PDF" };
	public static final String[] MENU_ODP = { "POWER POINT", "PDF" };
	public static final String[][] MENU_ITEMS = { MENU_WORD, MENU_EXCEL, MENU_POWER_POINT, MENU_ODT, MENU_ODS,
			MENU_ODP };
	public static final String[][] MENU_EXT = { EXT_WORD, EXT_EXCEL, EXT_POWER_POINT, EXT_ODT, EXT_ODS,
			EXT_ODP };

	public static String pathOutFile() {
		FileSystemView fsv = FileSystemView.getFileSystemView();
		File com = fsv.getHomeDirectory();
		String desktop = com.getAbsolutePath();
		return desktop;
	}
}
