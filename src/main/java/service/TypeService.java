package service;

import entity.TypeEntity;

import java.util.List;
import java.util.Optional;

public interface TypeService {

    List<TypeEntity> getTypesList();

    List<TypeEntity> getTypeWhereNameLike(String typeName);

    Optional<TypeEntity> getType(int typeId);

    Optional<TypeEntity> getType(String typeName);

    void createType(TypeEntity typeEntity);
    void createType(String name, short discount);
    void createType(String name);

    void updateType(TypeEntity typeEntity);
    void updateType(int id, String name, short discount);
    void updateType(int id, String name);
    void updateType(int id, short discount);

    void deleteType(TypeEntity typeEntity);
    void deleteType(int id);
}
