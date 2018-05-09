package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.*;

public class CRUDWorker 
{

	private EntityManagerFactory entityManagerFactory;
	
	CRUDWorker()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public void createWorker(Worker worker)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(worker);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	@Override
	public void finalize()
	{
		entityManagerFactory.close();
	}
	
	public void deleteWorker(int id)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Worker worker = entityManager.find( Worker.class, id );
		entityManager.remove(worker);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void readWorker(int id)
	{
	      EntityManager entityManager = entityManagerFactory.createEntityManager();
	      Worker worker = entityManager.find( Worker.class, id );

	      System.out.println("Worker EMPNO = " + worker.getEmpno());
	      System.out.println("Worker ENAME = " + worker.getEname());
	      System.out.println("Worker SAL = " + worker.getSal());
	      System.out.println("Worker JOB = " + worker.getJob());
	      System.out.println("Worker MGR = " + worker.getMgr());
	      System.out.println("Worker COMM = " + worker.getComm());
	      System.out.println("Worker HIREDATE = " + worker.getHiredate());
	      System.out.println("Worker DEPTNO = " + worker.getDeptno());
	      
	}
	
	public void updateWorker(int id)
	{
		   
		  int salary = 0;
		  BigDecimal bg = new BigDecimal(100);
		  
		  //wyszukanie pracownika
		  EntityManager entityManager = entityManagerFactory.createEntityManager( );
	      entityManager.getTransaction( ).begin( );
	      Worker worker = entityManager.find( Worker.class, id );
	      
	      //wypis przed updatem pensji
	      System.out.println( worker );
	      
	      //tworzenie pensji
	      bg = worker.getSal();
	      salary = bg.intValue();
	      salary = (int)1.1*salary; // podniesienie o 10% pensji
	      BigDecimal bg2 = new BigDecimal(salary); // utworzenie obiektu klasy BigDecimal z pensji

	      //ustawianie pensji
	      worker.setSal(bg2);
	      entityManager.getTransaction( ).commit( );
	      
	      //after update
	      System.out.println( worker );
	      entityManager.close();
	}
	
}