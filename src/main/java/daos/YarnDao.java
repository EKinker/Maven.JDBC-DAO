package daos;

import models.Yarn;

import java.util.List;

public interface YarnDao {
    Yarn getYarn(int id);
    List<Yarn> getAllYarn();
    //List<Yarn> getYarnByBrand(String brand);  //Try this later
    boolean addYarn(Yarn yarn);
    boolean updateYarn(Yarn yarn);
    boolean deleteYarn(int id);

}
