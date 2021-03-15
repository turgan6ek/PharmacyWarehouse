package kz.iitu.test.entity;

import org.springframework.stereotype.Component;

@Component
public class Goal {
    Long accepted;
    Long goal;
    public Goal() {
        this.accepted = Long.valueOf(0);
        this.goal = Long.valueOf(0);
    }


    public Long getAccepted() {
        return accepted;
    }

    public void setAccepted(Long accepted) {
        this.accepted = accepted;
    }

    public Long getGoal() {
        return goal;
    }

    public void setGoal(Long goal) {
        this.goal = goal;
    }
}
