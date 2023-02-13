package commandpatternexample1.soln;

public class Main {

    public static void main(String[] args) {
    	SubversionRepository repo = new SubversionRepository();
    	CheckoutSVNCommand checkoutCommand = new CheckoutSVNCommand(repo);
    	VCSCheckoutButton button = new VCSCheckoutButton(checkoutCommand);
        button.click();
    }
}
