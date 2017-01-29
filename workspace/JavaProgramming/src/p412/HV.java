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
		h.put("����", "112");
		h.put("ȭ��", "119");
		h.put("��ȭ��ȣ", "114");
		Vector<String> v = HV.hashToVecktor(h);
		for (int n = 0; n < v.size(); n++) {
			System.out.println(v.get(n));
		}
	}

}
