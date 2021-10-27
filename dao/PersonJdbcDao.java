package com.fatou.demoJpa14.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;





@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate tima;
	
	public List<Person> findAll(){
		return tima.query("select * from person",
				new BeanPropertyRowMapper(Person.class));
	}
	
	public Person findById(int id) {
		return tima.queryForObject
				("select * from person where id=?", new Object[] {id},
						new BeanPropertyRowMapper<Person>(Person.class));
	}
	public int deleteById(int id) {
		return tima.update
				("delete from person where id=?" , new  Object[] {id});
	}
	public int insert(Person person) {
		return tima.update(
				"insert into person(id, name, location, birth_date)"
				+ "values(?,?,?,?)",
				new  Object[] {
						person.getId(), person.getName(),
						person.getLocation(), new Timestamp(person.getBirthday().getTime()) });
				}
	public int update(Person person) {
		return tima.update(
			" update person " 
          	+ " set name = ?, location = ?, birth_date = ? "
            	+ " where id = ?",
	new Object[] { person.getName() , person.getLocation(), new Timestamp(person.getBirthday().getTime()) ,
			person.getId() });
			
	}

}
