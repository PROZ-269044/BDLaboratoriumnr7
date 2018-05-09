package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the WORKERS database table.
 * 
 */
@Entity  
@Table(name="WORKERS")
@NamedQuery(name="Worker.findAll", query="SELECT w FROM Worker w")
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;
	private BigDecimal comm;
	private BigDecimal deptno;
	private BigDecimal empno;
	private String ename;
	private Date hiredate;
	private String job;
	private BigDecimal mgr;
	private BigDecimal sal;

	public Worker() {
	}


	@Column(precision=7, scale=2)
	public BigDecimal getComm() {
		return this.comm;
	}

	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}


	@Column(precision=2)
	public BigDecimal getDeptno() {
		return this.deptno;
	}

	public void setDeptno(BigDecimal deptno) {
		this.deptno = deptno;
	}


	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(precision=4)
	public BigDecimal getEmpno() {
		return this.empno;
	}

	
	public void setEmpno(BigDecimal empno) {
		this.empno = empno;
	}


	@Column(length=6)
	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}


	@Temporal(TemporalType.DATE)
	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}


	@Column(length=8)
	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	
	

	@Column(precision=4)
	public BigDecimal getMgr() {
		return this.mgr;
	}

	public void setMgr(BigDecimal mgr) {
		this.mgr = mgr;
	}


	@Column(precision=7, scale=2)
	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	
}