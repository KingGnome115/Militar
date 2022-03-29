/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package militar;

/**
 *
 * @author Reyno21
 */
public class CartillaMilitar {
    private String nombre; 
    private int clase;
    private Boolean remiso;

    public CartillaMilitar()
    {
    }

    public CartillaMilitar(String nombre, int clase)
    {
        this.nombre = nombre;
        this.clase = clase;
        if(clase == 18){
            this.remiso = false;
        }else{
            this.remiso = true;
        }
    }

    

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the clase
     */
    public int getClase()
    {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(int clase)
    {
        this.clase = clase;
    }

    /**
     * @return the remiso
     */
    public Boolean getRemiso()
    {
        return remiso;
    }

    /**
     * @param remiso the remiso to set
     */
    public void setRemiso(Boolean remiso)
    {
        this.remiso = remiso;
    }
    
}

