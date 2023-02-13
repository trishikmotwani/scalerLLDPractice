package scaler.structural.decorator.htmlelement;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HtmlElement htmlElement = 
				new HtmlDivElement(new HtmlFormElement(new HtmlInputElement()));
		
		System.out.println(htmlElement.render());
	}

}
