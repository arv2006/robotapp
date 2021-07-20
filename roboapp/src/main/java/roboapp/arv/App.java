package roboapp.arv;

import java.io.Console;

import helper.SquareBoard;
import helper.ToyRobot;
import helper.ToyRobotException;
import robogame.RoboGame;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Console console = System.console();

		if (console == null) {
			System.err.println("No console.");
			System.exit(1);
		}

		SquareBoard squareBoard = new SquareBoard(4, 4);
		ToyRobot robot = new ToyRobot();
		RoboGame game = new RoboGame(squareBoard, robot);

		System.out.println("Toy Robot Simulator");
		System.out.println("Enter a command, Valid commands are:");
		System.out.println("\'PLACE X,Y,NORTH|SOUTH|EAST|WEST\', MOVE, LEFT, RIGHT, REPORT or EXIT");

		boolean keepRunning = true;
		while (keepRunning) {
			String inputString = console.readLine(": ");
			if ("EXIT".equals(inputString)) {
				keepRunning = false;
			} else {
				try {
					String outputVal = game.eval(inputString);
					System.out.println(outputVal);
				} catch (ToyRobotException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
