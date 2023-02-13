package scopeofvariables;

public class VarScopeInIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		if (x == 9)
		{
			//int x = 8; will throw duplicate local variable compilation error
			System.out.println(x);
		}
	}

}
