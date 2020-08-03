package service;

import entity.BrendEntity;

import java.util.List;
import java.util.Optional;

public interface BrendService {

    List<BrendEntity> getBrendsList();

    List<BrendEntity> getBrendWhereNameLike(String brendName);

    Optional<BrendEntity> getBrend(int brendId);

    Optional<BrendEntity> getBrend(String brendName);

    void createBrend(BrendEntity brendEntity);
    void createBrend(String name, short discount);
    void createBrend(String name);

    void updateBrend(BrendEntity brendEntity);
    void updateBrend(int id, String name, short discount);
    void updateBrend(int id, String name);
    void updateBrend(int id, short discount);

    void deleteBrend(BrendEntity brendEntity);
    void deleteBrend(int id);
}
