package web.lab3.server.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import web.lab3.server.model.PointCheck;

import java.util.List;

@Named
@ApplicationScoped
public class PointCheckStorageController {
    @PersistenceContext(unitName = "default")
    private EntityManager entityManager;

    @Transactional
    public void savePointCheck(PointCheck pointCheck) {
        entityManager.persist(pointCheck);
    }

    public List<PointCheck> getCheckPointList(int start, int count) {
        return entityManager.createQuery("SELECT p FROM PointCheckResult p", PointCheck.class)
                .setFirstResult(start).setMaxResults(count).getResultList();
    }
}
