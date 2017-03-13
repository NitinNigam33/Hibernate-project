package com.nitin.common;

import java.util.*;

import lombok.Data;

/**import java.util.*;

// Remove boilerplate code of getter and setter

import lombok.Getter;
import lombok.Setter;
class GetterAndSetterUse {
	@Getter @Setter private boolean flag;
	@Getter @Setter private final int number;
	@Getter @Setter private final String text;
	@Getter @Setter private List<String> strList;
 
    public GetterAndSetterUse(int number, String text) {
        this.number = number;
        this.text = text;
    }
 
    public List<String> getStrList() {
        if (strList == null) {
            strList = new ArrayList<String>(128);
        }
        return Collections.unmodifiableList(strList);
    }
 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.number;
        hash = 11 * hash + Objects.hashCode(this.text);
        return hash;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GetterAndSetterUse other = (GetterAndSetterUse) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString() {
        return "WithoutLombokAnnotations{" + "flag=" + flag + ", number=" + number + ", text=" + text + '}';
    }

}
**/

//@lombok.RequiredArgsConstructor()
//@lombok.Getter
public @Data class LombokGetterAndSetterUse {
	private boolean flag;
	private final int number;
	private final String text;
	private List<String> strList;

	public LombokGetterAndSetterUse(int number, String text) {
		this.number = number;
		this.text = text;
	}
	
	public static void main(String[] args) {
		System.out.println("hii");
		LombokGetterAndSetterUse obj =  new LombokGetterAndSetterUse(98, "98");
		System.out.println();
	}
}
