package dao;

import entity.*;

public interface UserMethodInterface {
	public boolean register(User user);

	public boolean delete(User user);

	public boolean update(User user);

	public boolean login(User user);

	public boolean findByID(String userID);

	public boolean findAll();
}
