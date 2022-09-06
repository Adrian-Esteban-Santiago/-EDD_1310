package arreglo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;

public class NominaADT {
    private String empresa;
    private Arreglo<Empleado> empleados;
    private String ubicacionArch;
   
    

    public NominaADT(String ubicacionArch, String empresa) throws IOException {
      
        this.empresa=empresa;
        this.ubicacionArch=ubicacionArch;
        int contador = 0;
        String line, fileContent = "";
        
        //Codigo para leer archivo
        BufferedReader bufferLectura = new BufferedReader(new FileReader(this.ubicacionArch));

        bufferLectura.readLine();
        while((line = bufferLectura.readLine()) != null) {
            fileContent += line + "\n";
            contador++;
        }
        
        bufferLectura.close();

        String[] saltoDeLinea = fileContent.split("\n");

        empleados = new Arreglo<>(contador);

        for(int i = 0; i < saltoDeLinea.length; i++) {
            
            String[] comas = saltoDeLinea[i].split(",");
            
            Empleado personaTemp = new Empleado();
            
            personaTemp.setAnioIngreso(parseInt(comas[0]));
            personaTemp.setNombre(comas[1]);
            personaTemp.setPaterno(comas[2]);
            personaTemp.setMaterno(comas[3]);
            personaTemp.setHorasExtra(parseInt(comas[4]));
            personaTemp.setSueldoBase(parseInt(comas[5]));
           personaTemp.setAnioIngreso(parseInt(comas[6]));
            empleados.setElemento(i, personaTemp);
        }
    }

    public void calcularSueldo() {
        for(int i = 0; i < empleados.getTamanio();i++){
            System.out.println(empleados.getElemento(i));
            System.out.println("Sueldo total: " + empleados.getElemento(i).calcularSueldo());
        }
    }

    public void obtenerMaxMin() {
        Empleado  empleadoMasAntiguo = empleados.getElemento(0);
        Empleado empleadoMenosAntiguo = empleados.getElemento(0);
       
        
        for (int i=0;i<=empleados.getTamanio();i++) {
            Empleado trabajadorActual = new Empleado();
         
            if(trabajadorActual.getAnioIngreso() > empleadoMasAntiguo.getAnioIngreso()) {
                empleadoMasAntiguo = trabajadorActual;
            }
            if(trabajadorActual.getAnioIngreso() < empleadoMenosAntiguo.getAnioIngreso()) {
               empleadoMenosAntiguo = trabajadorActual;
            }
        }

        System.out.println("Empleados con mayor y menor antiguedad en : " + empresa);
        System.out.println("Empleado con menor antiguedad: ");
        System.out.println(empleadoMenosAntiguo);
        System.out.println("Empleado con mayor antiguedad: ");
        System.out.println(empleadoMasAntiguo);
    }

}