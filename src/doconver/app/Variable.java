package doconver.app;

import java.io.Serializable;

public class Variable implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
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
}
