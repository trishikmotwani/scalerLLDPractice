package builderpatternexample1.soln;

import builderpatternexample1.WebPage;
import builderpatternexample1.WordDocumentPage;

public class WebPageBuilder implements ExportedDocumentBuilder {
    private WebPage webPage = new WebPage();

    @Override
    public void addPage(WordDocumentPage page) {
        webPage.addHtmlText(page.getText());
    }
}
