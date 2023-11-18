package web.lab3.server.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;

/**
 * Managed Bean для представления точки.
 */
@Named("point")
@RequestScoped
public class Point implements Serializable {
    private Double x;
    private Double y;
    private Double r;

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }
}
