package kz.iitu.test.event;

import kz.iitu.test.entity.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;

public class GoalEvent extends ApplicationEvent {
    @Autowired
    Goal goal;
    public GoalEvent(Object source, Goal goal) {
        super(source);
        this.goal = goal;
    }
}
