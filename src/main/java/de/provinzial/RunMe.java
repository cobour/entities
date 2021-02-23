package de.provinzial;

import de.provinzial.entities.CoolEntity;
import de.provinzial.entities.CoolEntity.CoolEntityBuilder;

public class RunMe {

	public static void main(String[] args) {
		CoolEntity entity = new CoolEntityBuilder().id(Long.valueOf(4711)).message("Hello world").build();
		System.out.println(entity.toString());
	}
}
