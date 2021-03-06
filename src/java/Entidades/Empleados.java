package Entidades;
// Generated 28-feb-2020 17:43:35 by Hibernate Tools 4.3.1



/**
 * Empleados generated by hbm2java
 */
public class Empleados  implements java.io.Serializable {


     private int id;
     private Departamento departamento;
     private String nombre;
     private String apellidos;
     private String fechanac;

    public Empleados() {
    }

	
    public Empleados(int id, Departamento departamento) {
        this.id = id;
        this.departamento = departamento;
    }
    public Empleados(int id, Departamento departamento, String nombre, String apellidos, String fechanac) {
       this.id = id;
       this.departamento = departamento;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.fechanac = fechanac;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFechanac() {
        return this.fechanac;
    }
    
    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }




}


