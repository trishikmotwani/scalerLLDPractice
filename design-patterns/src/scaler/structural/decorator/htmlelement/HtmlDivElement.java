package scaler.structural.decorator.htmlelement;

public class HtmlDivElement implements HtmlElement {

	HtmlElement parent;
	public HtmlDivElement(HtmlElement parent) {
		this.parent = parent;
	}
	public HtmlDivElement() {
		
	}

	@Override
	public String render() {
		// TODO Auto-generated method stub
		if(parent != null) {
			return parent.render() + " + <Div>";
		}
		return "<Div>";
	}

}
