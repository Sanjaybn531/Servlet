package com.xworkz.ott.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.xworkz.ott.dto.OttDTO;

@Component
public class OttDAOImpl implements OttDAO {

	@Override
	public boolean save(OttDTO dto) {
		String sql = "insert into ott values(?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException f) {
			f.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm_march", "root",
				"Xworkzodc@123")) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, dto.getOttName());
			statement.setString(2, dto.getRegion());
			statement.setString(3, dto.getLanguage());
			statement.setString(4, dto.getSubscriptionPlan());
			statement.setString(5, dto.getUsers());
			statement.setInt(6, dto.getSince());
			statement.setBoolean(7, dto.isActivePlan());

			int row = statement.executeUpdate();
			System.out.println(row);
			return row > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
