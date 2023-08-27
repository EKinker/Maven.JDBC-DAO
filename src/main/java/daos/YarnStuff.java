package daos;

import database.ConnectionFactory;
import models.Yarn;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class YarnStuff implements YarnDao {

    public Yarn getYarnResultSet(ResultSet rs) throws SQLException {

        Yarn yarn = new Yarn();
        yarn.setYarnId(rs.getInt("YarnID"));
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
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Yarn");

            List<Yarn> yarns = new ArrayList<>();

            while (rs.next()) {
                Yarn yarn = getYarnResultSet(rs);
                yarns.add(yarn);
            }
            return yarns;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean addYarn(Yarn yarn) {
        Connection connection = ConnectionFactory.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Yarn VALUES (NULL,?,?,?,?,?,?,?)");
            ps.setString(1, yarn.getBrand());
            ps.setString(2, yarn.getColor());
            ps.setString(3, yarn.getFiberType());
            ps.setString(4, yarn.getWeight());
            ps.setInt(5, yarn.getYardage());
            ps.setDouble(6, yarn.getPrice());
            ps.setInt(7, yarn.getQuantity());
            int i = ps.executeUpdate();

            if (i == 1) return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean updateYarn(Yarn yarn) {
        Connection connection = ConnectionFactory.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE Yarns SET Brand=?,Color=?,FiberType=?,WeightCategory=?,Yardage=?,Price=?,Quantity=? WHERE YarnID=?");
            ps.setString(1, yarn.getBrand());
            ps.setString(2, yarn.getColor());
            ps.setString(3, yarn.getFiberType());
            ps.setString(4, yarn.getWeight());
            ps.setInt(5, yarn.getYardage());
            ps.setDouble(6, yarn.getPrice());
            ps.setInt(7, yarn.getQuantity());
            int i = ps.executeUpdate();

            if (i == 1) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteYarn(int id) {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM Yarn WHERE YarnID=" + id);
            if (i == 1) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
