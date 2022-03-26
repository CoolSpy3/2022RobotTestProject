package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.lib.LinearActuator;

public class Subsystem extends SubsystemBase {

    private LinearActuator actuator = new LinearActuator(0, 0, 50);

    public Subsystem() {
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("Actuator PWM", actuator.get());
        SmartDashboard.putNumber("Actuator Length", actuator.getLength());
    }

    public void setLength(double length) {
        actuator.setLength(length);
    }

    public void set(double value) {
        actuator.set(value);
    }
}
