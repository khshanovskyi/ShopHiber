package service;


import entity.CollectionEntity;

import java.util.List;
import java.util.Optional;

public interface CollectionService {

    List<CollectionEntity> getCollectionsList();

    List<CollectionEntity> getCollectionWhereNameLike(String collectionName);

    Optional<CollectionEntity> getCollection(int collectionId);

    Optional<CollectionEntity> getCollection(String collectionName);

    void createCollection(CollectionEntity collectionEntity);
    void createCollection(String name, short discount);
    void createCollection(String name);

    void updateCollection(CollectionEntity collectionEntity);
    void updateCollection(int id, String name, short discount);
    void updateCollection(int id, String name);
    void updateCollection(int id, short discount);

    void deleteCollection(CollectionEntity collectionEntity);
    void deleteCollection(int id);
}
