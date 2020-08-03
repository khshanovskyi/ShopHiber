package service.impl;

import dao.CollectionDao;
import dao.impl.CollectionDaoImpl;
import entity.CollectionEntity;
import service.CollectionService;

import java.util.List;
import java.util.Optional;

public class CollectionServiceImpl implements CollectionService {

    private final CollectionDao collectionDao;

    public CollectionServiceImpl() { collectionDao = new CollectionDaoImpl(); }

    @Override
    public List<CollectionEntity> getCollectionsList() {
        return collectionDao.getCollectionsList();
    }

    @Override
    public List<CollectionEntity> getCollectionWhereNameLike(String collectionName) {
        return collectionDao.getCollectionWhereNameLike(collectionName);
    }

    @Override
    public Optional<CollectionEntity> getCollection(int collectionId) {
        return collectionDao.getCollectionById(collectionId);
    }

    @Override
    public Optional<CollectionEntity> getCollection(String collectionName) {
        return collectionDao.getCollectionByName(collectionName);
    }

    @Override
    public void createCollection(CollectionEntity collectionEntity) {
        collectionDao.createCollection(collectionEntity);
    }
    @Override
    public void createCollection(String name, short discount) {
        collectionDao.createCollection(createCollectionEntity(name,discount));
    }
    @Override
    public void createCollection(String name) {
        collectionDao.createCollection(createCollectionEntity(name));
    }

    @Override
    public void updateCollection(CollectionEntity collectionEntity) {
        collectionDao.updateCollection(collectionEntity);
    }
    @Override
    public void updateCollection(int id, String name, short discount) {
        Optional<CollectionEntity> oldCollection = collectionDao.getCollectionById(id);
        oldCollection.ifPresent(collectionEntity -> collectionDao.updateCollection(createCollectionEntity(id,name,discount)));
    }
    @Override
    public void updateCollection(int id, String name) {
        Optional<CollectionEntity> oldCollection = collectionDao.getCollectionById(id);
        oldCollection.ifPresent(collectionEntity -> collectionDao.updateCollection(createCollectionEntity(id,name,collectionEntity.getDiscount())));
    }
    @Override
    public void updateCollection(int id, short discount) {
        Optional<CollectionEntity> oldCollection = collectionDao.getCollectionById(id);
        oldCollection.ifPresent(collectionEntity -> collectionDao.updateCollection(createCollectionEntity(id,collectionEntity.getName(),discount)));
    }

    @Override
    public void deleteCollection(CollectionEntity collectionEntity) {
        collectionDao.deleteCollection(collectionEntity);
    }
    @Override
    public void deleteCollection(int id) {
        Optional<CollectionEntity> oldCollection = collectionDao.getCollectionById(id);
        oldCollection.ifPresent(collectionDao::deleteCollection);
    }

    private CollectionEntity createCollectionEntity(String name) {
        return CollectionEntity.builder().name(name).build();
    }

    private CollectionEntity createCollectionEntity(String name, short discount) {
        return CollectionEntity.builder().name(name).discount(discount).build();
    }

    private CollectionEntity createCollectionEntity(int id, String name, short discount) {
        return CollectionEntity.builder().id(id).name(name).discount(discount).build();
    }
}
