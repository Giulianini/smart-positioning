package it.unibo.pcd1819.smartpositioning.model;

import java.util.List;

public interface Environment {

    List<Particle> particles();

    void setParticles(List<Particle> particles);

    double constant();

}
