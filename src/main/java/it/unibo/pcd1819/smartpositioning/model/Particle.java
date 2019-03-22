package it.unibo.pcd1819.smartpositioning.model;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

public interface Particle {

    Vector2D position();

    void setPosition(Vector2D position);

    Vector2D velocity();

    void setVelocity(Vector2D position);

    double mass();

    double charge();

}

