package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javabean.Department;
import javabean.Employee;

public class EmployeeDaoImplList implements IEmployeeDao{
	
	private List<Employee> lista;
	private IDepartmentDao iDepartmentDao;
	private IJobDao  iJobDao;
	
	public EmployeeDaoImplList() {
		lista = new ArrayList<Employee>();
		iDepartmentDao = new DepartmentDaoImplList();
		iJobDao = new JobDaoImplList();
		
		cargarDatos();
		
		
	}
	
	private void cargarDatos() {
		lista.add(new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "678678678", LocalDate.of(1996, 7, 7),
								iJobDao.findById("IT_PROG"), 35_000, 0.2,  iDepartmentDao.findById(30)));
		lista.add(new  Employee(115, "Ana", "Koo", "ana@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("IT_PROG"), 35_000, 0.2,  iDepartmentDao.findById(30)));
		lista.add(new  Employee(116, "carlos", "Colmenares", "carlos@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("AD_PRESS"), 135_000, 0.2,  iDepartmentDao.findById(20)));
		lista.add(new  Employee(117, "Fernando", "Alvarez", "fernando@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("ATT_CL"), 37_000, 0.4,  iDepartmentDao.findById(40)));
		lista.add(new  Employee(118, "Jaime", "Martinez", "jaime@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("ATT_CL"), 24_000, 0.4,  iDepartmentDao.findById(40)));
		lista.add(new  Employee(119, "Laura", "Fernandez", "laura@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("ATT_CL"), 38_000, 0.4,  iDepartmentDao.findById(40)));
		
		
	}

	@Override
	public Employee findById(Integer atributoPk) {
		for (Employee ele: lista) {
			if (ele.getEmployeeId() == atributoPk)
				return ele;
		}
		
		return null;
	}

	@Override
	public int insertOne(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> findAll() {
		
		return lista;
	}

	@Override
	public List<Employee> porDepartamento(int departmentId) {
		List<Employee> aux = new ArrayList<Employee>();
		
		for (Employee employee : lista) {
			if(employee.getDepartment().getDepartmentId() == departmentId)
				aux.add(employee);
		}
		return aux;
	}

	@Override
	public List<Employee> porTrabajo(String jobId) {
		List<Employee> aux = new ArrayList<Employee>();
		
		for (Employee employee : lista) {
			if(employee.getJob().getJobId() == jobId)
				aux.add(employee);
		}
		return aux;
	}

	
	

	@Override
	public List<Employee> fueraSalario() {
		List<Employee> aux = new ArrayList<Employee>();
		for(Employee employee : lista) {
			if((employee.getSalary()< employee.getJob().getMinSalary()) || employee.getSalary()> employee.getJob().getMaxSalary())
				aux.add(employee);
		}
		return aux;
	}

	

	@Override
	public double calcularMasaSalarial() {
			double total=0;
			for(Employee employee : findAll()) {
				total += employee.getSalary();
			}
			return total;
		}

	@Override
	public double masaSalarialPorDep(int department) {
		double total=0;
		for (Employee employee : porDepartamento(department)) {
			total += employee.getSalary();
		}
		return total;
	}

	

	
		
	}

	
	

