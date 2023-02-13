package builderpatternexample1;

import java.util.ArrayList;
import java.util.List;

public class WordDocument {
    private List<WordDocumentPage> pages = new ArrayList<>();

    public void addPage(WordDocumentPage page) {
        pages.add(page);
    }

    public void export(ExportFormat exportFormat) {
        if(exportFormat == ExportFormat.PDF) {
        	PdfDocument pdf = new PdfDocument();
            for(WordDocumentPage page: pages) {
                pdf.addPage(page.getText());
            }
        } else if(exportFormat == ExportFormat.SINGLE_WEB_PAGE) {
        	WebPage htmlPage = new WebPage();
            for (WordDocumentPage page: pages) {
                htmlPage.addHtmlText(page.getText());
            }
        }
    }



}
