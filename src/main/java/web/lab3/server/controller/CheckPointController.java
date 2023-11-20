package web.lab3.server.controller;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import web.lab3.server.model.PointCheck;
import web.lab3.server.util.PointChecker;

import java.io.Serializable;
import java.util.Date;

@Named
@RequestScoped
public class CheckPointController implements Serializable {

    private double x;
    private double y;
    private double r;
    private boolean isHit;

    @Inject
    private PointCheckStorageController pointCheckStorageController;

    public void checkPoint() {
        PointCheck pointCheckResult = new PointCheck();
        pointCheckResult.setX(x);
        pointCheckResult.setY(y);
        pointCheckResult.setR(r);
        pointCheckResult.setIsHit(PointChecker.isPointIsnideArea(x, y, r));
        pointCheckResult.setCreatedAt(new Date(System.currentTimeMillis()));

        pointCheckStorageController.savePointCheck(pointCheckResult);
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

    public boolean getIsHit() {
        return isHit;
    }

    public void setIsHit(boolean value) {
        isHit = value;
    }
}
