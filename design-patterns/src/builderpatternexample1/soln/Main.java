package builderpatternexample1.soln;

import builderpatternexample1.PdfDocument;
import builderpatternexample1.WordDocumentPage;

public class Main {
    public static void main(String[] args) {
    	WordDocument wordDocument = new WordDocument();
        wordDocument.addPage(new WordDocumentPage("Page 1"));
        wordDocument.addPage(new WordDocumentPage("Page 2"));

        PdfDocumentBuilder pdfBuilder = new PdfDocumentBuilder();
        wordDocument.export(pdfBuilder);
        PdfDocument pdfDocument = pdfBuilder.getPdfDocument();
    }
}
