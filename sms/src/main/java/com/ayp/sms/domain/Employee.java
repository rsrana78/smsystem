package com.ayp.sms.domain;
/**
 * 
 * @author rana
 * 
 */

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Calendar;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Basic
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, name = "id")
	private Integer employeeId;

	@Basic
	@Column(nullable=false, name = "address")
	private String employeeAddress;

	@Basic
	@Column(nullable=false, name = "cnic")
	private String cnic;

	@Basic
	@Column(nullable=false, name = "contactNumber")
	private String contactNumber;

	@Basic
	@Column(nullable=false, name = "entryDate")
	private Timestamp entryDate;

	@Basic
	@Column(nullable=false, name = "fatherName")
	private String fatherName;

	@Basic
	@Column(nullable=false, name = "imagePath")
	private String imagePath;

	@Basic
	@Temporal(TemporalType.DATE)
	@Column(nullable=false, name = "joiningDate")
	private Calendar joiningDate;

	@Basic
	@Column(nullable=false, name = "name")
	private String employeeName;

	@Basic
	@Column(name = "reason")
	private String reason;

	@Basic
	@Column(nullable=false, name = "salary")
	private BigDecimal salary;

	@Basic
	@Column(nullable=false, name = "serving")
	private boolean serving;

	@Basic
	@Temporal(TemporalType.DATE)
	@Column(name = "terminationDate")
	private Calendar terminationDate;

	@Basic
	@OneToMany(mappedBy="attendanceDetailId")
	private List<AttendanceDetailEmployee> attendanceDetail;

	@OneToOne
	@JoinColumn(name="school", nullable=false)
	private Campus school;

	@OneToOne
	@JoinColumn(name="employeeType", nullable=false)
	private EmployeeType employeeType;

	@OneToOne
	@JoinColumn(name="qualification", nullable=false)
	private Qualification qualification;

	@Basic
	@OneToMany(mappedBy="id")
	private List<SalaryDetail> salaryDetails;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getCnic() {
		return cnic;
	}

	public void setCnic(String cnic) {
		this.cnic = cnic;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Timestamp getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Calendar getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Calendar joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean isServing() {
		return serving;
	}

	public void setServing(boolean serving) {
		this.serving = serving;
	}

	public Calendar getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Calendar terminationDate) {
		this.terminationDate = terminationDate;
	}

	public List<AttendanceDetailEmployee> getAttendanceDetail() {
		return attendanceDetail;
	}

	public void setAttendanceDetail(List<AttendanceDetailEmployee> attendanceDetail) {
		this.attendanceDetail = attendanceDetail;
	}

	public Campus getCampuses() {
		return school;
	}

	public void setCampuses(Campus school) {
		this.school = school;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public List<SalaryDetail> getSalaryDetails() {
		return salaryDetails;
	}

	public void setSalaryDetails(List<SalaryDetail> salaryDetails) {
		this.salaryDetails = salaryDetails;
	}

}