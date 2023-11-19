package web.lab3.server.model;

import jakarta.inject.Named;
import jakarta.persistence.*;

@Entity
@Named
public class PointCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true)
    private int id;

    @Column(name="x", nullable=false)
    private double x;

    @Column(name="y", nullable=false)
    private double y;

    @Column(name="r", nullable=false)
    private double r;

    @Column(name="is_hit", nullable=false)
    private boolean isHit;

    public PointCheck() {

    }

    public PointCheck(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
