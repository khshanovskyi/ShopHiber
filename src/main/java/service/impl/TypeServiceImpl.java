package service.impl;

import dao.TypeDao;
import dao.impl.TypeDaoImpl;
import entity.TypeEntity;
import service.TypeService;

import java.util.List;
import java.util.Optional;

public class TypeServiceImpl implements TypeService {

    private final TypeDao typeDao;

    public TypeServiceImpl() {typeDao = new TypeDaoImpl(); }

    @Override
    public List<TypeEntity> getTypesList() {
        return typeDao.getTypesList();
    }

    @Override
    public List<TypeEntity> getTypeWhereNameLike(String typeName) {
        return typeDao.getTypeWhereNameLike(typeName);
    }

    @Override
    public Optional<TypeEntity> getType(int typeId) {
        return typeDao.getTypeById(typeId);
    }

    @Override
    public Optional<TypeEntity> getType(String typeName) {
        return typeDao.getTypeByName(typeName);
    }

    @Override
    public void createType(TypeEntity typeEntity) {
        typeDao.createType(typeEntity);
    }
    @Override
    public void createType(String name, short discount) {
        typeDao.createType(createTypeEntity(name,discount));
    }
    @Override
    public void createType(String name) {
        typeDao.createType(createTypeEntity(name));
    }

    @Override
    public void updateType(TypeEntity typeEntity) {
        typeDao.updateType(typeEntity);
    }
    @Override
    public void updateType(int id, String name, short discount) {
        Optional<TypeEntity> oldTypeEntity = typeDao.getTypeById(id);
        oldTypeEntity.ifPresent(typeEntity -> typeDao.updateType(createTypeEntity(id,name,discount)));
    }
    @Override
    public void updateType(int id, String name) {
        Optional<TypeEntity> oldTypeEntity = typeDao.getTypeById(id);
        oldTypeEntity.ifPresent(typeEntity -> typeDao.updateType(createTypeEntity(id,name,typeEntity.getDiscount())));
    }
    @Override
    public void updateType(int id, short discount) {
        Optional<TypeEntity> oldTypeEntity = typeDao.getTypeById(id);
        oldTypeEntity.ifPresent(typeEntity -> typeDao.updateType(createTypeEntity(id,typeEntity.getName(),discount)));
    }

    @Override
    public void deleteType(TypeEntity typeEntity) {
        typeDao.deleteType(typeEntity);
    }
    @Override
    public void deleteType(int id) {
        Optional<TypeEntity> oldTypeEntity = typeDao.getTypeById(id);
        oldTypeEntity.ifPresent(typeDao :: deleteType);
    }

    private TypeEntity createTypeEntity(String name){
        return TypeEntity.builder().name(name).build();
    }

    private TypeEntity createTypeEntity(String name, short discount){
        return TypeEntity.builder().name(name).discount(discount).build();
    }

    private TypeEntity createTypeEntity(int id, String name, short discount){
        return TypeEntity.builder().id(id).name(name).discount(discount).build();
    }
}
