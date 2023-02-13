package builderpatternexample1.soln;

import builderpatternexample1.WordDocumentPage;

public interface ExportedDocumentBuilder {
    public void addPage(WordDocumentPage page);
}
