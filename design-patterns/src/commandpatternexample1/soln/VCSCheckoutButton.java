package commandpatternexample1.soln;

public class VCSCheckoutButton {

    private String label;
    private Command command;

    public VCSCheckoutButton(Command command) {
        this.command = command;
    }

    public void click() {
        // .. what to put here?
        command.execute();
    }

}
