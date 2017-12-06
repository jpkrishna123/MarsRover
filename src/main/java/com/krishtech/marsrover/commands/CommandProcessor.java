package com.krishtech.marsrover.commands;

import java.util.HashMap;
import java.util.Map;

import com.krishtech.marsrover.model.Rover;


public class CommandProcessor {
	
	@SuppressWarnings("serial")
	private static Map<Character, IFCommand> commandLookup = new HashMap<Character, IFCommand>() {{
        put('L', new CommandLeft());
        put('R', new CommandRight());
        put('M', new CommandMove());
    }};
    
	public static void process(Rover rover, final String commands) {
		for(char commandChar : commands.toCharArray()) {
			execute(rover, commandChar);
		}
	}

	private static void execute(Rover rover, char commandChar) {
		if(commandChar != ' ') {
			commandChar = Character.toUpperCase(commandChar);
			IFCommand command = commandLookup.get(commandChar);
			if(command != null) {
				command.execute(rover);
			}
		}
	}
}
