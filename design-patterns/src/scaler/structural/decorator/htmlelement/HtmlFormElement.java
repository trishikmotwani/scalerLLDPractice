package scaler.structural.decorator.htmlelement;

public class HtmlFormElement implements HtmlElement {

	HtmlElement parent;
	public HtmlFormElement(HtmlElement parent) {
		this.parent = parent;
	}
	public HtmlFormElement() {
		
	}

	@Override
	public String render() {
		// TODO Auto-generated method stub
		if(parent != null) {
			return parent.render() + " + <Form>";
		}
		return "<Form>";
	}
}
