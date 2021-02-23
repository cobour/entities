package my.pkg;

import my.pkg.entities.CoolEntity;
import my.pkg.entities.CoolEntity.CoolEntityBuilder;

public class RunMe {

	public static void main(String[] args) {
		CoolEntity entity = CoolEntity.builder().id(Long.valueOf(4711)).message("Hello world").build();
		System.out.println(entity.toString());
	}
}
