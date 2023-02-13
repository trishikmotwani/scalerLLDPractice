package scaler.structural.decorator.htmlelement;

public class HtmlInputElement implements HtmlElement {

	HtmlElement parent;
	public HtmlInputElement(HtmlElement parent) {
		this.parent = parent;
	}
	public HtmlInputElement() {
		
	}

	@Override
	public String render() {
		// TODO Auto-generated method stub
		if(parent != null) {
			return parent.render() + " + <Input Text>";
		}
		return "<Input Text>";
	}

}
