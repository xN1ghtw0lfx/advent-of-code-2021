package de.nightwolf.advent.day2;
import java.net.URISyntaxException;
import java.nio.file.Path;

import de.nightwolf.advent.day2.submarine.Submarine;
import de.nightwolf.advent.day2.submarine.SubmarineV1;

@SuppressWarnings("ConstantConditions")
public class Challenge03 {

	public static void main(String[] args) throws URISyntaxException {
		Submarine submarine = new SubmarineV1();
		submarine.executeInput(Path.of(Challenge03.class.getResource("input.txt").toURI()));

		System.out.println(submarine.getPosition());
	}

} 
