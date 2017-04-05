import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotasToBooleanTransformer extends NotasToStringTransformer {

	private List<String> aprobados = Arrays.asList("6","7","8","9","10","B-","B","B+");
	
	@Override
	public String transform(ArrayList<Nota> grades) {
		return aprobados.contains(super.transform(grades)) ? "SI" : "NO";
	}

}
