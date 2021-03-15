package kz.iitu.test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GoalEventHandler implements ApplicationListener<GoalEvent> {
    @Override
    @EventListener
    public void onApplicationEvent(GoalEvent goalEvent) {
        Long accepted = goalEvent.goal.getAccepted();
        Long goal = goalEvent.goal.getGoal();
        if (goal > accepted) {
            Long left = goal - accepted;
            System.out.println(left + " left to reach the goal.");
        }
        else {
            System.out.println("Goal is reached , please set a new goal. ");
        }
    }
}
