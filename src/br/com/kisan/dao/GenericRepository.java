package br.com.kisan.dao;

import java.util.List;

public interface GenericRepository<T> {
	
	public void save(T entity);

	public void delete(T entity);

	public void update(T entity);

	public T find(Object id);

	public List<T> find();

	public List<T> find(String query);

	public void beginTransaction();

	public void commit();

	public void rollback();

	public void close();
}