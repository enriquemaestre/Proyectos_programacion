package testactividad;


import javabean.Location;
import negocio.ILocationDao;
import negocio.LocationDaoImplList;

public class TestLocationDaoActividad {
	
	public static void main(String[] args) {
		ILocationDao iLocationDao = new LocationDaoImplList();
		
		System.out.println("BUSQUEDA POR CIUDAD");
		for(Location ele : iLocationDao.buscarPorCity("Madrid") )
			System.out.println(ele);
		
		System.out.println("BUSQUEDA POR CODIGO POSTAL");
		for(Location ele : iLocationDao.buscarPorPostalCode("28008"))
			System.out.println(ele);
		
		System.out.println("BUSQUEDA POR PAIS");
		for(Location ele : iLocationDao.buscarPorPais("ES"))
			System.out.println(ele);
		
		
		
		
	}
}
