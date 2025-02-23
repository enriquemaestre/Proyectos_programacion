package testactividad;

import javabean.Employee;
import negocio.DepartmentDaoImplList;
import negocio.EmployeeDaoImplList;
import negocio.IDepartmentDao;
import negocio.IEmployeeDao;

public class TestEmployeeDaoActividad {
	public static void main(String[] args) {
		IEmployeeDao iEmployeeDao = new EmployeeDaoImplList();
		IDepartmentDao iDepartmentDao = new DepartmentDaoImplList();
		
		System.out.println("BUSQUEDA DE TODOS");
		
			System.out.println(iEmployeeDao.findAll());
		
		System.out.println("BUSQUEDA POR DEPARTAMENTO");
		for(Employee ele: iEmployeeDao.porDepartamento(40))
			System.out.println(ele);
		
		System.out.println("BUSQUEDA POR TRABAJO");
		for(Employee ele: iEmployeeDao.porTrabajo("AD_PRESS"))
			System.out.println(ele);
		
		
		
		System.out.println("BUSQUEDA POR FUERA SALARIO");
		for(Employee ele: iEmployeeDao.fueraSalario())
			System.out.println(ele);
		
		
		
		System.out.println("CALCULO DE MASA SALARIAL");
		double totalSalarios = iEmployeeDao.calcularMasaSalarial();
		System.out.println(totalSalarios);
		
		System.out.println("CALCULO DE MASA SALARIAL POR DEPARTAMENTO");
		double salarioPorDep = iEmployeeDao.masaSalarialPorDep(40);
		System.out.println(salarioPorDep);
	}
	
}
