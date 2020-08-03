package dao;


import entity.TypeEntity;

import java.util.List;
import java.util.Optional;

public interface TypeDao {

    List<TypeEntity> getTypesList();

    List<TypeEntity> getTypeWhereNameLike(String typeName);

    Optional<TypeEntity> getTypeById(int typeId);

    Optional<TypeEntity> getTypeByName(String typeName);

    void createType(TypeEntity typeEntity);

    void updateType(TypeEntity typeEntity);

    void deleteType(TypeEntity typeEntity);
}
