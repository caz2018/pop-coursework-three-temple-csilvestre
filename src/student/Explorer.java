package student;

import game.EscapeState;
import game.ExplorationState;
import game.Node;
import game.NodeStatus;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

/**
 * provides the explorer with the ability to explore and escape from the cavern.
 */
public class Explorer {

    /**
     * allows the explorer to explore the cavern, trying to find the orb in as
     * few steps as possible. Once the orb is found the escape phase begins.
     *
     * @param state the information available at the current state.
     */
    public void explore(final ExplorationState state) {

        // TODO

    }

    /**
     * allows the explorer to escape from the cavern, collecting as much gold
     * as possible before the ceiling collapses.
     * time is measured in the number of steps taken, and for each step the
     * time remaining is decremented by the weight of the edge taken.
     * the method returns once the exit is reached.
     *
     * @param state the information available at the current state.
     */
    public void escape(final EscapeState state) {

        // TODO
    }

}
