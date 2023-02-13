package builderpatternexample1.soln;

import java.util.ArrayList;
import java.util.List;

import builderpatternexample1.ExportFormat;
import builderpatternexample1.PdfDocument;
import builderpatternexample1.WebPage;
import builderpatternexample1.WordDocumentPage;

public class WordDocument {
    private List<WordDocumentPage> pages = new ArrayList<>();

    public void addPage(WordDocumentPage page) {
        pages.add(page);
    }
    
    // WordDocument is the director which defines order of building steps, it does not know which builder is exporting
    // the file in which format
    public void export(ExportedDocumentBuilder exportedDocumentBuilder) {
        //Add a watermark to all the pages
        for(WordDocumentPage page: pages){
            exportedDocumentBuilder.addPage(page);
        }
    }



}
