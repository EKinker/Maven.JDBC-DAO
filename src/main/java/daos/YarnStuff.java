package daos;

import database.ConnectionFactory;
import models.Yarn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class YarnStuff implements YarnDao {

    public Yarn getYarnResultSet(ResultSet rs) throws SQLException {

        Yarn yarn = new Yarn();
        yarn.setYarnID(rs.getInt("YarnID"));
        yarn.setBrand(rs.getString("Brand"));
        yarn.setColor(rs.getString("Color"));
        yarn.setPrice(rs.getDouble("Price"));
        yarn.setQuantity(rs.getInt("Quantity"));
        yarn.setFiberType(rs.getString("FiberType"));
        yarn.setYardage(rs.getInt("Yardage"));
        yarn.setWeight(rs.getString("WeightCategory"));

        return yarn;
    }


    @Override
    public Yarn getYarn(int id) {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Yarn WHERE YarnID=" + id);
            if (rs.next()) {
                return getYarnResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Yarn> getAllYarn() {
        return null;
    }

    @Override
    public List<Yarn> getYarnByBrand(String brand) {
        return null;
    }

    @Override
    public boolean addYarn(Yarn yarn) {
        return false;
    }

    @Override
    public boolean updateYarn(Yarn yarn) {
        return false;
    }

    @Override
    public boolean deleteYarn(int id) {
        return false;
    }
}
