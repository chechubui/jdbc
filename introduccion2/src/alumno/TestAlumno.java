package alumno;

public class TestAlumno {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Juan","11223344T", 15);
		System.out.println(a1);
		Alumno a2 = new Alumno();
		a2.setNombre("Pepe");
		a2.setNif("44556677C");
		a2.setEdad(19);
		System.out.println(a1+" Es mayor de edad?"+a1.esMayorEdad());
		System.out.println(a2);
	}

}
