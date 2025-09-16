package br.com.unicuritiba.repository;

import java.util.ArrayList;

public interface Repository {
	
	public void save(String item);
	
	public void delete(String item);
	
	public void update(String item, int position);
	
	public String get(int position);
	
	public ArrayList<String> getAll();

}
