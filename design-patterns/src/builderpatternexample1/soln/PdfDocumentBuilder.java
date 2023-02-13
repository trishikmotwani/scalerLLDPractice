package builderpatternexample1.soln;

import builderpatternexample1.PdfDocument;
import builderpatternexample1.WordDocumentPage;

public class PdfDocumentBuilder implements ExportedDocumentBuilder{
    private PdfDocument pdfDocument = new PdfDocument();

    @Override
    public void addPage(WordDocumentPage page) {
        pdfDocument.addPage(page.getText());
    }

    public PdfDocument getPdfDocument() {
        return pdfDocument;
    }
}
