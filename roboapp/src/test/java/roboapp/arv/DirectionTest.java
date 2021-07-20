package roboapp.arv;

import org.junit.Assert;
import org.junit.Test;

import helper.Direction;

public class DirectionTest {
	@Test
	public void testRotate() throws Exception {
		Direction direction = Direction.EAST;

		direction = direction.leftDirection();
		Assert.assertEquals(direction, Direction.NORTH);

		direction = direction.leftDirection();
		Assert.assertEquals(direction, Direction.WEST);

		direction = direction.leftDirection();
		Assert.assertEquals(direction, Direction.SOUTH);

		direction = direction.leftDirection();
		Assert.assertEquals(direction, Direction.EAST);

		direction = direction.leftDirection();
		Assert.assertEquals(direction, Direction.NORTH);

		direction = direction.rightDirection();
		Assert.assertEquals(direction, Direction.EAST);

		direction = direction.rightDirection();
		Assert.assertEquals(direction, Direction.SOUTH);

		direction = direction.rightDirection();
		Assert.assertEquals(direction, Direction.WEST);

		direction = direction.rightDirection();
		Assert.assertEquals(direction, Direction.NORTH);

		direction = direction.rightDirection();
		Assert.assertEquals(direction, Direction.EAST);
	}

}
