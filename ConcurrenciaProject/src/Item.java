import java.util.Iterator;

public class Item  {
	private int value1;
	private int value2;
	private String key;

	public void setValue1(int v) {
		value1 = v;
	}

	public void setValue2(int v) {
		value2 = v;
	}

	public int getValue1() {
		return value1;
	}

	public int getValue2() {
		return value2;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	@Override
	public String toString() {
		return "key: "+this.key+
				"/nvalue 1:"+this.value1+
				" - value 2: "+this.value2;
	}
}
