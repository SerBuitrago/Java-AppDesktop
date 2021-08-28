package doconver.app;

import java.io.File;
import java.io.Serializable;

import javax.swing.filechooser.FileSystemView;

public class Variable implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String[] EXT_WORD = { ".docx" };
	public static final String[] EXT_EXCEL = { ".xlsx", ".xlsb", ".xlsm", ".xls", ".xlw", ".xml" };
	public static final String[] EXT_POWER_POINT = { ".pptx" };
	public static final String[] EXT_PDF = { ".pdf" };
	public static final String[] EXT_ODT = { ".odt" };
	public static final String[] EXT_ODS = { ".ods" };
	public static final String[] EXT_ODP = { ".odp" };
	public static final String DIR_DOWNLOAD = DIR_DOWNLOAD();
	public static final int TYPE_CONVERT = 0;
	public static final int TYPE_CONVERT_1 = 1;
	public static final int TYPE_CONVERT_2 = 2;

	public static String DIR_DOWNLOAD() {
		FileSystemView fsv = FileSystemView.getFileSystemView();
		File com = fsv.getHomeDirectory();
		String desktop = com.getPath();
		return desktop;
	}
}
