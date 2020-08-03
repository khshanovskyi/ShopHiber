package dao;


import entity.CollectionEntity;

import java.util.List;
import java.util.Optional;

public interface CollectionDao {

    List<CollectionEntity> getCollectionsList();

    List<CollectionEntity> getCollectionWhereNameLike(String collectionName);

    Optional<CollectionEntity> getCollectionById(int collectionId);

    Optional<CollectionEntity> getCollectionByName(String collectionName);

    void createCollection(CollectionEntity collectionEntity);

    void updateCollection(CollectionEntity collectionEntity);

    void deleteCollection(CollectionEntity collectionEntity);
}
