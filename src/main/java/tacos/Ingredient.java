/**
 * 
 */
package tacos;

import lombok.Data;

/**
 * @author Randy's PC
 *
 */
@Data
public class Ingredient {
	public enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
	
	public final String id;
	public final String name;
	public final Type type;
	
	public Ingredient(String id, String name, Type type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	/**
	 * @return
	 */
	public Type getType() {
		return this.type;
	}	
}
