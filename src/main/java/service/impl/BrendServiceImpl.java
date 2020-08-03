package service.impl;

import dao.BrendDao;
import dao.impl.BrendDaoImpl;
import entity.BrendEntity;
import lombok.SneakyThrows;
import service.BrendService;

import java.util.List;
import java.util.Optional;

public class BrendServiceImpl implements BrendService {

    private final BrendDao brendDao;

    public BrendServiceImpl() {
        brendDao = new BrendDaoImpl();
    }


    @Override
    public List<BrendEntity> getBrendsList() {
        return brendDao.getBrendsList();
    }


    @Override
    public List<BrendEntity> getBrendWhereNameLike(String brendName) {
        return brendDao.getBrendWhereNameLike(brendName);
    }


    @Override
    public Optional<BrendEntity> getBrend(int brendId) {
       return brendDao.getBrendById(brendId);
    }


    @Override
    public Optional<BrendEntity> getBrend(String brendName) {
        return brendDao.getBrendByName(brendName);
    }


    @Override
    public void createBrend(BrendEntity brendEntity) {
        brendDao.createBrend(brendEntity);
    }
    @Override
    public void createBrend(String name, short discount) {
        brendDao.createBrend(createBrendEntity(name,discount));
    }
    @Override
    public void createBrend(String name) {
        brendDao.createBrend(createBrendEntity(name));
    }


    @Override
    public void updateBrend(BrendEntity brendEntity) {
        brendDao.updateBrend(brendEntity);
    }
    @Override
    @SneakyThrows
    public void updateBrend(int id, String name, short discount) {
        if (brendDao.getBrendById(id).isPresent()){
            brendDao.updateBrend(createBrendEntity(id,name,discount));
        }
    }
    @Override
    public void updateBrend(int id, String name) {
        Optional<BrendEntity> oldBrendEntity  = brendDao.getBrendById(id);
        oldBrendEntity.ifPresent(brendEntity -> brendDao.updateBrend(createBrendEntity(id, name, brendEntity.getDiscount())));
    }
    @Override
    public void updateBrend(int id, short discount) {
        Optional<BrendEntity> oldBrendEntity  = brendDao.getBrendById(id);
        oldBrendEntity.ifPresent(brendEntity -> brendDao.updateBrend(createBrendEntity(id, oldBrendEntity.get().getName(),discount)));
    }


    @Override
    public void deleteBrend(BrendEntity brendEntity) {
        brendDao.deleteBrend(brendEntity);
    }
    @Override
    public void deleteBrend(int id) {
        Optional<BrendEntity> oldBrendEntity  = brendDao.getBrendById(id);
        oldBrendEntity.ifPresent(brendDao :: deleteBrend);
    }


    private BrendEntity createBrendEntity(String name){
        return BrendEntity.builder().name(name).build();
    }

    private BrendEntity createBrendEntity(String name, short discount){
        return BrendEntity.builder().name(name).discount(discount).build();
    }

    private BrendEntity createBrendEntity(int id, String name, short discount){
        return BrendEntity.builder().id(id).name(name).discount(discount).build();
    }
}
