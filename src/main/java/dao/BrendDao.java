package dao;

import entity.BrendEntity;

import java.util.List;
import java.util.Optional;

public interface BrendDao {

    List<BrendEntity> getBrendsList();

    List<BrendEntity> getBrendWhereNameLike(String brendName);

    Optional<BrendEntity> getBrendById(int brendId);

    Optional<BrendEntity> getBrendByName(String brendName);

    void createBrend(BrendEntity brendEntity);

    void updateBrend(BrendEntity brendEntity);

    void deleteBrend(BrendEntity brendEntity);
}
