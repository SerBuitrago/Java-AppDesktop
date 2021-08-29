package doconver.app;

import java.io.File;
import java.io.Serializable;

import javax.swing.filechooser.FileSystemView;

public class Variable implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String NAME_PROJECT = "DoConvert";
	public static final String DIR_DOWNLOAD = Variable.dirDownload();

	public static final String[] EXT_WORD = { ".docx" };
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

	public static String dirDownload() {
		FileSystemView fsv = FileSystemView.getFileSystemView();
		File com = fsv.getHomeDirectory();
		String desktop = com.getPath();
		return desktop;
	}
}
