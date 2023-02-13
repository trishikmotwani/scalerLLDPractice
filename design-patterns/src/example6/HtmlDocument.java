package example6;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void validate() {
        for(HtmlNode node: nodes)
            node.validate();
    }
}
