import java.util.ArrayList;

import org.apache.commons.collections15.Transformer;

public class NotasToStringTransformer implements Transformer<ArrayList<Nota>, String> {

	@Override
	public String transform(ArrayList<Nota> grades) {
		return (grades.size()>0) ? grades.get(grades.size() -1).getValue() : "0";
	}

}