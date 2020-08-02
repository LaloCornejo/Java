public enum Libro {
    JHTP6( "Java How to Program 6e", "2005" ),
    CHTP4( "C How to Program 4e", "2004" ),
    IW3HTP3(  "Internet & World Wide Web How to Program 3e", "2004" ),
    CPPHTP4( "C++ How to program 4e", "2003" ),
    VHTP2( "Visual Basic .NET How to program 2e", "2002" ),
    CSHARPHTP( "C# How to Program", "2002" );

    private final String titulo;
    private final String anioCopyright;
    
    Libro( String tituloLibro, String anio ){
        titulo = tituloLibro;
        anioCopyright = anio; 
    }
    public String obtenerTitulo(){
        return titulo;
    }
    public String obtenerAnioCopyright(){
        return anioCopyright;
    }
}