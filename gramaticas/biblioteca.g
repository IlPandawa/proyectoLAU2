grammar biblioteca;

inicio: seccion+;

// Por seccion debe de procesar cada tipo de instancia (libro, usuario, prestamo)
seccion
    : 'Libros' WS? registrosLibros
    | 'Usuarios' WS? registrosUsuarios
    | 'Prestamos' WS? registrosPrestamos
    ;

// Registros de Libros
registrosLibros: (libro)+;

libro
    : id=INT COMMA
      nombre=STRING COMMA
      editorial=STRING COMMA
      autor=STRING COMMA
      genero=STRING COMMA
      paisAutor=STRING COMMA
      numeroPaginas=INT COMMA
      anioEdicion=DATE COMMA
      precio=DOUBLE
    {
        // Generar RDF para el libro
        System.out.println("<!-- Instancia libro -->");
        System.out.println("<rdf:Description rdf:about=\"#codigoLibro "+$id.text+"\">");
        System.out.println("  <rdf:type rdf:resource=\"#Libro\" />");
        System.out.println("  <biblioteca:codigoLibro>"+$id.text+"</biblioteca:codigoLibro>");
        System.out.println("  <biblioteca:nombreLibro>"+$nombre.text+"</biblioteca:nombreLibro>");
        System.out.println("  <biblioteca:editorial>"+$editorial.text+"</biblioteca:editorial>");
        System.out.println("  <biblioteca:autor>"+$autor.text+"</biblioteca:autor>");
        System.out.println("  <biblioteca:genero>"+$genero.text+"</biblioteca:genero>");
        System.out.println("  <biblioteca:paisAutor>"+$paisAutor.text+"</biblioteca:paisAutor>");
        System.out.println("  <biblioteca:numeroPaginas>"+$numeroPaginas.text+"</biblioteca:numeroPaginas>");
        System.out.println("  <biblioteca:anioEdicion>"+$anioEdicion.text+"</biblioteca:anioEdicion>");
        System.out.println("  <biblioteca:precioLibro>"+$precio.text+"</biblioteca:precioLibro>");
        System.out.println("</rdf:Description>\n");
    };

// Registros de Usuarios
registrosUsuarios: (usuario)+;

usuario: 
      id=INT COMMA
      nombre=STRING COMMA
      apellido=STRING COMMA
      ine=INT COMMA
      domicilio=STRING COMMA
      estado=STRING COMMA
      municipio=STRING COMMA
      nacimiento=DATE
    {
        // Generar RDF para el usuario
        System.out.println("<!-- Instancia usuario -->");
        System.out.println("<rdf:Description rdf:about=\"#"+$id.text+"\">");
        System.out.println("  <rdf:type rdf:resource=\"#Usuario\" />");
        System.out.println("  <biblioteca:codigoUsuario>"+$id.text+"</biblioteca:codigoUsuario>");
        System.out.println("  <biblioteca:nombre>"+$nombre.text+"</biblioteca:nombre>");
        System.out.println("  <biblioteca:apellidos>"+$apellido.text+"</biblioteca:apellidos>");
        System.out.println("  <biblioteca:noIdentificacion>"+$ine.text+"</biblioteca:noIdentificacion>");
        System.out.println("  <biblioteca:domicilio>"+$domicilio.text+"</biblioteca:domicilio>");
        System.out.println("  <biblioteca:estado>"+$estado.text+"</biblioteca:estado>");
        System.out.println("  <biblioteca:municipio>"+$municipio.text+"</biblioteca:municipio>");
        System.out.println("  <biblioteca:nacimiento>"+$nacimiento.text+"</biblioteca:nacimiento>");
        System.out.println("</rdf:Description>\n");
    };

// Registros de Préstamos
registrosPrestamos: (prestamo)+;

prestamo:
      numeroPedido=INT COMMA
      codigoLibro=INT COMMA
      codigoUsuario=INT COMMA
      fechaSalida=DATE COMMA
      fechaMaxima=DATE COMMA
      fechaDevolucion=DATE
    {
        // Generar RDF para el préstamo
        System.out.println("<!-- Instancia prestamo -->");
        System.out.println("<rdf:Description rdf:about=\"#numeroPedido "+$codigoLibro.text+"\">");
        System.out.println("  <rdf:type rdf:resource=\"#Prestamo\" />");
        System.out.println("  <biblioteca:codigoLibro>"+$codigoLibro.text+"</biblioteca:codigoLibro>");
        System.out.println("  <biblioteca:codigoUsuario>"+$codigoUsuario.text+"</biblioteca:codigoUsuario>");
        System.out.println("  <biblioteca:fechaSalida>"+$fechaSalida.text+"</biblioteca:fechaSalida>");
        System.out.println("  <biblioteca:fechaMaxima>"+$fechaMaxima.text+"</biblioteca:fechaMaxima>");
        System.out.println("  <biblioteca:fechaDevolucion>"+$fechaDevolucion.text+"</biblioteca:fechaDevolucion>");
        System.out.println("</rdf:Description>\n");
    };

INT: ('0' .. '9')+;
DOUBLE: INT '.' INT;
STRING: ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ')*;
DATE: INT '/' INT '/' INT;
COMMA: ',';
WS: (' ' | '\n' | '\t' | '\r')+ {$channel=HIDDEN; };
