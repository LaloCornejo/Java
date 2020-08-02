public class Fecha {
    
    private String mes;
    private String dia;
    private String año;

    public Fecha (String a, String b, String c ) {

        mes = a;
        dia = b;
        año = c;
    }

    public void setMes ( String setMes ) {
        mes = setMes ;
    }

    public String getMes ( ) {
        return mes ;
    }

    public void setDia ( String setDia ) {
        dia = setDia ;
    }
    public String getDia ( ) {
        return dia ;
    }

    public void setAño ( String setAño ) {
        año = setAño ;
    }

    public String getAño ( ) {
        return año ;
    
    }

    public String mostrarFecha( ) {
        return getMes() + "/" + getDia() + "/" + getAño();
    }

}