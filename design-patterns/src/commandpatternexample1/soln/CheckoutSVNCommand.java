package commandpatternexample1.soln;

public class CheckoutSVNCommand implements Command{
    SubversionRepository repo = new SubversionRepository();

    public CheckoutSVNCommand(SubversionRepository repo) {
        this.repo = repo;
    }

    @Override
    public void execute() {
        repo.checkout();
    }
}
