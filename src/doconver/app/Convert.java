package doconver.app;

import java.io.Serializable;

import com.aspose.cells.Workbook;
import com.aspose.slides.Presentation;
import com.aspose.words.Document;

public class Convert implements Serializable {

	private static final long serialVersionUID = 1L;

	public Convert() {
	}

	public void to(String entry, String out, int ext, int type, String ext_type) throws Exception {
		out = out + "\\" + Validator.name(entry) + ext_type;
		switch (type) {
		case 1:
			Document document = new Document(entry);
			document.save(out, ext);
			break;
		case 2:
			Workbook book = new Workbook(entry);
			book.save(out, ext);
			break;
		default:
			Presentation presentation = new Presentation(entry);
			presentation.save(out, ext);
			break;
		}
	}

	/******************************
	 * WORD
	 ******************************/
	public void wordToOdt(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_WORD)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.words.SaveFormat.ODT, Variable.TYPE_CONVERT_1,
					Variable.EXT_ODT[0]);
		}
	}

	public void wordToPDF(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_WORD)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.words.SaveFormat.PDF, Variable.TYPE_CONVERT_1,
					Variable.EXT_PDF[0]);
		}
	}

	public void OdtToWord(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_ODT)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.words.SaveFormat.DOCX, Variable.TYPE_CONVERT_1,
					Variable.EXT_WORD[0]);
		}
	}

	/******************************
	 * EXCEL
	 ******************************/
	public void excelToOds(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_EXCEL)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.cells.SaveFormat.AUTO, Variable.TYPE_CONVERT_2,
					Variable.EXT_ODS[0]);
		}
	}

	public void excelToPDF(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_EXCEL)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.cells.SaveFormat.PDF, Variable.TYPE_CONVERT_2,
					Variable.EXT_PDF[0]);
		}
	}

	public void odsToExcel(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_ODS)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.cells.SaveFormat.XLSX, Variable.TYPE_CONVERT_2,
					Variable.EXT_EXCEL[0]);
		}
	}

	/******************************
	 * POWER POINT
	 ******************************/
	public void powerPointToOdp(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_POWER_POINT)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.slides.SaveFormat.Odp, Variable.TYPE_CONVERT,
					Variable.EXT_ODP[0]);
		}
	}

	public void powerPointToPDF(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_POWER_POINT)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.slides.SaveFormat.Pdf, Variable.TYPE_CONVERT,
					Variable.EXT_PDF[0]);
		}
	}

	public void odpToPowerPoint(String entry) throws Exception {
		if (Validator.validate(entry, Variable.EXT_ODP)) {
			this.to(entry, Variable.DIR_DOWNLOAD, com.aspose.slides.SaveFormat.Odp, Variable.TYPE_CONVERT,
					Variable.EXT_POWER_POINT[0]);
		}
	}
}
