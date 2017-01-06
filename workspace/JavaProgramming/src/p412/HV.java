package p412;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class HV {

	public static Vector<String> hashToVecktor(HashMap<String, String> h) {
		Vector<String> v = new Vector<String>();
		Iterator<String> i = h.keySet().iterator();
		while (i.hasNext()) {
			v.add(h.get(i.next()));
		}

		return v;
	}

	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		Vector<String> v = HV.hashToVecktor(h);
		for (int n = 0; n < v.size(); n++) {
			System.out.println(v.get(n));
		}
	}

}
